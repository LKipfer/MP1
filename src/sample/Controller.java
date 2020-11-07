package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblMessage;
    private Label lblTopLeft;
    private Label lblTopRight;
    private Label lblMidLeft;
    private Label lblMidRight;
    private Label lblBotLeft;
    private Label lblBotRight;
    @FXML
    private Button btnOK;

    public void handleBtnOK(ActionEvent actionEvent) {
        lblMessage.setText("k bye");
        btnOK.setText("Bye!");
    }
}
