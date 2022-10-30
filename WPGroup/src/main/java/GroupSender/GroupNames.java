package GroupSender;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GroupNames
{

	public static LinkedList<String> findAllGroupNames(WebDriver driver) throws Exception
	{
		Thread.sleep(3000);
		LinkedList<WebElement> allnames=new LinkedList<>();
		allnames.addAll(driver.findElements(By.xpath("//span/img[@class='image']")));
		
		//Read all element names
		
		LinkedList<String> groupnames=new LinkedList<>();
		
		for (WebElement webelement : allnames) {
			
			groupnames.add(webelement.getAttribute("alt").toString());
			
		}
			
			
			
		
		groupnames.removeIf(String::isEmpty);
		System.out.println("groupnames " + groupnames.size());
		
		return groupnames;
	}
	
}
