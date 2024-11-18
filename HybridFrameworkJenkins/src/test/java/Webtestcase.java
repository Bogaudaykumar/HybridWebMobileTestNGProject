import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Webtestcase {
    @Test
    public void testcase() throws InterruptedException {
        WebDriver driver;
        String browser=System.getProperty("browserProperty");
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("edge"))
        {
            driver= new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        else
        {
            driver=new ChromeDriver();
        }

        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.quit();
    }
}
