package visual;
//Да не се стартира от Main на visual пакета!!! Има грешки за оправяне! :)
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

    public void sendInformationButtonClicked() {
        TextField firstNameStudent = this.firstNameStudent;
        //System.out.println(this.firstNameStudent.get);
    }

    public void testButtonClicked() throws IOException {
        System.out.println("Test start of program...");
        Manipulator m = new Manipulator();
        m.run();
    }

    public void exitButtonClicked() {
        System.exit(0);
    }

    public void facebookLinkClicked() throws IOException, URISyntaxException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("http://facebook.com"));
    }

}
