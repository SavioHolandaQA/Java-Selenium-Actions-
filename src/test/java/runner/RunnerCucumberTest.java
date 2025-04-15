package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}
)
public class RunnerCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        String browser = System.getProperty("browser", "chrome");

        ChromeOptions options = new ChromeOptions();

        if ("chrome-ci".equals(browser)) {
            options.addArguments("--headless", "--disable-gpu", "--no-sandbox", "--disable-dev-shm-usage");
        }

        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void stop() {
        if (driver != null) {
            driver.quit();
        }
    }
}
