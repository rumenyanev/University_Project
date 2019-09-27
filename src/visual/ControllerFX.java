package visual;

import core.Manipulator;

import java.io.IOException;

public class ControllerFX {

    public void testButtonClicked() throws IOException {
        System.out.println("Test start of program...");
        Manipulator m = new Manipulator();
        m.run();
    }

    public void exitButtonClicked() {
        System.exit(0);
    }
}
