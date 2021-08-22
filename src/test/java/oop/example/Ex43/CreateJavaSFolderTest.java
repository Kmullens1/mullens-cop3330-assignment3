package oop.example.Ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CreateJavaSFolderTest {
    ////Check User Response Test/////////////////////////////////////////////////////////////
    @Test
    void checkUserResponse_If_User_Inputs_Yes() {
        CreateJavaSFolder create = new CreateJavaSFolder();
        boolean outcome = create.checkUserResponse("y");

        assertTrue(outcome);
    }

    @Test
    void checkUserResponse_If_User_Inputs_No() {
        CreateJavaSFolder create = new CreateJavaSFolder();
        boolean outcome = create.checkUserResponse("n");

        assertFalse(outcome);
    }

    ////Java Script Folder Test//////////////////////////////////////////////////////////////
    @Test
    void javaScriptFolder_Test_That_The_HTML_Folder_Is_Created_Properly() {
        CreateJavaSFolder create = new CreateJavaSFolder();
        create.javaScriptFolder("HelloWorld1");

        boolean bool = false;
        File createJavaS = new File("C:\\Users\\kmull\\Desktop\\HelloWorld1.js");
        if(createJavaS.exists() && !createJavaS.isFile()) {
            bool = true;
        }

        assertTrue(bool);
    }
}