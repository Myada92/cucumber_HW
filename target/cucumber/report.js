$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Homework.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomeworkLoginfeature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario:1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User shoulld clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters accountTitle as \"\u003caccountTitle\u003e\" in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters description as \"\u003cdescription\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters initialBalance as \"\u003cinitialBalance\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters accountNumber as \"\u003caccountNumber\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters contactPerson as \"\u003ccontactPerson\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters Phone as\"\u003cPhone\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters internetBankingURL as \"\u003cinternetBankingURL\u003e\"in accounts page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 21,
      "value": "#Then User should validate account created successfully"
    }
  ],
  "line": 23,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ],
      "line": 25,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Myada Saving for testing perpuse",
        "new account",
        "1300",
        "71433333",
        "Mia",
        "2671254787",
        "www.techfios.com"
      ],
      "line": 26,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4984537800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario:1"
    },
    {
      "line": 1,
      "name": "@HomeworkLoginfeature"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username as \"demo@techfios.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters password as \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User shoulld clicks on bankCash",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters accountTitle as \"Myada Saving for testing perpuse\" in accounts page",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters description as \"new account\"in accounts page",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters initialBalance as \"1300\"in accounts page",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters accountNumber as \"71433333\"in accounts page",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters contactPerson as \"Mia\"in accounts page",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters Phone as\"2671254787\"in accounts page",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters internetBankingURL as \"www.techfios.com\"in accounts page",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 233614800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.User_enters_username(String)"
});
formatter.result({
  "duration": 287920000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.Userenterspasswordas(String)"
});
formatter.result({
  "duration": 221211000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 1175870100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 53892000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_clicks_on_bank_Cash()"
});
formatter.result({
  "duration": 127321200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.User_clicks_on_newAccount()"
});
formatter.result({
  "duration": 954858500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Myada Saving for testing perpuse",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enters_title_in_accounts_page(String)"
});
formatter.result({
  "duration": 183469400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new account",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.user_enters_description_in_accounts_page(String)"
});
formatter.result({
  "duration": 138140200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1300",
      "offset": 31
    }
  ],
  "location": "LoginStepDefinition.user_enters_initialBalance_in_accounts_page(String)"
});
formatter.result({
  "duration": 172914700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "71433333",
      "offset": 30
    }
  ],
  "location": "LoginStepDefinition.user_enters_accountNumber_in_accounts_page(String)"
});
formatter.result({
  "duration": 243008000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mia",
      "offset": 30
    }
  ],
  "location": "LoginStepDefinition.user_enters_contactPerson_in_accounts_page(String)"
});
formatter.result({
  "duration": 219716800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2671254787",
      "offset": 21
    }
  ],
  "location": "LoginStepDefinition.user_enters_Phone_in_accounts_page(String)"
});
formatter.result({
  "duration": 240095100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.techfios.com",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinition.user_enters_internetBankingURL_in_accounts_page(String)"
});
formatter.result({
  "duration": 5105282500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_submit()"
});
formatter.result({
  "duration": 1106771400,
  "status": "passed"
});
});