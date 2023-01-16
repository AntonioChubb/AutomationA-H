@otherPayer

Feature: Traditional sale with a new payer

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
|CO19008003  |

Scenario Outline: Selecting the campaign in table to enable the sales button
Given the user click on <campaignCode> in table
Then the button the Sale button is enabled
Examples:
|campaignCode|
|CO19008003  |

Scenario: Confirm the campaign to sales
When the user click on Sale button
Then the user can see the Traditional Sale pages

Scenario Outline: Add principal policy holder
Given the user click on button <Button>
When type in field Personal ID <IDNumber> and press enter button in keyboard
And the system fill all the required filds of form and click on Accept button
Then the <name> is added to tradicional sale customer table
Examples:
|IDNumber    |name                            | Button             |
|9203841     |RAFAEL ENRIQUE CABEZAS ZUÑIGA   |btnAddPolicyHolder  |

Scenario Outline: Add product to traditional Sale
Given the user click on plus page <icon> of table campaign Availble products
When select the <level> level of list benefit level in screen
And click on button Accept
Then the <product> is added to Campaign available products
Examples:
|icon |level             | product  |
|4    |PLAN B PREMIUM    |4         |

Scenario: Confirm the traditional sales
When the user click on Next button
Then the user can see the Payment Info pages

Scenario: Check the checkbox Policy Payer is different than Policy Holder
Then the user check the box Policy Payer is different than Policy Holder

Scenario Outline: Add a new Policy Payer
Given the user fill the Personal ID field with <ID>
When fill the name field with <name>
And fill the lastname field with <lastname>
And fill the birthdate field with <birthdate>
And Select the sex <sex> from the policy payer dropdown list
And type the <address1> in field address1
And select the province <province> from the list
And type the home city <city> from user
Examples:
|ID        |name      |lastname  |birthdate   |sex     |address1              |province   |city      |
|924567    |Amelia    |Perez     |10101975    |Female  |Direccion de pruebas  |Cauca      |Ciudad    |

Scenario: Confirm the payment options
When the user click on the Next button
Then the user can see the Sale confirmation page

Scenario: Confirm sale
When the user click in button confirm sale
Then Appear the Sale Result page