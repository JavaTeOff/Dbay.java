package example.runner.org.javate.dbay.ui;

import example.runner.org.javate.dbay.ui.components.DbayComponent;
import example.runner.org.javate.dbay.ui.components.DbayLabel;

import javax.swing.*;
import java.io.*;

public class DbayDOM {

    public static void parse(String dbaycode) {

    }
    public static void parse(String path, String filename) {
        JFrame frame = new JFrame();
        frame.setTitle("Dbay example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path + "/" + filename)));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("<Component src=\"") && line.endsWith("/>")) {
                    String componentpath = line.replace("<Component src=", "").replace("\"", "").replace(" ", "").replace("/>", "");
                    if (componentpath.startsWith("./")) {
                        DbayComponent component = parseComponent(new File(path + "/" + componentpath.replace("./", "") + ".component.dbay"));
                        frame.add(component);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        frame.setVisible(true);
    }

    public static DbayComponent parseComponent(File file) {
        DbayComponent component = new DbayComponent();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("<Label>")) {
                    String innerText = line.replace("<Label>", "").replace("</Label>", "");
                    DbayLabel label = new DbayLabel(innerText);
                    component.add(label);
                } else if (line.startsWith("<Label Style={")) {
                    String innerText = line.substring(line.indexOf("}>"), line.indexOf("</")).replace("}>", "");
                    String styles = line.replace("<Label Style={", "").replace("}>", "").replace(innerText, "").replace("</Label>" , "");
                    DbayLabel label = new DbayLabel(innerText);
                    label.parseStyles(styles.split(";"));
                    //System.out.print(styles);
                    component.add(label);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return component;
    }
}
