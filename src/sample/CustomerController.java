package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {
    public Button addButton;
    public Button modifyButton;
    public Button deleteButton;
    public Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void addButtonClicked(ActionEvent actionEvent) throws Exception  {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("addCustomer.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 450, 450);
        stage.setScene(scene);
        stage.show();
    }

    public void modifyButtonClicked(ActionEvent actionEvent) {
    }

    public void deleteButtonClicked(ActionEvent actionEvent) {
    }

    public void backButtonClicked(ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainWindow.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 400, 450);
        stage.setScene(scene);
        stage.show();
    }
}
