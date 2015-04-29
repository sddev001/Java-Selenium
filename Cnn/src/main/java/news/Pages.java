package news;

import baseApi.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Shibu on 4/26/2015.
 */
public class Pages extends Base{

/*    WebDriver driver;

    public Pages(WebDriver driver){
        this.driver = driver;

    }*/

    public void clickByElement(WebDriver driver, WebElement element){
        element.click();
    }

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[1]/a")
    public WebElement US;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[2]/a")
    public WebElement world;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[3]/a")
    public WebElement politics;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[4]/a")
    public static WebDriver tech;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[5]/a")
    public WebElement health;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[6]/a")
    public WebElement entertainment;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[7]/a")
    public WebElement living;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[8]/a")
    public WebElement travel;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[9]/a")
    public WebElement money;

    @FindBy(xpath = ".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/div/ul/li[10]/a")
    public WebElement sports;

    /*

    public void clickByPage(Pages page){

        driver.navigate().back();
    }

    public static void clickByWebElement(WebDriver driver){
        driver = driver;

    }*/

    public static void clickByWebElement(WebElement element){
        element.click();
    }
}
