package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class WebDriverUtilities {
	public void dropDown(WebElement ele, String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
public void draganddrop(WebDriver driver, WebElement target, WebElement source) {
	Actions a=new Actions(driver);
	a.dragAndDrop(source,target).perform();
}
public void Switchtoframe(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void alertpopup(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void scrollBar(WebDriver driver,int y,int x) {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy("+x+","+y+")");
}
public void switchtabs(WebDriver driver) {
	Set<String> child=driver.getWindowHandles();
	for (String b:child) {
		driver.switchTo().window(b);
		
	}
}
}


