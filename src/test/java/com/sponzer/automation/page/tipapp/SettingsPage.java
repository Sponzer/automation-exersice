package com.sponzer.automation.page.tipapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {

    public WebDriver driver;

    @FindBy(id = "org.traeg.fastip:id/tipPercentageEditText")
    private WebElement tipPercentageField;

    @FindBy(id = "org.traeg.fastip:id/saveSettingsButton")
    private WebElement saveSettingsButton;


    public SettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeTipPercentage(String percentage) {
        tipPercentageField.clear();
        tipPercentageField.sendKeys(percentage);
        saveSettingsButton.click();
    }
}