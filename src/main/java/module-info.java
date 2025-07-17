module com.example.comp1011spring2025thursdays5pm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.comp1011spring2025thursdays5pm to javafx.fxml;
    exports com.example.comp1011spring2025thursdays5pm;
}