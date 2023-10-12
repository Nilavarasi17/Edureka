package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

import org.openqa.selenium.Cookie;




import testbase.WebTestBase;

public class Utility extends WebTestBase {
	public static void scrollDownByElement(WebDriver driver, WebElement element){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        // javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element)
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
    }
    

    public static void scrollUp(WebDriver driver){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        javascriptExecutor.executeScript("window.scrollBy(0,-800)");
    }
    public static void getCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies){
            System.out.println(c);
        }
        driver.manage().deleteAllCookies();
    }
    public static void perform_Hovering(WebDriver driver,WebElement Categories,WebElement Devops) throws InterruptedException
    {
    	Actions a=new Actions(driver);
    	a.moveToElement(Categories).perform();
    	Thread.sleep(1000);
    	Devops.click();
    }

}
