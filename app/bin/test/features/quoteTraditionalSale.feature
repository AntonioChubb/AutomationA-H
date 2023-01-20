@quoteTraditional
Feature: Making a traditional quote

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
When the user click on Quote button 
Then the user can see the Quote Page
Examples:
|campaignCode|
|CO02001402  |

Scenario Outline: Add new principal policy holder to quote
Given the user click on button <Button>
And fill birth date field with date <birthdate>
And Select the option <sex> from sex list
And the system fill all the required filds of form and click on Accept button
Examples:
|Button             |birthdate   |sex       |
|btnAddPolicyHolder |05091980    |Female    |

Scenario Outline: Add product to traditional Sale Quote
Given the user click on plus page <icon> of table campaign Availble products
When select the <level> level of list benefit level in screen
And click on button Accept
Then user can click on the button Quote
Examples:
|icon |level                    |
|4    |Plan B (Grupo Familiar)  |

Scenario Outline: Select the quote payment frequency
When user select the option <paymentFrequency> of list
And press the Accept button
Then the user can see the Quote Value
Examples:
|paymentFrequency |
|Monthly          |