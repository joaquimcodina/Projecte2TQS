package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

  WebDriver driver;

  @Given("the user is in the index page")
  public void theUserIsInTheIndexPage(){
    System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
    driver = new FirefoxDriver();
    driver.navigate().to("https://www.beatport.com/");
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
  }

  @When("the user clicks the login option")
  public void theUserClicksTheProductsOption() {
    driver.findElement(By.id("head-account-icon")).click();
  }

  @When("^the user enters (.*) (.*) in the login form")
  public void theUserEntersPasswordInTheLoginForm(String username, String password) {
    driver.findElement(By.className("login-page-form-username")).sendKeys(username);
    driver.findElement(By.className("login-page-form-password")).sendKeys(password);
  }

  @When("the user clicks button login")
  public void theUserClicksTheSearchButton() {
    driver.findElement(By.className("login-page-form-button")).click();
  }

  @Then("user has successfully logged in")
  public void userHasSuccessfullyLoggedIn() {
    String valid = driver.findElement(By.className("head-account-user-image")).getTagName();
    Assert.assertFalse(valid.isEmpty());
  }
}