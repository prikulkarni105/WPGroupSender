package GroupSender;

import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryNames
{

	public static LinkedList<String> findAllCategoryNames(WebDriver driver) throws Exception
	{
		Thread.sleep(3000);
		LinkedList<WebElement> allcategorynames=new LinkedList<>();
		allcategorynames.addAll(driver.findElements(By.xpath("//div/span[1]/img[@class='icon']/following-sibling::a")));
		
		//Read all category names
		LinkedList<String> categorynames=new LinkedList<>();
		for (WebElement category : allcategorynames)
		{
			categorynames.add(category.getText());
		}
		System.out.println( "categorynames "+categorynames.size());
		return categorynames;
	}
	
}
