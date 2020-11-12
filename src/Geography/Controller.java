package Geography;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Label lblID;
    @FXML
    private Label lblName;
    @FXML
    private Label lblArea;
    @FXML
    private Label lblPop;
    @FXML
    private Label lblFoG;
    @FXML
    public TextField tfID;
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
    @FXML
    public TableColumn colID;
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

    //Button handling
    public void handleBtnCreate(ActionEvent actionEvent) {
        // Example: btnDelete.setText("Bye!");
    }
    public void handleBtnUpdate(ActionEvent actionEvent) {

    }
    public void handleBtnDelete(ActionEvent actionEvent) {

    }

    //Used to portray my data in the TableView.
    public ObservableList<GovernedRegion> getGRList(){
        ObservableList<GovernedRegion> grList = FXCollections.observableArrayList();
        Connection conn = getConnection();
        String query = "SELECT * FROM gr";
        Statement st;
        ResultSet rs;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            GovernedRegion gr;
            while (rs.next()){
                gr = new GovernedRegion(rs.getInt("id"),rs.getString("name"),rs.getInt("area"),rs.getInt("population"),rs.getString("fog"));
            grList.add(gr);
                }
            }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return grList;
        /* --> For manual testing
        grList.add(new GovernedRegion(1,"Afrika",50000,1216000000,"Monarchies and Republics"));
        grList.add(new GovernedRegion(2,"North America",60000,579000000,"Federal Government"));
        grList.add(new GovernedRegion(3,"South America",70000,422000000,"Mostly Presidential Republics"));
        grList.add(new GovernedRegion(4,"Europe",80000,741000000,"Various"));

        return grList;
        */
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public Connection getConnection(){
    Connection conn;
    try{
        conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/miniproject1", "root","" );
        return conn;
        }
    catch(Exception ex){
        System.out.println("Error " + ex.getMessage());
        return null;
        }
    }

    public void showData(){
        ObservableList<GovernedRegion>list = getGRList();
        colID.setCellValueFactory(new PropertyValueFactory<GovernedRegion,Integer>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<GovernedRegion,String>("name"));
        colArea.setCellValueFactory(new PropertyValueFactory<GovernedRegion,String>("area"));
        colPop.setCellValueFactory(new PropertyValueFactory<GovernedRegion,Integer>("population"));
        colFoG.setCellValueFactory(new PropertyValueFactory<GovernedRegion,String>("fog"));

        // Bruchi glaubs nüm:   tvGovernedRegion.setItems(getGRList());
    }
}
