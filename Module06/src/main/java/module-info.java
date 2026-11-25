module com.example.module06 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.module06 to javafx.fxml, javafx.base;
    exports com.example.module06;
}