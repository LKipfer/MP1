package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lblMessage;
    @FXML
    private Button btnOK;

    public void handleBtnOK(ActionEvent actionEvent) {      //Was passiert, nachdem de chnopf druckt worde isch, glaubs..
        lblMessage.setText("k bye");
        btnOK.setText("Bye!");
    }
}
