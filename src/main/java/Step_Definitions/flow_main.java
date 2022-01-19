package Step_Definitions;

import Pages.MainMenu;
import Pages.dropdown;
import Pages.testBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class flow_main extends testBase {
    private MainMenu mainMenu;
    private dropdown dropdown;

    @Given("user is on web page")
    public void user_is_on_login_page() {
        driver.navigate().to(baseURL);
    }

    @And("user navigates to dropdown page")
    public void navigate_to_dropdown_page() throws InterruptedException {
        mainMenu = new MainMenu(driver);
        mainMenu.NavigateToDropDownPage();
    }

    @And("user gets values from the dropdown")
    public void get_values_from_dropdown() throws InterruptedException {
        dropdown = new dropdown(driver);
        dropdown.GetValuesFromDropDown();
    }

    @And("user clicks dropdown from the main menu")
    public void select_the_value_from_dropdown() throws InterruptedException {
        dropdown = new dropdown(driver);
        dropdown.ClickDropDown();
    }
}
