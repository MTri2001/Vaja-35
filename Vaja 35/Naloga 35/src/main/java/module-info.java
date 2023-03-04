module com.matictrilar.gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.matictrilar.gui to javafx.fxml;
    exports com.matictrilar.gui;
}
