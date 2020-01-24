
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WebDriverTest {

    @Test
    public void print(){
        System.out.println("hello lads");
    }

    @Test
    public void e2eTest(){
        String path = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        assertThat(title).isEqualTo("Google");
        System.out.println(title);

        driver.quit();
    }

}