package automation.test.scripts.tipapp;

import java.net.MalformedURLException;
import base.TestSuiteBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestTipValues extends TestSuiteBase {

    @BeforeClass
    public void beforeClass() throws MalformedURLException {

    }

    @Test (priority=1)
    public void checkTipAmountDefault() throws Exception {
        //Case 1 - Amount = 500
        //Tip % = 15% (Default Value)
        //Expected - 75,00
        Float totalTip = (Float.valueOf(main.getPercentageValue()) * Float.valueOf(main.enterAmount("500"))/100);
        Assert.assertEquals(totalTip.floatValue(),75.00);
        Thread.sleep(5000);
    }

    @Test (priority=2)
    public void changeTipPercentage() throws Exception {
        //Case 2 - Amount = 500
        //Tip % = 20% (Modify Value)
        //Expected - 75,00
        main.settingsButton.click();
        settings.changeTipPercentage("20");
        Assert.assertEquals(main.tipPercValue.getText(),"20%");
        Thread.sleep(5000);
    }

    @Test (priority=3)
    public void checkTipAmountUpdated() throws Exception {
        //Case 3 - Amount = 500
        //Tip % = 20% (Updated value)
        //Expected - 100.00
        Float totalTip = (Float.valueOf(main.getPercentageValue()) * Float.valueOf(main.enterAmount("500"))/100);
        Assert.assertEquals(totalTip.floatValue(),100.00);
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() throws Exception {

    }
}