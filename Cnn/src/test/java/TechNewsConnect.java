
import news.CnnBase;
import news.Pages;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;



/**
 * Created by Shibu on 4/26/2015.
 */
public class TechNewsConnect extends CnnBase {
   //Pages page = null;

    @Test
    public void getTechNews(){

//clickByWebElement(Pages.tech);
        Pages.clickByWebElement((WebElement) Pages.tech);
        List<String> news = getTextByCss(".cd__content");
        System.out.println(news);

    }




}
