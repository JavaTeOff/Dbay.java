package example;

import example.runner.org.javate.dbay.ui.DbayDOM;

public class Project {
    public Project() {
        DbayDOM.parse(System.getProperty("user.dir") + "/src/example", "App.dbay");
    }
}
