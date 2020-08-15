package com.sponzer.automation.page.tipapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import utilities.Utils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

public class MainPage {

    public WebDriver driver;
    Utils tools = new Utils();

    @FindBy(id = "org.traeg.fastip:id/billAmtEditText")
    public WebElement amountField;

    @FindBy(id = "org.traeg.fastip:id/calcTipButton")
    public WebElement calculateButton;

    @FindBy(id = "org.traeg.fastip:id/tipPctTextView")
    public WebElement tipPercValue;

    @FindBy(id = "org.traeg.fastip:id/tipAmtTextView")
    public WebElement tipAmountValue;

    @FindBy(id = "org.traeg.fastip:id/totalAmtTextView")
    public WebElement totalAmountValue;


    @FindBy(id = "org.traeg.fastip:id/menu_settings")
    public WebElement settingsButton;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String enterAmount(String amount) {
        amountField.click();
        amountField.sendKeys(amount);
        calculateButton.click();
        amount = amountField.getText();
        return amount;
    }

    public String getPercentageValue() throws ParseException {
        BigDecimal percentage = tools.parse(tipPercValue.getText(),Locale.US);
        String percentageValue = percentage.toString();
        return percentageValue;
    }


    public String getTipValue() throws ParseException {
        BigDecimal tip = tools.parse(tipAmountValue.getText(),Locale.US);
        String tipValue = tip.toString();
        return tipValue;
    }


}