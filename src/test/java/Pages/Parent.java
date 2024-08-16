
package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class Parent {

    public WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String strData){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(strData);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text you are looking for was not found in the text.");
        //action la ESC ye basarak açık kutucuk veya mesaj var ise kapat
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }
    public void mySelect(WebElement element,String string){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select select=new Select(element);
        select.selectByVisibleText(string);
    }

    public String myGetText(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        String text=element.getText();

        return text;
    }

    public void myHoverOver(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(element).build().perform();
    }

    public static int myRandomNumber(int border) {
        if (border <= 0) {
            throw new IllegalArgumentException("Border must be greater than 0");
        }
        return (int) (Math.random() * border);
    }

}
