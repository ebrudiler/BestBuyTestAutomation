package CaseStudy1.pages;

import CaseStudy1.utils.Driver;
import CaseStudy1.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "[alt='United States']")
    public WebElement country;

    @FindBy(css = ".c-close-icon.c-modal-close-icon")
    public WebElement closeButton;

    @FindBy(id = "gh-search-input")
    public WebElement searchBox;

    @FindBy(css = "[aria-label='submit search']")
    public WebElement searchIcon;

    @FindBy(css = "a.btn.btn-white.btn-sm")
    public WebElement learnmoreButton;


    public void chooseUS(){
        country.click();
    }

    public void closePopup(){
        closeButton.click();
    }

    public void searchFor(String searchKey) {
        searchBox.click();
        searchBox.sendKeys(searchKey);
        searchIcon.click();

    }

    public void openDropdown(String dropdown) {
        String locator = "//span[text()='" + dropdown + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    public void openSubmenu(String submenu) {
        Helper.clickWithLinkText(submenu);
    }

    public void openMyCreditCardPage() {
        learnmoreButton.click();
    }
}