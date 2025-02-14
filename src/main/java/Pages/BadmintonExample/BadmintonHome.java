package Pages.BadmintonExample;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.WebdriverBase;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class BadmintonHome extends WebdriverBase{
    String url = "https://www.cambridgebadmintonclub.com/";
    public BadmintonHome(WebDriver driver){
        super(driver);

    }

    public BadmintonHome(){
        driver.navigate().to(url);
    }

}
