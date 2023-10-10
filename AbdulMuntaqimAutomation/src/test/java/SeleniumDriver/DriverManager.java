package SeleniumDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    public static WebDriver driver;
    public DriverManager(){
    	
    }
    public static void initializeChromeDriver() {
        try {        	
            ChromeOptions options = new ChromeOptions();            
            driver = new ChromeDriver(options);

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeChromeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
