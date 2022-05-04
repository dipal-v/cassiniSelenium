package testFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Sign in")
    public WebElement signInButton;

    public By signInButtonForWait = By.partialLinkText("Sign");

    public String baseURL = "https://yahoo.com/";


}
