import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Appiumtestcase {
    @Test
    public void testcase() throws URISyntaxException, MalformedURLException
    {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Android Device");
        options.setPlatformName("Android");
        options.setChromedriverExecutable(System.getProperty("user.dir") + "\\src\\main\\java\\com\\QM\\drivers\\chromedriver1.exe");
        options.setApp("C:\\Users\\UdayKumar\\IdeaProjects\\FinalDraft2\\src\\test\\java\\SwagLabs.apk");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.swaglabsmobileapp");
        options.setAppActivity("com.swaglabsmobileapp.SplashActivity");
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
    }
}
