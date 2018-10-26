package com.automationpractice.practicefinal.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import com.automationpractice.practicefinal.exceptions.ArticleNoExist;
import com.automationpractice.practicefinal.questions.ArticleInTheList;
import com.automationpractice.practicefinal.userinterfaces.AutomationPracticeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class ChooseProduct implements Task
{
	private String nameArticle;
	
	 public ChooseProduct(String nameArticle) 
	 {
		this.nameArticle = nameArticle;
	 }
	 

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		// TODO Auto-generated method stub
		System.out.println(nameArticle);
		String Yalet=(Text.of(AutomationPracticeComponents.LISTNUM).viewedBy(actor).asString());
		String [] lala= Yalet.split(" ");
		int numero= Integer.parseInt(lala[5]);
		System.out.println(numero);
		actor.should(seeThat(ArticleInTheList.Exist(),greaterThanOrEqualTo(Integer.parseInt(nameArticle))).orComplainWith(ArticleNoExist.class,ArticleNoExist.NOEXIST));
		actor.attemptsTo(Click.on(AutomationPracticeComponents.CHOOSEARTICLE.of(nameArticle)));
						
	}

	public static ChooseProduct of(String nameArticle) {
		
		return instrumented(ChooseProduct.class, nameArticle);	}

}
