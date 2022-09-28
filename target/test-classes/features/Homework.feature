@HomeworkLoginfeature 
Feature: Techfios bank and cash New Account Functionality 

@Scenario:1
Scenario Outline: User should be able to login with valid credentials and open a new account	
    Given User is on techfios login page
    When User enters username as "<username>"
    When User enters password as "<password>"
    And User clicks on signin button
    Then User land on Dashboard page
    And User shoulld clicks on bankCash
    And User clicks on newAccount
    And User enters accountTitle as "<accountTitle>" in accounts page
    And User enters description as "<description>"in accounts page
    And User enters initialBalance as "<initialBalance>"in accounts page
    And User enters accountNumber as "<accountNumber>"in accounts page
    And User enters contactPerson as "<contactPerson>"in accounts page
    And User enters Phone as"<Phone>"in accounts page
    And User enters internetBankingURL as "<internetBankingURL>"in accounts page
    And User clicks on submit
    #Then User should validate account created successfully

Examples:

|username|password|accountTitle|description|initialBalance|accountNumber|contactPerson|Phone|internetBankingURL|
|demo@techfios.com|abc123|Myada Saving for testing perpuse|new account|1300|71433333|Mia|2671254787|www.techfios.com|
 
  
  