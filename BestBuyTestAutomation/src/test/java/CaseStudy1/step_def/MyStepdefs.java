package CaseStudy1.step_def;

import CaseStudy1.pages.*;
import CaseStudy1.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Homepage homepage = new Homepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    LoginPage loginpage = new LoginPage();
    AccountPage accountpage = new AccountPage();

    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @When("I close the pop up")
    public void iCloseThePopUp() {
        homepage.closePopup();}

    @When("Verify page title {string}")
    public void verifyPageTitle(String Title) {
        Helper.verifyTitle(Title);}

    @When("I search for {string}")
    public void iSearchFor(String searchKey) {
        homepage.searchFor(searchKey);
    }

    @Then("search result should be seen")
    public void searchResultShouldBeSeen() {
        searchResultPage.verifySearchResult();
    }

    @And("I open {string} dropdown menu")
    public void iOpenDropdownMenu(String dropdown) {
        homepage.openDropdown(dropdown);
    }

    @And("I choose {string} submenu")
    public void iChooseSubmenu(String submenu) {
        homepage.openSubmenu(submenu);
    }

    @And("Login with credentials")
    public void loginWithCredentials() {
        loginpage.login();
    }

    @Then("Verify successful login")
    public void verifySuccessLogin() {
        accountpage.verifyLogin(); }
}
