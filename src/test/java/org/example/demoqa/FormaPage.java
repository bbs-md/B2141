package org.example.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage {

    public static WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameEl;

    @FindBy(id = "lastName")
    private WebElement lastNameEl;

    @FindBy(id = "userEmail")
    private WebElement userEmailEl;

    @FindBy(id = "gender-radio-1")
    private WebElement genderMaleEl;

    @FindBy(id = "state")
    private WebElement stateEl;


    public FormaPage(WebDriver driver) {
        FormaPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String firstNameParam) {
        firstNameEl.sendKeys(firstNameParam);
    }

    public void setLastName(String lastNameParam) {
        lastNameEl.sendKeys(lastNameParam);
    }

    public void setEmail(String firstNameParam) {
        userEmailEl.sendKeys(firstNameParam);
    }

    public void setGenderMale() {
        genderMaleEl.sendKeys(" ");
    }

    public void setState(String stateParam) {
        stateEl.click();
    }
}
