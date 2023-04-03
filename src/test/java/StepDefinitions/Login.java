package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.CompletableFuture;

public class Login extends CommonMethods {

    @Given("open the browser and launch HRMS Application")
    public void open_the_browser_and_launch_hrms_application() {
       openBrowserAndLanunchApp();
    }
    @When("user enters a valid email and valid password")
    public void user_enters_a_valid_email_and_valid_password() {
        driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedin=driver.findElement(By.xpath("//a[text()='Welcome Admin']")).isDisplayed();
    }
    @Then("close the browser")
    public void close_the_browser() {

closeBrowser();
    }

}
