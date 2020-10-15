

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Action extends SetUp {
	public static void clickElement(String xpathElement){
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.click();
	}
	
	public static void typeText(String xpathElement, String text){
		WebElement inputElement = driver.findElement(By.xpath(xpathElement));
		inputElement.clear();
		inputElement.sendKeys(text);
	}
	
	public static void waitForVisible(String xpath){
		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
	}
	
	public static void selectElement(String xpathElement, String value){
		WebElement element = driver.findElement(By.xpath(xpathElement));
		Select select = new Select(element);
		select.selectByVisibleText(value);	
	}
	
	

}
