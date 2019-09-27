package visual;

import core.Manipulator;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class BaseStageController {

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
