@traditional
Feature: Testing all process to make a traditional sale

Scenario: Login in sales portal Chubb
Given The user access the Chubb sales portal
When the user enter a valid username and password 
And click on Iniciar session button
Then the user can see the Chubb sales menu

Scenario: Open Weblink Sales
When the user click on Weblink link
Then the user can see the Weblink pages

Scenario: Open the sales portal
Given the user hover over Weblink menu
When the user hover over option sales in list displayed
And the user click in option sales in the new list displayed
Then user can see the Sales pages

Scenario Outline: Show the campaign in table
Given the user check the option Enable Auto Search
When the user select and type the campaign <campaignCode> in field Enter Campaign code
Then the typed <campaignCode> appear in table below
Examples:
|campaignCode|
|AR12002301  |

Scenario Outline: Selecting the campaign in table to enable the sales button
Given the user click on <campaignCode> in table
Then the button the Sale button is enabled
Examples:
|campaignCode|
|AR12002301  |

Scenario: Confirm the campaign to sales
When the user click on Sale button
Then the user can see the Traditional Sale pages

Scenario Outline: Add principal policy holder
Given the user click on button <Button>
When type in field Personal ID <IDNumber> and press enter button in keyboard
And the system fill all the required filds of form and click on Accept button
Then the <name> is added to tradicional sale customer table
Examples:
|IDNumber    |name                | Button            |
|17459844    |MARIA ALBA URRISTE  |btnAddPolicyHolder |

Scenario Outline: Add product to traditional Sale
Given the user click on plus page <icon> of table campaign Availble products
When select the <level> level of list benefit level in screen
And click on button Accept
Then the <product> is added to Campaign available products
Examples:
|icon |level            | product  |
|4    |Benefit Level 2  |4         |

Scenario: Confirm the traditional sales
When the user click on Next button
Then the user can see the Payment Info pages

Scenario: Choice a payment options
When select the credit card type
And choice the month and expiration date year
Then type the credit card number and security code

Scenario: Confirm the payment options
When the user click on the Next button
Then the user can see the Sale confirmation page

Scenario: Confirm sale
When the user click in button confirm sale
Then Appear the Sale Result page