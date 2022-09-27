package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.Homepage;
import pages.LoginPage;
import pages.ProductPage;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;

public class Test01_AddTheCard {

    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage= new ProductPage();

    @Given("Users can be go to login page")
    public void users_can_be_go_to_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        homepage.acceptAllCookies.click();


    }

    @When("Users can be login")
    public void users_can_be_login() {

        BrowserUtils.waitForPageToLoad(20);
        homepage.loginButton.click();
        loginPage.email.sendKeys(ConfigurationReader.get("username"));
        loginPage.continueButton.click();
        loginPage.password.sendKeys(ConfigurationReader.get("password"));
        loginPage.signIn.click();

        BrowserUtils.waitFor(1);
        String name ="enis";
        Assert.assertEquals(name,homepage.loginButton.getText());



    }

    @When("Users can select product")
    public void users_can_select_product() {
        BrowserUtils.waitForPageToLoad(20);
        homepage.bestSeller.click();
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(currentUrl.toLowerCase().contains("bestseller"));

        productPage.termometer.click();
        String productName= "termometre";
        String productUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(productUrl.toLowerCase().contains(productName));



    }
    @When("Users can select {int} quantity")
    public void users_can_select_quantity(Integer int1) {
        BrowserUtils.waitForPageToLoad(20);

        Select select = new Select(Driver.get().findElement(By.id("quantity")));
        select.selectByIndex(1);
        Assert.assertEquals("2",select.getFirstSelectedOption().getAttribute("value"));


    }
    @Then("Users can logout")
    public void users_can_logout() {

        BrowserUtils.hover(homepage.loginButton);
        homepage.logout.click();
        Assert.assertEquals("giriş yap",loginPage.signInText.getAttribute("innerText").toLowerCase());
        BrowserUtils.waitFor(2);
        Driver.closeDriver();

    }
}
