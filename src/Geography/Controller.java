package Geography;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Label lblName;
    @FXML
    private Label lblArea;
    @FXML
    private Label lblPop;
    @FXML
    private Label lblFoG;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfArea;
    @FXML
    private TextField tfPop;
    @FXML
    private TextField tfFoG;
    @FXML
    private TableView<GovernedRegion> tvGovernedRegion;
    @FXML
    private TableColumn<GovernedRegion,String> colName;
    @FXML
    private TableColumn<GovernedRegion,String> colArea;
    @FXML
    private TableColumn<GovernedRegion,Integer> colPop;
    @FXML
    private TableColumn<GovernedRegion,String> colFoG;
    @FXML
    private Button btnCreate;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;


    public void handleBtnCreate(ActionEvent actionEvent) {
        // Example: btnDelete.setText("Bye!");
    }
    public void handleBtnUpdate(ActionEvent actionEvent) {

    }
    public void handleBtnDelete(ActionEvent actionEvent) {

    }
}
