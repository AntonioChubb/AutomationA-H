@weblink2
Feature: Group test with multiple insured, multiples products, debit direct, printing insurance and send by email.

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
|CO02001402  |

Scenario Outline: Selecting the campaign in table to enable the sales button
Given the user click on <campaignCode> in table
Then the button the Sale button is enabled
Examples:
|campaignCode|
|CO02001402  |

Scenario: Confirm the campaign to sales
When the user click on Sale button
Then the user can see the Traditional Sale pages

Scenario Outline: Add principal policy holder
Given the user click on button Add Policy holder
When type in field Personal ID <IDNumber> and press enter button in keyboard
And the system fill all the required filds of form and click on Accept button
Then the <name> is added to tradicional sale customer table
Examples:
|IDNumber    |name                             |
|79005107    |CARLOS HOLMES TRUJILLO VALENZUELA|

Scenario Outline: Add spouse to policy
Given the user click on button Add Spouse
When type in field Personal ID <IDNumber> and press enter button
And the system fill all the required filds of form and click Accept button
Then the <name> is added to customer table
Examples:
|IDNumber    |name                         |
|43110675    |JAZMIN ASTRID RAMIREZ GIRALDO|

Scenario Outline: Add dependant to policy
Given the user click on button Add Dependant
When type in field PersonalID <IDNumber> and press enter button
And the system fill all the required filds form and click Accept button
Then the <name> is added to the customer table
Examples:
|IDNumber    |name                  |
|37924951    |ROSALBA PEREZ BAUTISTA|