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

public class ModifyAppointmentsController implements Initializable {
    public Button modifyButton;
    public Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void modifyButtonClicked(ActionEvent actionEvent) {
    }

    public void backButtonClicked(ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("appointments.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 885, 475);
        stage.setScene(scene);
        stage.show();
    }
}
