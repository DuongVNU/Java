package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javafx.util.Pair;

import java.util.Optional;

public class Dialog1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Dialog<Pair<String, String>> dialog1 = new Dialog<>();
        dialog1.setTitle("Login Dialog");
        dialog1.setHeaderText("Sign Up");
        ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        dialog1.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));
        TextField userName = new TextField();
        userName.setPromptText("Username");
        TextField passWord = new TextField();
        userName.setPromptText("Password");
        grid.add(new Label("Username: "), 0, 0);
        grid.add(userName, 1, 0);
        grid.add(new Label("Password: "), 0, 1);
        grid.add(passWord, 1, 1);

        Node loginButton = dialog1.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

        userName.textProperty().addListener(((observable, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        }));
        dialog1.getDialogPane().setContent(grid);
        dialog1.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(userName.getText(), passWord.getText());
            } else return null;
        });

        Optional<Pair<String, String>> result = dialog1.showAndWait();
        result.ifPresent(userNamePassWord -> {
            System.out.println("Userame: " + userNamePassWord.getKey()+ ", Password: "+ userNamePassWord.getValue());
        });
    }
}
