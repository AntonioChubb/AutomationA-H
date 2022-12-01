Feature: Test Inicio de Sesion

Scenario: Login in sales portal Chubb

Given The user access the Chubb sales portal
When the user enter a valid username and password 
And click on Iniciar session button
Then the user can see the Chubb sales menu
