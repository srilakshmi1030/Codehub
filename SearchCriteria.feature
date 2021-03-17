#Author: your.email@your.domain.com
#Keywords Summary :

@SearchCriteria
Feature:SearchCriteria
  Search with zipcode 

  @tag1
  Scenario: Validating search results
    Given I am an guest user searching cars autotrader
    When navigated to the advanced search page
    And enter values in zipcode as <zipcode>
    And select condition as <condition>
    And select Style as <Style>
    And update year as <From> and <To>
    And selct vehicle make <make>
    And click on the submit button
      | zipcode | condition   | Style       | make || From | To  | count |
      | 30004   | Certified   | Convertible | BMW  ||2017  | 2020| 13    |
    And navigated to search criteria page
		Then I validate the resutls <count>
    And check the name of the cars as per the selected criteria 
