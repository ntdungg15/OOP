module com.example.eda_withjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eda_withjavafx to javafx.fxml;
    exports com.example.eda_withjavafx;
}