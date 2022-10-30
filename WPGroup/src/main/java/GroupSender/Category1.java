package GroupSender;

import java.io.FileNotFoundException;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.Throw;

public class Category1 {

	@Test
	public static void familyRelationship() throws Exception
	{
		WebDriver driver=InitDriver.startDriver();
		
		driver.get("https://groupsor.link/group/category/Family-Relationships");
		
		
		try {
			while(true) {
			//	Thread.sleep(3000);
				driver.findElement(By.id("load_more")).click();
			} 
			
		//	int x= 9/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		//list1	: grouplinks
			    LinkedList<String> Grouplinks= GroupLinks.findAllGroupLinks(driver);
		      
        //list2 : groupnames
		        LinkedList<String> Groupnames= GroupNames.findAllGroupNames(driver);

		//list3 : categorynames	
		        LinkedList<String> Categorynames= CategoryNames.findAllCategoryNames(driver);

		//list4 : countryname	
		        LinkedList<String> Countrynames= CountryNames.findAllCountryNames(driver);
		
		//list5 : languages	
		        LinkedList<String> languages= Languages.findAllLanguages(driver);
		      
		//Write Data Into Exelsheet
		    Thread.sleep(5000);
			WriteDataIntoExel.writeExelSheet( Grouplinks, Groupnames, Categorynames, Countrynames, languages);
			
		}
	}
	
}
