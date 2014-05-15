package springmvc.controller;

import static org.junit.Assert.*;
import org.junit.Test;

public class ControllerTest {

    @Test
    public void testErrorController() throws Exception {
        ErrorController controller = new ErrorController();
        assertNotNull(controller);
    }

    @Test
    public void testCallController() throws Exception {
        CallController controller = new CallController();
        assertNotNull(controller);
    }
}
