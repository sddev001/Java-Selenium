package com.amazon;

import homeFeatures.AmazonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Search extends AmazonBase {

    @Test
    public void searchItems()throws InterruptedException{

        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        displayText(listMenu);
        for(String item: listMenu){
            selectElementByVisibleText("#searchDropdownBox", item);
            sleepFor(2);
        }
        /*
        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        displayText(listMenu);
        for(String item: listMenu){
            typeAndEnterByCss("#twotabsearchtextbox", item);
            sleepFor(4);
        }
        /*
        setItems(AmazonBase.list);
        getItems();
        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        Assert.assertEquals(listMenu, AmazonBase.menu);
        displayText(listMenu);
        for(String item: listMenu){
            typeAndEnterByCss("#twotabsearchtextbox", item);
            sleepFor(4);
        }
*/


    }
}

