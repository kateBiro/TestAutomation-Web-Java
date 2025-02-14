package Pages;

import Pages.BadmintonExample.Navigate;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebdriverBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public WebdriverBase(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public WebdriverBase(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public  boolean isDisplayed(By by){

        try{
            return driver.findElement(by).isDisplayed();

        }catch (NoSuchElementException e){
            System.out.println(e);
            return false;
        }
    }

    protected void waitUntilDisplayed(By by){
        wait = new WebDriverWait(driver, 30);
        wait.until(driver -> isDisplayed(by));
    }

    public  void close(){
        driver.close();
    }

    public void click(By by){
        try{
            driver.findElement(by).click();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public String title(){
        try{
            return driver.findElement(By.className("entry-title")).getText();
        }catch (Exception e){
            return e.toString();
        }
    }

    public Navigate Navigate(){
        return new Navigate(driver);
    }


}
