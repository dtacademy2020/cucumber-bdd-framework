package com.automationpractice.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Driver;

public class DressesPage {
	
	public DressesPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//div[@id='subcategories']//h5//a")
	public List<WebElement> subcategories;
	
	@FindBy (xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a")
	public List<WebElement>  sizes;
	
	
	

}
