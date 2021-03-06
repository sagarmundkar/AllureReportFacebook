package Pages;

import com.facebook.test.BaseProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PostPage extends BaseProgram {

    @FindBy(xpath = "//span[contains(text(),'Photo/Video')]")
    WebElement CreatePost;

    public  PostPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void uploadFile() throws AWTException {
        StringSelection selection = new StringSelection("C:\\Users\\Administrator\\Pictures\\Nature.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        //Create robot class object for keyboard and mouse handle
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.delay(1000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.delay(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.delay(1000);
    }

    public void Post_to_page() throws InterruptedException, AWTException {
        CreatePost.click();
        Thread.sleep(2000);
        uploadFile();
    }
}
