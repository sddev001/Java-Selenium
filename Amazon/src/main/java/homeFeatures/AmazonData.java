package homeFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonData {
    private WebDriver driver;

    public AmazonData(WebDriver driver){
        this.driver = driver;
    }

    public AmazonData selectCategory(String category){
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText(category);
        return this;
    }

    public AmazonData enterName(String name){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(name);
        return this;
    }

    public AmazonData clickSearch(){
        driver.findElement(By.cssSelector(".nav-input")).click();
        return new AmazonData(driver);
    }

    public AmazonData amazonData(AmazonSearch searchData){
        return selectCategory(searchData.getCategory()).
                enterName(searchData.getName()).
                clickSearch();
    }
}

