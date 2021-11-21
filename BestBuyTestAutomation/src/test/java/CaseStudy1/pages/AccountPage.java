package CaseStudy1.pages;

import CaseStudy1.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public AccountPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[contains(text(),'Hi,')]" )
    WebElement LoginText;

    public void verifyLogin() {
        Assert.assertTrue(LoginText.getText().contains("Hi,"));
    }
}
