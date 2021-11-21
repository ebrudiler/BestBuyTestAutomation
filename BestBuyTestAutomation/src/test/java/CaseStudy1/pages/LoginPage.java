package CaseStudy1.pages;

import CaseStudy1.config.PropertiesFile;
import CaseStudy1.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    PropertiesFile config = new PropertiesFile();

    @FindBy(id = "fld-e")
    WebElement loginBox;

    @FindBy(id = "fld-p1")
    WebElement passwordBox;

    @FindBy(id = "google-plus-colors")
    WebElement googleButton;

    public void login() {
        String email = PropertiesFile.getProperty("Email");
        String password = PropertiesFile.getProperty("Password");
        loginBox.sendKeys(email);
        passwordBox.sendKeys(password, Keys.ENTER);
    }
}