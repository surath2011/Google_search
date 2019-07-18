Feature: Google Search
Background:
Given browser is opened

Scenario: Test google search1
Given User on google search page
When enter keyword and search
Then shows information
@search
Scenario: Test google search2
Given User on google search page
When enter keyword and search
Then shows information