package MyStepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {
    public static WebDriver driver;


    @Before
    public void startDriver() throws Exception{
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    @After
    public void afterEveryScrenario(Scenario scenario) throws  Exception{
        if(scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)new SignUpStepDeff().driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        driver.quit();

    }


}
