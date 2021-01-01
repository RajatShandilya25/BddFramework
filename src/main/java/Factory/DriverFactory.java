package Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class DriverFactory
{

    public WebDriver driver;
    public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();


    public WebDriver BrowserInitialization(String BrowserName)
    {
        if(BrowserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            tldriver.set(new ChromeDriver());
        }
        else if(BrowserName.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            tldriver.set(new FirefoxDriver());
        }
        else
        {
            System.out.println("Unable to initialize browser");
        }


        GetDriver().manage().window().maximize();
        GetDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        GetDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        return GetDriver();
    }


    public synchronized static WebDriver GetDriver()
    {
        return tldriver.get();
    }

    public void QuitDriver()
    {
        tldriver.get().close();
        tldriver.remove();
    }


}
