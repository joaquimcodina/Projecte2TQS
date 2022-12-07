package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
    driver.findElement(By.cssSelector(".top-links li:nth-of-type(5) a")).click();
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
    String valid = driver.findElement(By.cssSelector(".top-links li:nth-of-type(6) a")).getText();
    Assert.assertTrue(valid.contains("Cerrar sesión"));
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

  @When("the user selects other category")
  public void theUserSelectsOtherCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(14)")).click();
  }

  @When("the user selects old bases category")
  public void theUserSelectsOldBasesCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(15)")).click();
  }

  @When("the user selects melodiones category")
  public void theUserSelectsMelodionesCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(16)")).click();
  }

  @When("the user selects progremember category")
  public void theUserSelectsProgrememberCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(17)")).click();
  }

  @When("the user selects picturedisc category")
  public void theUserSelectsPicturediscCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(18)")).click();
  }

  @When("the user selects acid category")
  public void theUserSelectsAcidCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(19)")).click();
  }

  @When("the user selects eurohouse category")
  public void theUserSelectsEurohouseCategory() {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type(20)")).click();
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

  @When("the user selects record-vinyl menu")
  public void theUserSelectsRecordVinylMenu() {
    driver.findElement(By.cssSelector(".nav-1 a")).click();
  }

  @When("the user selects vinyl from the year 1985")
  public void theUserSelectsVinylFromTheYear() {
    driver.findElement(By.cssSelector("ol li:nth-of-type(1) a")).click();
  }

  @When("the user adds a vinyls to the wish list")
  public void theUserAddsAVinylsToTheWishList() {
    WebElement element1 = driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(1) .add-to li a"));
    Actions actions1 = new Actions(driver);
    actions1.moveToElement(element1).click();

    WebElement element2 = driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(2) .add-to li a"));
    Actions actions2 = new Actions(driver);
    actions2.moveToElement(element2).click();

    WebElement element3 = driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(3) .add-to li a"));
    Actions actions3 = new Actions(driver);
    actions3.moveToElement(element3).click();
  }

  @When("the user clicks my account")
  public void theUserClicksMyAccount() {
    driver.findElement(By.cssSelector(".top-links li:nth-of-type(2) a")).click();
  }

  @When("the user clicks wish list")
  public void theUserClicksWishList() {
    driver.findElement(By.cssSelector(".content ul li:nth-of-type(5) a")).click();
  }

  @When("the user writes a comment")
  public void theUserWritesAComment() {
    driver.findElement(By.cssSelector("tr:nth-of-type(1) td:nth-of-type(2) textarea")).sendKeys("I want this vinyl.");
    driver.findElement(By.cssSelector("tr:nth-of-type(2) td:nth-of-type(2) textarea")).sendKeys("I want this vinyl.");
    driver.findElement(By.cssSelector("tr:nth-of-type(3) td:nth-of-type(2) textarea")).sendKeys("I want this vinyl.");
  }

  @Then("the vinyls have been added to the wish list successfully")
  public void theVinylsHaveBeenAddedToTheWishListSuccessfully() {
    String valid = driver.findElement(By.cssSelector(".page-head h3")).getText();
    Assert.assertTrue(valid.contains("Mi lista de deseos"));
    driver.close();
  }
}