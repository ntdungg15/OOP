package com.example.eda_withjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main_Dictionary extends Application {
    Stage window;
    Scene scene1, scene2;
    private Label wordLabel;
    private Label meaningLabel;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("English Learning App");

        wordLabel = new Label("English Word");
        meaningLabel = new Label();

        Button showMeaningButton = new Button("Xem nghĩa");
        showMeaningButton.setOnAction(e -> showMeaning());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(wordLabel, showMeaningButton, meaningLabel);

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showMeaning() {
        // Trong phần này, bạn có thể thực hiện logic để lấy nghĩa của từ tiếng Anh và hiển thị nó
        // Đây chỉ là một ví dụ đơn giản, bạn cần thêm logic thực tế
        String word = wordLabel.getText();
        String meaning = getMeaning(word);
        meaningLabel.setText("Nghĩa: " + meaning);
    }

    // Phương thức giả định để lấy nghĩa của từ tiếng Anh
    private String getMeaning(String word) {
        // Trong thực tế, bạn sẽ gửi yêu cầu đến một nguồn dữ liệu từ điển hoặc cơ sở dữ liệu để lấy nghĩa
        // Ở đây, chúng ta chỉ trả về một nghĩa giả định
        if ("English Word".equals(word)) {
            return "Nghĩa của từ tiếng Anh";
        } else {
            return "Không tìm thấy nghĩa cho từ này";
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}
