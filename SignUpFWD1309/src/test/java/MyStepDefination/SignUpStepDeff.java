package MyStepDefination;

import Pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpStepDeff {

    WebDriver driver = Hooks.driver;
    SignUpPage signuppage;

    @Given("user is on application login page")
    public void user_is_on_application_login_page() throws Exception{
        driver.get("https://www.automationexercise.com/login");
        signuppage = new SignUpPage(driver);
    }
    @Given("i provide valid name and emailid")
    public void i_provide_valid_name_and_emailid() throws Exception{
        signuppage.nameTextField("Amit Test01");
        signuppage.emailTextField("Amittest01@gmail.com");
    }
    @When("i click on signup button")
    public void i_click_on_signup_button() throws Exception{
        signuppage.SignupBtnField();
    }
    @Then("i successfully navigate to signup page")
    public void i_successfully_navigate_to_signup_page() throws Exception{
        Assert.assertEquals(signuppage.signupform(), true);
    }
    @Given("i provide valid title")
    public void i_provide_valid_title() throws Exception{
        signuppage.titleRadioBtn();
    }
    @And("i provide valid password")
    public void i_provide_valid_password() throws Exception{
        signuppage.passowrdTextField("amiy@1234");

    }
    @And("i provide valid date of birth")
    public void i_provide_valid_date_of_birth() throws Exception{
        signuppage.dayDropDwonField();
        signuppage.monthDropDwonField();
        signuppage.yearDropDwonField();

    }
    @And("i provide valid first name")
    public void i_provide_valid_first_name() throws Exception{
        signuppage.firstTextField("amit");

    }
    @And("i provide valid last name")
    public void i_provide_valid_last_name() throws Exception{
        signuppage.lastTextField("test01");

    }
    @And("i provide valid address")
    public void i_provide_valid_address() throws Exception{
        signuppage.address1TextField("whitefield");

    }
    @And("i select the country")
    public void i_select_the_country() throws Exception{
        signuppage.countryDropDwonField();

    }
    @And("i provide valid state")
    public void i_provide_valid_state() throws Exception{
        signuppage.stateTextField("karnataka");

    }
    @And("i provide valid city")
    public void i_provide_valid_city() throws Exception{
        signuppage.cityTextField("bangalore");

    }
    @And("i provide valid zipcode")
    public void i_provide_valid_zipcode() throws Exception{
        signuppage.zipTextField("56001");

    }
    @And("i provide valid mobile number")
    public void i_provide_valid_mobile_number() throws Exception{
        signuppage.mobileTextField("765478765");

    }
    @When("i click create account button")
        public void i_click_create_account_button() throws Exception{
        signuppage.createAccountBtn();
    }
    @Then("i successfully navigate to home page")
    public void i_uccessfully_navigate_to_home_page () throws Exception{
        Assert.assertEquals(signuppage.successAccountcreation(), true);
    }
}
