package Pages.BadmintonExample;
import Pages.WebdriverBase;
import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigate extends WebdriverBase{

    public Navigate(WebDriver driver) {
        super(driver);
    }

    public BadmintonHome goToHome(){
        By button = By.id("menu-item-" + (int)NavButtons.Home);

        click(button);
        return  new BadmintonHome(driver);
    }

    public AboutUs goToAboutUs(){
        By button = By.id("menu-item-" + (int)NavButtons.About_Us);

        click(button);
        return  new AboutUs(driver);
    }

    public FAQPage goToFAQs(){
        By button = By.id("menu-item-" + (int)NavButtons.FAQ);

        click(button);
        return  new FAQPage(driver);
    }

}
