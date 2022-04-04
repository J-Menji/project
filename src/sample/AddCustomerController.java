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

public class AddCustomerController implements Initializable {
    public Button addButton;
    public Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void addButtonClicked(ActionEvent actionEvent) {
    }

    public void backButtonClicked(ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("customer.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
