package com.amazon;

import baseApi.Base;
//import homeFeatures.AmazonBase;
import org.testng.annotations.Test;
        import utility.DataReader;

        import java.io.FileNotFoundException;
        import java.io.IOException;


public class SignUp extends Base {
    public DataReader dr = new DataReader();
    String path = "C:\\Users\\Shibu\\Documents\\Book1.xls";
    @Test
    public void signIn() throws InterruptedException, IOException {
        String [][] value = dr.fileReader(path);
        sleepFor(2);
        clickByCss("#nav-tools #nav-link-yourAccount .nav-line-1");
        clickByCss(".nav-action-inner");
        sleepFor(4);
        String emailLocator = value[1][0];
        String email = value[1][1];
        String passLocator = value[2][0];
        String pass = value[2][1];
       // typeByCss("#ap_email", "abc123@gmail.com");
       // typeByCss("#ap_password", "pp5588eettkk");
        typeByCss(emailLocator, email);
        typeByCss(passLocator, pass);
        sleepFor(4);
    }
}