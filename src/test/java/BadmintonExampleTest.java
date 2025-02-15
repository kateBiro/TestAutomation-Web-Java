import Pages.BadmintonExample.BadmintonHome;
import org.junit.*;

public class BadmintonExampleTest {

    BadmintonHome home;

    @Before
    public void Setup(){
        home = new BadmintonHome();
    }
    @Test
    public void AboutUsPage(){
        String title = home
                .Navigate()
                .goToAboutUs()
                .title();
        System.out.println("Title: " + title);
        Assert.assertEquals("About Us", title) ;
    }

    @Test
    public void RegistrationPage(){
        String title = home
                .Navigate()
                .goToMembership()
                .title();
        System.out.println("Title: " + title);
        Assert.assertEquals("Register for Badminton", title) ;
    }

    @After
    public void TearDown(){
        home.close();
    }
}
