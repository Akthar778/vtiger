package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webDriverUtility extends baseClass implements IAutoconstant{

	
	public void DragAndDrop(WebElement src,WebElement Destination) {
		Actions action =new Actions(driver);
		action.dragAndDrop(src, Destination).perform();
		
	}
	public void rightClick() {
		Actions action =new Actions(driver);
		action.contextClick().perform();
	}
	public void rightClick(WebElement element) {
		Actions action =new Actions(driver);
		action.contextClick(element).perform();
	}
	
	public void doubleClick() {
		Actions action =new Actions(driver);
		action.doubleClick().perform();
	}
	public void doubleClick(WebElement element) {
		Actions action =new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	public void mouseHoveringOnElement(WebElement element) {
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public Select selectReference(WebElement dropdown) {
		Select select =new Select(dropdown);
		return select;
	}
	public void handlingDropdown(WebElement dropdown, String value) {
		Select select =new Select(dropdown);
		try {
			select.selectByValue(value);
		}catch(NoSuchElementException e) {
			select.selectByVisibleText(value);
		}
	}	
	public void handlingDropdown(WebElement dropdown, int index) {
		Select select =new Select(dropdown);
		select.selectByIndex(index);
		
	}
	
	public void scrollingAction(int x,int y) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void clickingOnElement(WebElement element) {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void enteringDataIntoElement(String data, WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
	
	public void clearingDataFromElement(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=' '", element);
	}
	
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchingToFrame(String data) {
		driver.switchTo().frame(data);
	}
	
	public void switchingBackToMain() {
		driver.switchTo().defaultContent();
	}
	public void switchingBackToMain(String WindowID) {
		driver.switchTo().window(WindowID);
	}
	
	public Alert switchToAlert() {
		Alert alert =driver.switchTo().alert();
		return alert;
	}
	
	public void switchToWindow(Set<String> allWindowId, String targetWindowTitle) {
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(targetWindowTitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
			else {
				driver.close();
			}
		}
	}
	public void switchingtargetPage(Set<String> allWindowId, String parentId) {
		allWindowId.remove(parentId);
		for(String id:allWindowId) {
			driver.switchTo().window(id);
		}
	}
	public static String takingScreenshot(String screenshotName) {
		TakesScreenshot ss =(TakesScreenshot) driver;
		File photo =ss.getScreenshotAs(OutputType.FILE);
		String ldt = LocalDateTime.now().toString().replace(":", "-");
		
		String path = System.getProperty("user.dir")+SSPATH+screenshotName+""+ldt+".png";
		File destination=new File(path);
		
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
		
	}
	
}
