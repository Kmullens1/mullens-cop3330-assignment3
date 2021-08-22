package oop.example.Ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CreateCSSFolderTest {

   ////Check User Response Test/////////////////////////////////////////////////////////////
    @Test
    void checkUserResponse_If_User_Inputs_Yes() {
        CreateCSSFolder create = new CreateCSSFolder();
        boolean outcome = create.checkUserResponse("y");

        assertTrue(outcome);
    }

    @Test
    void checkUserResponse_If_User_Inputs_No() {
        CreateCSSFolder create = new CreateCSSFolder();
        boolean outcome = create.checkUserResponse("n");

        assertFalse(outcome);
    }

    ////CSS Folder Test//////////////////////////////////////////////////////////////
    @Test
    void CSSFolder() {
        CreateCSSFolder create = new CreateCSSFolder();
        create.cssFolder("HelloWorld2");

        boolean bool = false;
        File createCSS = new File("C:\\Users\\kmull\\Desktop\\HelloWorld2.css");
        if(createCSS.exists() && !createCSS.isFile()) {
            bool = true;
        }

        assertTrue(bool);
    }
}