@newHolder
Feature: Add a new policy holder, new spouse and new dependant

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

Scenario Outline: Add new principal policy holder
Given the user click on button <Button>
When type in field Personal ID <IDNumber> and press the tab button in keyboard
And fill the firstname filed with name <name>
And fill last name field with name <lastname>
And fill birth date field with date <birthdate>
And fill e-mail field with email <email>
And Select the option <sex> from sex list
And Click in chekbox Home
And fill the address1 field with address <address1>
And Select the province <province> from provinces list
Then Fill the city field with city <city>
And the system fill all the required filds of form and click on Accept button
Then the <name> and <lastname> is added to tradicional sale customer table
Examples:
|Button             |IDNumber    |name      |lastname   |birthdate   |email            |sex       |address1               |province   |city     |
|btnAddPolicyHolder |1002300     |America   |Urriola    |07091979    |correo@mail.com  |Female    |Direccion de pruebas   |Cauca      |Ciudad   | 

Scenario Outline: Add new spouse and dependant
Given the user click on button <Button>
When type in field Personal ID <IDNumber> and press the tab button in keyboard
And fill the firstname filed with name <name>
And fill last name field with name <lastname>
And fill birth date field with date <birthdate>
And Select the option <sex> from sex list
And the system fill all the required filds of form and click on Accept button
Then the <name> and <lastname> is added to tradicional sale customer table
Examples:
|Button             |IDNumber    |name      |lastname   |birthdate   |sex       |
|btnAddSpouse       |2421107     |Juan Luis |Urriola    |10101982    |Male      |
|btnAddDependant    |50170973    |Jose Luis |Urriola    |12231999    |Male      |