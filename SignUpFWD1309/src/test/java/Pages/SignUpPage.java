package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;

    By namelocator = By.xpath("//input[@name = 'name']");
    By emaillocator = By.xpath("//input[@data-qa='signup-email']");
    By signuplocator = By.xpath("//button[text()='Signup']");
    By signupformlocator = By.xpath("//b[text()='Enter Account Information']");
    By titlelocator = By.xpath("//input[@id='id_gender1']");
    By passwordloctor = By.xpath("//input[@class='form-control' and @id='password']");
    By daydropdrowlocator = By.xpath("//select[@id='days']");
    By monthdropdownloator = By.xpath("//select[@id='months']");
    By yeardropdownloator = By.xpath("//select[@id='years']");
    By firstnamelocator = By.xpath("//input[@id='first_name']");
    By lastnamelocator = By.xpath("//input[@id='last_name']");
    By address1locator = By.xpath("//input[@id='address1']");
    By countrydropdrowlocator = By.xpath("//select[@id='country']");
    By statelocator = By.xpath("//input[@id='state']");
    By citylocator = By.xpath("//input[@id='city']");
    By ziplocator = By.xpath("//input[@id='zipcode']");
    By mobilelocator = By.xpath("//input[@id='mobile_number']");
    By createaccountloator = By.xpath("//button[@data-qa='create-account']");
    By homepagelocator = By.xpath("//i[@class='fa fa-home']");




    public SignUpPage(WebDriver driver){
        this.driver = driver;

    }
    public void nameTextField(String name) throws Exception{
        WebElement nameText = driver.findElement(namelocator);
        nameText.sendKeys(name);
    }
    public void emailTextField(String email) throws Exception{
        WebElement emailText = driver.findElement(emaillocator);
        emailText.sendKeys(email);
    }
    public void SignupBtnField() throws Exception{
        WebElement signupBtn = driver.findElement(signuplocator);
        signupBtn.click();
    }

    public boolean signupform() throws Exception{
        return driver.findElement(signupformlocator).isDisplayed();
    }
    public void titleRadioBtn() throws Exception{
        WebElement titlebtn = driver.findElement(titlelocator);
        titlebtn.click();
    }

    public void passowrdTextField(String pass) throws Exception{
        WebElement passowrdText = driver.findElement(passwordloctor);
        passowrdText.click();
    }
    public void dayDropDwonField() throws Exception{
        WebElement dayDrop = driver.findElement(daydropdrowlocator);
        Select sel = new Select(dayDrop);
        sel.selectByValue("1");
    }
    public void monthDropDwonField() throws Exception{
        WebElement monthDrop = driver.findElement(monthdropdownloator);
        Select sel = new Select(monthDrop);
        sel.selectByVisibleText("January");
    }
    public void yearDropDwonField() throws Exception{
        WebElement yearDrop = driver.findElement(yeardropdownloator);
        Select sel = new Select(yearDrop);
        sel.selectByValue("1988");
    }

    public void firstTextField(String fname) throws Exception{
        WebElement firtNameText = driver.findElement(firstnamelocator);
        firtNameText.sendKeys(fname);
    }
    public void lastTextField(String lname) throws Exception{
        WebElement lastNameText = driver.findElement(lastnamelocator);
        lastNameText.sendKeys(lname);
    }
    public void address1TextField(String address) throws Exception{
        WebElement addressText = driver.findElement(address1locator);
        addressText.sendKeys(address);
    }
    public void countryDropDwonField() throws Exception{
        WebElement countryDrop = driver.findElement(countrydropdrowlocator);
        Select sel = new Select(countryDrop);
        sel.selectByValue("India");

    }
    public void stateTextField(String sate) throws Exception{
        WebElement sateText = driver.findElement(statelocator);
        sateText.sendKeys(sate);
    }
    public void cityTextField(String city) throws Exception{
        WebElement cityText = driver.findElement(citylocator);
        cityText.sendKeys(city);
    }

    public void zipTextField(String zipcode) throws Exception{
        WebElement zipText = driver.findElement(ziplocator);
        zipText.sendKeys(zipcode);
    }
    public void mobileTextField(String mobile) throws Exception{
        WebElement mobileText = driver.findElement(mobilelocator);
        mobileText.sendKeys(mobile);
    }
    public void createAccountBtn() throws Exception{
        WebElement caButon = driver.findElement(createaccountloator);
        caButon.click();
    }

    public boolean successAccountcreation() throws Exception{
        return driver.findElement(homepagelocator).isDisplayed();
    }

}
