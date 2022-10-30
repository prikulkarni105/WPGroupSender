package GroupSender;

import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GroupLinks
{

	public static LinkedList<String> findAllGroupLinks(WebDriver driver) throws Exception
	{
		Thread.sleep(3000);
		LinkedList<WebElement> alllinks=new LinkedList<>();
		alllinks.addAll(driver.findElements(By.xpath("//span[@class='joinbtn']")));
		
		//reading only links from webelements
		LinkedList<String> grouplinks=new LinkedList<>();
		for (WebElement link : alllinks) 
		{
			grouplinks.add(link.getAttribute("href"));
		//	System.out.println(link.getText() + " - " + link.getAttribute("href") );
		}
		System.out.println("grouplinks "+grouplinks.size());
		
		return grouplinks;
	}
	
}
