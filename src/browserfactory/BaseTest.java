package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;




    public void openBrowser(String baseurl){
        System.setProperty("webdriver,chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();

        //Launch Url
        driver.get(baseurl);

        //Maximize window
        driver.manage().window().maximize();

        //applying implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closingBrowser(){

        //closing browser
        driver.quit();
    }



}
