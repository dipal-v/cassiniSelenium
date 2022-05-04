package testFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory extends BrowserFactory {


    public WebDriver getDriver() {
        int selectDriver = 1;
        WebDriver currentDriver = null;
        switch (selectDriver) {
            case 1:
                System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserFiles\\chromedriver.exe");
                currentDriver = new ChromeDriver();
                break;

        }
        return currentDriver;
    }
}


