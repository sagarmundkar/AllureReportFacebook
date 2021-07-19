package Pages;

import com.facebook.test.BaseProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login extends BaseProgram {
    //Login to the Facebook page using valid email
    @FindBy(name = "email")
    WebElement email;

    //Login to the Facebook page using valid password
    @FindBy(name = "pass")
    WebElement password;

    //Submit valid details
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbutton;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void LoginApplication() throws InterruptedException {
        email.sendKeys("********");
        password.sendKeys("*****");
        loginbutton.click();
        Thread.sleep(100);

        String actualurl = "https://www.facebook.com/";
        String expectedurl = driver.getCurrentUrl();
        Assert.assertEquals(expectedurl,actualurl);

    }
}
