package visual;
//Да не се стартира от Main на visual пакета!!! Има грешки за оправяне! :)

import core.Manipulator;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BaseStageController {

    private Manipulator manipulator_test;
    @FXML
    private TextField firstNameStudent;
    @FXML
    private TextField lastNameStudent;
    @FXML
    private TextField emailStudent;
    @FXML
    private TextField ageStudent;
    @FXML
    private TextField departmentStudent;

    public BaseStageController() throws IOException {
        this.manipulator_test = new Manipulator();
    }

    public void sendInformationButtonClicked() throws IOException {
        System.out.println();
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstNameStudent.getText()).append(", ");
        sb.append(this.lastNameStudent.getText()).append(", ");
        //sb.append(this.emailStudent.getText()).append(", ");
        sb.append(this.ageStudent.getText()).append(", ");
        sb.append(this.departmentStudent.getText());
        String result = sb.toString();
        sb.delete(0,sb.length());
        manipulator_test.setOneStudentData(result);
        manipulator_test.run();

    }

    public void exitButtonClicked() {
        System.exit(0);
    }

    public void facebookLinkClicked() throws IOException, URISyntaxException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("http://facebook.com"));
    }

    public void removeAllInformationForStudent() throws IOException {
        this.manipulator_test.removeContentOfFile();
    }

}
