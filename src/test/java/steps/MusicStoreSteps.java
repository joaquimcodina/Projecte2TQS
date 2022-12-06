package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class MusicStoreSteps {
  WebDriver driver;
  @Given("the user is in the index page")
  public void theUserIsInTheIndexPage(){
    System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
    driver = new FirefoxDriver();
    driver.navigate().to("https://www.welcomedjshop.com/");
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
  }

  @When("the user clicks the login option")
  public void theUserClicksTheProductsOption() {
    driver.findElement(By.cssSelector(".top-links:nth-child(1) a")).click();
  }

  @When("^the user enters (.*) (.*) in the login form")
  public void theUserEntersPasswordInTheLoginForm(String username, String password) {
    driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.id("pass")).sendKeys(password);
  }

  @When("the user clicks button login")
  public void theUserClicksTheSearchButton() {
    driver.findElement(By.id("send2")).click();
  }

  @Then("user has successfully logged in")
  public void userHasSuccessfullyLoggedIn() {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String valid = driver.findElement(By.className("dashboard-welcome")).getText();
    Assert.assertTrue(valid.contains("Practica TQS"));
  }

  @When("the user adds a new vinyls to the cart")
  public void theUserAddsANewVinylsToTheCart() {
    WebElement element1 = driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(1) a:nth-of-type(2)"));
    WebElement element2 = driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(2) a:nth-of-type(2)"));
    WebElement element3 = driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(3) a:nth-of-type(2)"));

    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    executor1.executeScript("arguments[0].click();", element1);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    JavascriptExecutor executor2 = (JavascriptExecutor)driver;
    executor2.executeScript("arguments[0].click();", element2);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    JavascriptExecutor executor3 = (JavascriptExecutor)driver;
    executor3.executeScript("arguments[0].click();", element3);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @When("the user clicks the my cart button")
  public void theUserClicksTheMyCartButton() {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.className("top-link-cart")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.className("top-link-cart")).click();
  }

  @Then("the vinyls have been added to the cart successfully")
  public void theVinylsHaveBeenAddedToTheCartSuccessfully() {
    String valid = driver.findElement(By.className("top-link-cart")).getText();
    Assert.assertTrue(valid.contains("3"));
  }
}