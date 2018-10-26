package com.automationpractice.practicefinal.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.automationpractice.practicefinal.models.CaracteristicsArticleModel;
import com.automationpractice.practicefinal.models.NameArticleModel;
import com.automationpractice.practicefinal.tasks.AddToCart;
import com.automationpractice.practicefinal.tasks.ChooseProduct;
import com.automationpractice.practicefinal.tasks.ChooseQuanty;
import com.automationpractice.practicefinal.tasks.ChooseSize;
import com.automationpractice.practicefinal.tasks.Choosecolor;
import com.automationpractice.practicefinal.tasks.ConfirmAddToCart;
import com.automationpractice.practicefinal.tasks.OpenTheBrowserAutomation;
import com.automationpractice.practicefinal.tasks.ProcedCheckOut;
import com.automationpractice.practicefinal.tasks.SearchClick;
import com.automationpractice.practicefinal.tasks.SingArticleToSearch;
import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AutomationPracticeAddToCartStepDefinitions 
{
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	private Actor nairobi =  Actor.named("Nairobi");
	private AutomationPracticeHomePage automationpracticeHomePage;
	@Before
	public void setup()
	{
		nairobi.can(BrowseTheWeb.with(herBrowser));
	}
	@Given("^Nairobi open the browser in the home page$")
	public void nairobiOpenTheBrowserInTheHomePage()throws Exception 
	{
	   //Precondicion
		nairobi.wasAbleTo(OpenTheBrowserAutomation.on(automationpracticeHomePage));
		
	}

	@When("^she enters the name of the article in the search$")
	public void sheEntersTheNameOfTheArticleInTheSearch(List<NameArticleModel>Name) {
		//Condicion
		nairobi.attemptsTo(SingArticleToSearch.the(Name.get(0)));
	}

	@When("^she press the Submit Search button$")
	public void shePressTheSubmitSearchButton() throws Exception
	{
		//Condicion
		nairobi.attemptsTo(SearchClick.She());
	}

	@When("^she chooses the article with name (.*)$")
	public void sheChoosesTheArticleWithName(String NameArticle)throws Exception
	{
		//Condicion
		nairobi.attemptsTo(ChooseProduct.of(NameArticle));
	}

	@When("^she chooses the amount and size$")
	public void sheChoosesTheAmountAndSize(List<CaracteristicsArticleModel>Caracteristics)throws Exception
	{
		//Condicion
		nairobi.attemptsTo(ChooseQuanty.the(Caracteristics.get(0)));
		nairobi.attemptsTo(ChooseSize.the(Caracteristics.get(0)));	
	}
	
	@When("^she chooses the color(.*)$")
	public void sheChoosesTheColor(String Color)throws Exception
	{
		//Condicion
		nairobi.attemptsTo(Choosecolor.the(Color));
	}
	@When("^she add to the car and proceed to checkout$")
	public void sheAddToTheCarAndProceedToCheckout() throws Exception
	{
		//Condicion
		nairobi.attemptsTo(AddToCart.the());
		nairobi.attemptsTo(ConfirmAddToCart.the());
		nairobi.attemptsTo(ProcedCheckOut.the());		
	}

	@Then("^She should see the page of cart$")
	public void sheShouldSeeThePageOfCart()throws Exception 
	{
	   //PostCondicion
	}

}
