package example.runner.org.javate.dbay.ui.components;

import javax.swing.*;
import java.awt.*;

public class DbayLabel extends JLabel {
    public DbayLabel(String text) {
        this.setText(text);
    }

    // used for each style inside the Style attribute
    public void parseStyle(String style) {
        if (style.startsWith("FontSize(")) {
            int fontsize = Integer.parseInt(style.replace("FontSize(", "").replace(")", ""));
            this.setFont(new Font("Times New Roman", Font.PLAIN, fontsize));
        } else if (style.contains("Color(Red") || style.contains("Colour(Red")) {
            this.setForeground(Color.red);
        } else if (style.contains("Color(Orange") || style.contains("Colour(Orange")) {
            this.setForeground(Color.orange);
        } else if (style.contains("Color(Yellow") || style.contains("Colour(Yellow")) {
            this.setForeground(Color.yellow);
        } else if (style.contains("Color(YellowGreen") || style.contains("Colour(YellowGreen")) {
            this.setForeground(new Color(155, 255, 0));
        } else if (style.contains("Color(Green") || style.contains("Colour(Green")) {
            this.setForeground(Color.green);
        } else if (style.contains("Color(GreenBlue") || style.contains("Colour(GreenBlue")) {
            this.setForeground(new Color(0, 255, 55));
        } else if (style.contains("Color(LightBlue") || style.contains("Colour(LightBlue")) {
            this.setForeground(new Color(0, 255, 255));
        } else if (style.contains("Color(Cyan") || style.contains("Colour(Cyan")) {
            this.setForeground(new Color(0, 155, 255));
        } else if (style.contains("Color(Blue") || style.contains("Colour(Blue")) {
            this.setForeground(Color.blue);
        } else if (style.contains("Color(Purple") || style.contains("Colour(Purple")) {
            this.setForeground(new Color(155, 0, 255));
        } else if (style.contains("Color(Magenta") || style.contains("Colour(Magenta")) {
            this.setForeground(new Color(255, 0, 255));
        } else if (style.contains("Color(MagentaRed") || style.contains("Colour(MagentaRed")) {
            this.setForeground(new Color(255, 0, 155));
        }
    }

    // used for the whole attribute
    public void parseStyles(String[] styles) {
        for (String style : styles) {
            if (style.startsWith("FontSize(")) {
                int fontsize = Integer.parseInt(style.replace("FontSize(", "").replace(")", ""));
                this.setFont(new Font("Times New Roman", Font.PLAIN, fontsize));
            } else if (style.contains("Color(Red") || style.contains("Colour(Red")) {
                this.setForeground(Color.red);
            } else if (style.contains("Color(Orange") || style.contains("Colour(Orange")) {
                this.setForeground(Color.orange);
            } else if (style.contains("Color(Yellow") || style.contains("Colour(Yellow")) {
                this.setForeground(Color.yellow);
            } else if (style.contains("Color(YellowGreen") || style.contains("Colour(YellowGreen")) {
                this.setForeground(new Color(155, 255, 0));
            } else if (style.contains("Color(Green") || style.contains("Colour(Green")) {
                this.setForeground(Color.green);
            } else if (style.contains("Color(GreenBlue") || style.contains("Colour(GreenBlue")) {
                this.setForeground(new Color(0, 255, 55));
            } else if (style.contains("Color(LightBlue") || style.contains("Colour(LightBlue")) {
                this.setForeground(new Color(0, 255, 255));
            } else if (style.contains("Color(Cyan") || style.contains("Colour(Cyan")) {
                this.setForeground(new Color(0, 155, 255));
            } else if (style.contains("Color(Blue") || style.contains("Colour(Blue")) {
                this.setForeground(Color.blue);
            } else if (style.contains("Color(Purple") || style.contains("Colour(Purple")) {
                this.setForeground(new Color(155, 0, 255));
            } else if (style.contains("Color(Magenta") || style.contains("Colour(Magenta")) {
                this.setForeground(new Color(255, 0, 255));
            } else if (style.contains("Color(MagentaRed") || style.contains("Colour(MagentaRed")) {
                this.setForeground(new Color(255, 0, 155));
            }
        }
    }
}
