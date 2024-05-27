package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * https://opensource-demo.orangehrmlive.com/
 */
public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.quit();
    }
}
