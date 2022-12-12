@test
Feature: Testing all process to make a traditional sale

Scenario: Open Weblink Sales
When the user click on Weblink link
Then the user can see the Weblink pages

Scenario: Open the sales portal
Given the user hover over Weblink menu
When the user hover over option sales in list displayed
And the user click in option sales in the new list displayed
Then user can see the Sales pages

Scenario: Show the campaign in table
Given the user check the option Enable Auto Search
When the user select and type the campaign code in field Enter Campaign code
Then the typed campaign appear in table below

Scenario: Selecting the campaign in table to enable the sales button
Given the user click on campaign in table
Then the button the Sale button is enabled

Scenario: Confirm the campaign to sales
When the user click on Sale button
Then the user can see the Traditional Sale pages

Scenario: Add policy holder
Given the user click on button Add Policy holder
When type in field Personal ID a valid ID number
And press enter button in keyboard
Then the system fill all the required filds of form

Scenario: Select a policy holder
When the user click on Accept button
Then the policy holder is added to tradicional sale customer table

Scenario: Add product to traditional Sale
Given the user click on plus page icon of table campaign Availble products
When select an item of list benefit level
And click on button Accept
Then the product is added to Campaign available products

Scenario: Confirm the traditional sales
When the user click on Next button
Then the user can see the Payment Info pages

Scenario: Choice a payment options
When the user select a payment frequency
And select the credit card type
And choice the month and year of expiration date
And type the credit card number and security code
And the user can click on the Next button
Then the user can see the Sale confirmation page

Scenario: Confirm sale
When the user make the Sign 
And Click in button confirm sale
Then Appear the Sale Result page