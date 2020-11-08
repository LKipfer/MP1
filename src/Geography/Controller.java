package Geography;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
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
    @FXML   //Table
    private TableView<GovernedRegion> tvGovernedRegion;
    @FXML   //Name Column
    private TableColumn<GovernedRegion,String> colName;
    @FXML   //Area Column
    private TableColumn<GovernedRegion,String> colArea;
    @FXML   //Population Column
    private TableColumn<GovernedRegion,Integer> colPop;
    @FXML   //Form of Government Column
    private TableColumn<GovernedRegion,String> colFoG;
    @FXML
    private Button btnCreate;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;

    //Button handling da villicht unnötig..
    public void handleBtnCreate(ActionEvent actionEvent) {
        // Example: btnDelete.setText("Bye!");
    }
    public void handleBtnUpdate(ActionEvent actionEvent) {

    }
    public void handleBtnDelete(ActionEvent actionEvent) {

    }

    //Used to portray my data in the TableView.
    public ObservableList<GovernedRegion> getGovernedRegionList(){
        ObservableList<GovernedRegion> gr = FXCollections.observableArrayList();
        gr.add(new GovernedRegion("Afrika","Southern Hemisphere",1216000000,"Monarchies and Republics"));
        gr.add(new GovernedRegion("North America","Northern Hemisphere",579000000,"Federal Government"));
        gr.add(new GovernedRegion("South America","Southern Hemisphere",422000000,"Mostly Presidential Republics"));
        gr.add(new GovernedRegion("Europe","Northern Hemisphere",741000000,"Various"));
        return gr;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colName.setCellValueFactory(new PropertyValueFactory<GovernedRegion,String>("name"));
        colArea.setCellValueFactory(new PropertyValueFactory<GovernedRegion,String>("area"));
        colPop.setCellValueFactory(new PropertyValueFactory<GovernedRegion,Integer>("population"));
        colFoG.setCellValueFactory(new PropertyValueFactory<GovernedRegion,String>("formofgovernment"));

        tvGovernedRegion.setItems(getGovernedRegionList());
    }
}
