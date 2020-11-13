package Geography;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label lblID;
    @FXML
    private Label lblName;
    @FXML
    private Label lblArea;
    @FXML
    private Label lblPop;
    @FXML
    private Label lblFoG;
    @FXML
    private TextField tfID;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfArea;
    @FXML
    private TextField tfPop;
    @FXML
    private TextField tfFoG;
    @FXML   //Table
    private TableView<Country> tvCountry;
    @FXML   //ID Column
    private TableColumn<Country,Integer> colID;
    @FXML   //Name Column
    private TableColumn<Country,String> colName;
    @FXML   //Area Column
    private TableColumn<Country,String> colArea;
    @FXML   //Population Column
    private TableColumn<Country,Integer> colPop;
    @FXML   //Form of Government Column
    private TableColumn<Country,String> colFoG;
    @FXML
    private TableColumn<Country,String> colStates;
    @FXML
    private Button btnCreate;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;


    //Button handling
    public void handleBtnCreate(ActionEvent actionEvent) {
        SaveToFile();
    }
    public void handleBtnUpdate(ActionEvent actionEvent) {

    }
    public void handleBtnDelete(ActionEvent actionEvent) {

    }

    /*
    //Used to portray my data in the TableView.
    public ObservableList<GovernedRegion> getGRList(){
        ObservableList<GovernedRegion> grList = FXCollections.observableArrayList();

        grList.add(new GovernedRegion(1,"Afrika",50000,1216000000,"Monarchies and Republics"));
        grList.add(new GovernedRegion(2,"North America",60000,579000000,"Federal Government"));
        grList.add(new GovernedRegion(3,"South America",70000,422000000,"Mostly Presidential Republics"));
        grList.add(new GovernedRegion(4,"Europe",80000,741000000,"Various"));

        return grList;
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colID.setCellValueFactory(new PropertyValueFactory<Country,Integer>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<Country,String>("name"));
        colArea.setCellValueFactory(new PropertyValueFactory<Country,String>("area"));
        colPop.setCellValueFactory(new PropertyValueFactory<Country,Integer>("population"));
        colFoG.setCellValueFactory(new PropertyValueFactory<Country,String>("fog"));
        colStates.setCellValueFactory(new PropertyValueFactory<Country,String>("listOfStates"));

        ObservableList<Country> grList = FXCollections.observableArrayList();

        for (String line:ReadFromFile()
             ) {
            String[] info = line.split("\\-");  //Splits every column at the "-".
            grList.add(new Country(getInt(info[0]),info[1],getInt(info[2]),getInt(info[3]),info[4], info[5]));
        }

        tvCountry.setItems(grList);
    }

    private void AddNewCountry()
    {

    }

    private void AddNewState()
    {

    }

    private void DeleteSelectedRow()
    {

    }

    private void SaveToFile()
    {
        FileWriter fw;

        try{
            fw = new FileWriter(new File("geo-savefile.txt"));

            for (var item:tvCountry.getItems()
                 ) {
                fw.write(String.format("%s-%s-%s-%s-%s-%s", item.getId(), item.getName(), item.getArea(), item.getPopulation(), item.getFog(), item.getListOfStates()));
                fw.write(System.lineSeparator());
            }

            fw.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private String[] ReadFromFile()
    {
        BufferedReader br;
        String[] lineList;

        try{
            br = new BufferedReader(new FileReader("geo-savefile.txt"));

            int lines = 0;
            while (br.readLine() != null) {
                lines++;
            }

            br = new BufferedReader(new FileReader("geo-savefile.txt"));
            lineList = new String[lines];
            int i = 0;
            while (i < lines)
            {
                lineList[i] = br.readLine();
                i++;
            }

            return lineList;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    private int getInt(String test){
        try{
            return Integer.parseInt(test.trim());
        }catch(Exception e){
            return 0;
        }
    }

    private String CheckIfNull(String test)
    {
        if (test == null)
        {
            return "";
        }
        else
        {
            return test;
        }
    }
}
