package com.amazon;

import baseApi.Base;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

public class AmazonHome extends Base {
    @Test(dataProvider = "search", dataProviderClass = AmazonSearch.class)
    public void testSearch (String category, String name){

        AmazonSearch search = new AmazonSearch();
        search.setCategory(category);
        search.setName(name);

        AmazonData data = new AmazonData(driver);
        data.amazonData(search);

        driver.findElement(By.xpath(".//*[@id='result_0']/div/div[2]/div[1]/a/h2")).click();

    }
    /*
@Test

public void homePageOfAmazon() throws InterruptedException {
   // driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
   // driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
    driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]")).click();
    driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();


}*/
    /*
    @Test

    public void homePageOfAmazon() throws InterruptedException {*/
        //System.out.println(driver.getCurrentUrl());
        //typeAndEnterByCss("#twotabsearchtextbox","book");
      //  driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("book", Keys.ENTER);
        //List<String> list = getTextByCss("#nav-subnav .nav-a");
        //displayText(list);
       // Thread.sleep(4000);
        //sleepFor(4);
     //   driver.findElement(By.xpath(".//*[id='nav-subnav']/a[2]")).click();
      //  Thread.sleep(4000);
        //sleepFor(4);
        //clickByXpath(".//*[id='nav-subnav']/a[2]");

     //   List<WebElement> list = driver.findElements(By.cssSelector("#nav-subnav a"));
      //  Thread.sleep(4000);

        /*

        typeAndEnterByCss("#twotabsearchtextbox", "book");
        sleepFor(4);
        List<String> list = getTextByCss("#nav-subnav .nav-a");
        displayText(list);
        // List<WebElement> bookNavBar = getWebElements("#nav-subnav .nav-a");
        for(int i=1; i<list.size(); i++){
           clickByText(list.get(i));
        }
        sleepFor(2);
         */


/*
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
        sleepFor(2);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Romeo and Juliet");
        sleepFor(4);
        driver.findElement(By.cssSelector(".nav-input")).click();
        sleepFor(4);
        driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/a/h2")).click();
        sleepFor(4);
     }*/


}


