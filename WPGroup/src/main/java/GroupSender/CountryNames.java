package GroupSender;

import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountryNames 
{
	
	public static LinkedList<String> findAllCountryNames(WebDriver driver) throws Exception
	{
		Thread.sleep(3000);
		Thread.sleep(3000);
		LinkedList<WebElement> allcountrynames=new LinkedList<>();
		allcountrynames.addAll(driver.findElements(By.xpath("//div/span[2]/img[@class='icon']/following-sibling::a")));
	
		//Read all category names	
		LinkedList<String> countrynames=new LinkedList<>();
		for (WebElement country : allcountrynames)
		{
			countrynames.add(country.getText());
		//	System.out.println(country.getText());
		}
		System.out.println( "countrynames "+countrynames.size());
		
		return countrynames;
	}

}
