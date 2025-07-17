module com.example.comp1011spring2025thursdays5pm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.comp1011spring2025thursdays5pm to javafx.fxml, com.google.gson;
    exports com.example.comp1011spring2025thursdays5pm;
}