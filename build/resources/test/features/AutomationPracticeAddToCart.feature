#Author: didosorio21@gmail.com
@AddToCart
Feature: AutomationPractice
  As a web user
  I want to add an item to the cart.
  To make a purchase

  Scenario Outline: Add To Cart
    Given Nairobi open the browser in the home page
    When she enters the name of the article in the search
      | article   |
      | <article> |
    When she press the Submit Search button
    When she chooses the article with name <namearticle>
    When she chooses the amount and size
      | quantity   | size   |
      | <quantity> | <size> |
    When she chooses the color <color>
    When she add to the car and proceed to checkout
    Then She should see the page of cart

    Examples: 
      | article        | namearticle | quantity | size | color |
      | DRESSES        |           6 |        5 |    2 |     2 |
  #    | SUMMER DRESSES |           2 |       12 |    3 |     1 |
#Underscore:that susan wants...
#CamelCase:ThatSusanWantsTo...
