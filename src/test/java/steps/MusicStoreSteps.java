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
    driver.close();
  }

  @When("the user clicks button logout")
  public void theUserClicksButtonLogout() {
    driver.findElement(By.cssSelector(".top-links li:nth-of-type(6)")).click();
  }

  @Then("user has successfully logged out")
  public void userHasSuccessfullyLoggedOut() {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String valid = driver.findElement(By.className("page-head")).getText();
    Assert.assertTrue(valid.contains("Ha cerrado su sesión correctamente"));
    driver.close();
  }

  @When("the user adds a vinyls to the cart")
  public void theUserAddsAVinylsToTheCart() {
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
    driver.close();
  }

  @When("the user selects old gold category")
  public void theUserSelectsOldGoldCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(1)")).click();
  }

  @When("the user selects remember category")
  public void theUserSelectsRememberCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(2)")).click();
  }

  @When("the user selects trance category")
  public void theUserSelectsTranceCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(3)")).click();
  }

  @When("the user selects tech-house category")
  public void theUserSelectsTechHouseCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(4)")).click();
  }

  @When("the user selects hard-dance category")
  public void theUserSelectsHardDanceCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(5)")).click();
  }

  @When("the user selects hardcore category")
  public void theUserSelectsHardcoreCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(6)")).click();
  }

  @When("the user selects hardhouse category")
  public void theUserSelectsHardhouseCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(7)")).click();
  }

  @When("the user selects hardstyle category")
  public void theUserSelectsHardstyleCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(8)")).click();
  }

  @When("the user selects minimal category")
  public void theUserSelectsMinimalCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(9)")).click();
  }

  @When("the user selects progressive category")
  public void theUserSelectsProgressiveCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(10)")).click();
  }

  @When("the user selects techno category")
  public void theUserSelectsTechnoCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(11)")).click();
  }

  @When("the user selects cantaditas category")
  public void theUserSelectsCantaditasCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(12)")).click();
  }

  @When("the user selects drumbass category")
  public void theUserSelectsDrumbassCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(13)")).click();
  }

  @When("the user adds a vinyl of the selected category to the cart")
  public void theUserAddsAVinylOfTheSelectedCategoryToTheCart() {
    WebElement element1 = driver.findElement(By.cssSelector("tr:nth-of-type(1) td:nth-of-type(1) a:nth-of-type(2)"));
    WebElement element2 = driver.findElement(By.cssSelector("tr:nth-of-type(1) td:nth-of-type(2) a:nth-of-type(2)"));
    WebElement element3 = driver.findElement(By.cssSelector("tr:nth-of-type(1) td:nth-of-type(3) a:nth-of-type(2)"));

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
}