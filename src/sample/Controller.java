package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button btn_addStd;

    @FXML
    private Label label;

    @FXML
    private TextField txt_std;

    @FXML
    private TextField txt_ayear;

    @FXML
    private TextField txt_discount;

    @FXML
    private TextField txt_tuition;

    private Connection con = null;
    private PreparedStatement pat = null;

    @FXML
    private void handleAddStd(ActionEvent event) {
        pat = con.prepareStatement();


    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        con = dba.DbConnection.StudentListConnetion();
    }
}
