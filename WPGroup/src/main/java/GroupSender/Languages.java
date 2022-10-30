package GroupSender;

import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Languages 
{
	
	public static LinkedList<String> findAllLanguages(WebDriver driver) throws Exception
	{
		Thread.sleep(3000);
		LinkedList<WebElement> alllanguage=new LinkedList<>();
		alllanguage.addAll(driver.findElements(By.xpath("//div/span[3]/img[@class='icon']/following-sibling::a")));
	
		//Read all category names	
		LinkedList<String> languagelist=new LinkedList<>();
		for (WebElement language : alllanguage)
		{
			languagelist.add(language.getText());
	//		System.out.println(language.getText());
		}
		System.out.println( "languagenames "+languagelist.size());
		return languagelist;
	}

}
