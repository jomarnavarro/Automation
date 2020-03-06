#Author: jomarnavarro@gmail.com
Feature: Like Songs

  Scenario: Like the first song on the list
    Given I navigate to sinatra site
    And The sinatra site loads correctly
    When I navigate to song list
    And I navigate to the first song
    And I like that song
    Then The song has one more like
