package com.gilbert;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("App Test")
public class AppTest {

    @DisplayName("App.aMethod() test")
    @Test
    public void aMethodTest() {
        App app = new App();
        assertEquals(app.aMethod(),"Meh");
    }
}