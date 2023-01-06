@weblink3
Feature: Pay with giro. Bourderoux pay, other payer, new polici holder and additional holder

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
|BZ18013601  |

Scenario Outline: Selecting the campaign in table to enable the sales button
Given the user click on <campaignCode> in table
Then the button the Sale button is enabled
Examples:
|campaignCode|
|BZ18013601  |

Scenario: Confirm the campaign to sales
When the user click on Sale button
Then the user can see the Traditional Sale pages

Scenario Outline: Add principal policy holder
Given the user click on button <Button>
When type in field Personal ID <IDNumber> and press enter button in keyboard
And the system fill all the required filds of form and click on Accept button
Then the <name> is added to tradicional sale customer table
Examples:
|IDNumber    |name                               | Button            |
|98552817    |LUIS FERNANDO MONTOYA CARRASCAL    |btnAddPolicyHolder |

Scenario Outline: Add product to traditional Sale
Given the user click on Add Product icon <icon> of table campaign Availble products
When select <level> of list benefit level
And fill the field with <brand>, <model>, <tag>, <VIN> and <year>
And click on button Accept of new windows 
Then the <product> is added to Campaign available products table
Examples:
|icon |level       |brand          |model  |tag     | VIN           |year  |product  |
|4    |16 Lugares  |Ricardo Perez  |Ray    |Toyota  |ABC2022365479  |2019  |4        |

Scenario Outline: Add Beneficiary to traditional Sale
Given the user click on Add Beneficiary <AddBeneficiary> icon of table campaign Availble products
When click on Add Beneficiary Button
And fill the field with name <name> and percentage <percentage>
And Select the relationship <relationship>
And click on button Save Benneficiary 
And the benneficiary <name> is added to Manage Beneficiary table
Then the user click on close button of Manage Beneficiary table
Examples:
|AddBeneficiary |name              |percentage |relationship   |
|4              |Elvia Montoya     |100        |Girlfriend     |

Scenario: Confirm the sales
When the user click on Next button
Then the user can see the Payment Info pages    