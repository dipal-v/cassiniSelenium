package features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testFramework.HomePage;
import testFramework.Utils;

import java.util.Set;

public class Stepdefs {

Utils utils = new Utils();
    String homePageName = "https://yahoo.com";
    HomePage homePage = new HomePage();



    @When("^User navigates to main yahoo page$")
    public void goToHomePage() throws Exception {
        utils.getPage(homePageName);
    }

    @And("he navigates to sign in")
    public void heNavigatesToSignIn() {
        utils.waitForItemVisibility(homePage.signInButtonForWait);
        utils.clickAnElement(homePage.signInButtonForWait);
        utils.waitForItemVisibility(By.xpath("//input[@id='login-signin']"));
    }
}
