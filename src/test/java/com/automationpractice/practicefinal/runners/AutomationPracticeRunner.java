package com.automationpractice.practicefinal.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
		(
		   features="src/test/resources/features/AutomationPracticeAddToCart.feature", 
		   glue="com.automationpractice.practicefinal.stepdefinitions",
		   snippets=SnippetType.CAMELCASE
		)
public class AutomationPracticeRunner {}
