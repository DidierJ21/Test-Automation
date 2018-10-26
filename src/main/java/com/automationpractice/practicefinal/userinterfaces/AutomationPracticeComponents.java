package com.automationpractice.practicefinal.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationPracticeComponents 
{
	public static final Target SEARCHAREA = Target.the("Automation Practice search area").located(By.name("search_query"));
	public static final Target SEARCLOGO = Target.the("Automation Practice Logo contact").located(By.id("contact-link"));
	public static final Target SEARCHBUTTON = Target.the("Automation Practice search button").located(By.name("submit_search"));
	public static final Target RESULTLIST = Target.the("Automation Practice Search List").located(By.id("list"));
	public static final Target QUANTY = Target.the("Automation Practice product quanty").located(By.id("quantity_wanted"));
	public static final Target CHOOSEARTICLE = Target.the("Choose article of list products").locatedBy("//*[@id=\"center_column\"]/ul/li[{0}]/div/div/div[2]/h5/a");
	public static final Target SIZE = Target.the("Choose size of the product").located(By.name("group_1"));
	public static final Target CHOOSECOLOR = Target.the("Choose color of the product").locatedBy("//*[@id=\"color_to_pick_list\"]/li[{0}]");
	public static final Target ADDCART = Target.the("Automation Practice Add to cart the product choose").located(By.id("add_to_cart"));
	public static final Target CONFIRM = Target.the("Confirm add to cart").locatedBy("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	public static final Target PROCEEDCHECKOUT = Target.the("Continue to add cart  option").locatedBy("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	public static final Target LISTNUM = Target.the("Continue to add cart  option").locatedBy("//div[@class='product-count']");

	
	
	//*[@id="quantity_wanted"]
	//public static final Target CHOOSEARTICLE = Target.the("article").locatedBy("//*[@id=\"center_column\"]/ul/li[{0}]/div/div/div[1]/div/a[1]");
	//public static final Target CHOOSEARTI = Target.the("articles").locatedBy("//*[@id=\"center_column\"]/ul/li[]/div/div/div[1]/div/a[1]");
	//*[@id="color_to_pick_list"]/li[1]
	//*[@class='product_img_link']
	//*[@id="center_column"]/p[2]/a[1]/span
	//*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span
	//*[@id="center_column"]/ul/li[1]/div/div/div[1]/div/a[1]
	//*[@id="center_column"]/ul/li[6]/div/div/div[1]/div/a[1]/img
	//*[@id="center_column"]/ul/li[7]/div/div/div[2]/h5/a
	//*[@id="center_column"]/ul/li[6]/div/div/div[2]/h5/a
	//*[@id="center_column"]/ul/li[6]/div/div/div[2]/p
	//*[@id="product_1_1_0_0"]/td[1]/a/img
	//*[@id="center_column"]/div/div/div[3]/h1
	
	
}
