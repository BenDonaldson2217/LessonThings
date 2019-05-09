package packages;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class aTest {

    public WebDriver driver;

    @Given("^the correct web address$")
    public void the_correct_web_address(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/welcome.html");
        driver.manage().window().maximize();
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() {

        WebElement we = driver.findElement(By.xpath("//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[3]"));
        we.click();

        System.out.print("aafsaf");
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {
      WebElement we = driver.findElement(By.xpath("//*[@id=\'wsb-element-00000000-0000-0000-0000-000450914921\']/div/h1"));
      assertEquals("Menu", we.getText());
    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {
        WebElement we = driver.findElement(By.xpath("//*[@id=\'wsb-nav-00000000-0000-0000-0000-000450914915\']/ul/li[5]/a"));
        we.click();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page()  {
        WebElement we = driver.findElement(By.xpath("//*[@id=\'wsb-element-00000000-0000-0000-0000-000451989411\']/div/p/span/strong"));
        assertEquals("Pay with Credit Card or Log In", we.getText());

    }

}
