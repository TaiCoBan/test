module com.utc.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.utc.test to javafx.fxml;
    exports com.utc.test;
}