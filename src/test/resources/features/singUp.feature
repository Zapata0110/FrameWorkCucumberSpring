Feature: Client sing Up
  Scenario: Client sing up successfully
    Given Edgar wants to have an account
    When he sends required information to get the account
    Then he should be told that the account was created

  Scenario: Client sing up failed
    Given Edgar wants to have an account
    When he sends required information to get the account
    Then he should be told that the account was created not have
