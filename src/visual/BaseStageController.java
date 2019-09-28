package visual;

import core.Manipulator;
import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class BaseStageController {

    @FXML // fx:id="firstNameStudent"
    private TextField firstNameStudent; // Value injected by FXMLLoader

    @FXML // fx:id="lastNameStudent"
    private TextField lastNameStudent; // Value injected by FXMLLoader

    @FXML // fx:id="emailStudent"
    private TextField emailStudent; // Value injected by FXMLLoader

    @FXML // fx:id="ageStudent"
    private TextField ageStudent; // Value injected by FXMLLoader

    @FXML // fx:id="departmentStudent"
    private TextField departmentStudent; // Value injected by FXMLLoader

    @FXML // fx:id="testButton"
    private Button testButton; // Value injected by FXMLLoader

    @FXML // fx:id="exitButon"
    private Button exitButon; // Value injected by FXMLLoader

    @FXML // fx:id="resetButton"
    private Button resetButton; // Value injected by FXMLLoader

    @FXML // fx:id="saveButton"
    private Button saveButton; // Value injected by FXMLLoader

    @FXML
    public void exitButtonClicked(ActionEvent event) {

    }

    @FXML
    public void sendInformationButtonClicked(ActionEvent event) {
        System.out.println("GO GO GO");
    }

    @FXML
    public void testButtonClicked(ActionEvent event) {

    }

    /*@FXML
    public void sendInformationButtonClicked() throws IOException {
        //sendInformation.set;
    }*/

    @FXML
    public void testButtonClicked() throws IOException {
        System.out.println("Test start of program...");
        Manipulator m = new Manipulator();
        m.run();
    }

    @FXML
    public void exitButtonClicked() {
        System.exit(0);
    }

    @FXML
    public void facebookLinkClicked() throws IOException, URISyntaxException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("http://facebook.com"));
    }

}
