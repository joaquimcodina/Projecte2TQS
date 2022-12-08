package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
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

  @When("^the user selects (.*)")
  public void theUserSelectsCategory(int id) {
    driver.findElement(By.cssSelector("#categorias-home a:nth-of-type("+id+")")).click();
  }

  @When("the user adds a vinyl of the selected category to the cart")
  public void theUserAddsAVinylOfTheSelectedCategoryToTheCart() throws InterruptedException {
    Thread.sleep(5000);
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

  @When("select record-vinyl menu")
  public void theUserSelectsRecordVinylMenu() {
    driver.findElement(By.cssSelector(".nav-1 a")).click();
  }

  @When("^select vinyl from the (.*)")
  public void selectVinylFromTheYear(int id) {
    WebElement element = driver.findElement(By.cssSelector("#narrow-by-list dd:nth-of-type(2) ol li:nth-of-type("+id+") a"));
    JavascriptExecutor jse2 = (JavascriptExecutor)driver;
    jse2.executeScript("arguments[0].scrollIntoView()", element);
    new Actions(driver).moveToElement(element).click().perform();
  }

  @When("^select from the (.*)")
  public void selectFromTheStamp(int id) {
    Select select = new Select(driver.findElement(By.id("fabricante")));
    JavascriptExecutor jse2 = (JavascriptExecutor)driver;
    jse2.executeScript("arguments[0].scrollIntoView()", select);
    select.selectByValue("https://www.welcomedjshop.com/discos-vinilos.html?fabricante="+id);
  }

  @When("^filter by (.*) (.*)")
  public void filterByCategoryYear(int category, int year) throws InterruptedException {
    WebElement element1 = driver.findElement(By.cssSelector("#narrow-by-list dd:nth-of-type(1) ol li:nth-of-type("+category+") a"));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].scrollIntoView()", element1);
    new Actions(driver).moveToElement(element1).click().perform();
    Thread.sleep(3000);

    WebElement element2 = driver.findElement(By.cssSelector("#narrow-by-list dd:nth-of-type(1) ol li:nth-of-type("+year+") a"));
    jse.executeScript("arguments[0].scrollIntoView()", element2);
    new Actions(driver).moveToElement(element2).click().perform();
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

  @When("^the user search vinyls (.*)")
  public void theUserSearchVinylsName(String name) {
    driver.findElement(By.id("search")).sendKeys(name);
  }

  @When("the user clicks search button")
  public void theUserClicksSearchButton() {
    driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
  }

  @When("^filter by (.*)")
  public void filterByOption(String option) throws InterruptedException {
    Thread.sleep(5000);
    Select select = new Select(driver.findElement(By.cssSelector(".col-main table:nth-of-type(2) tbody tr td:nth-of-type(3) select")));
    select.selectByVisibleText(option);
  }
}