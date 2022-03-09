package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSteps
{
    public static WebDriver driver;

    @When("^I launch the application$")
    public void i_launch_the_application() throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
    }

    @Then("^the application should be loaded successfully$")
    public void the_application_should_be_loaded_successfully() throws Throwable
    {
        driver.findElement(By.name("q")).sendKeys("Balaji");
        driver.close();
        driver.quit();
    }
}