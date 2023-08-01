Feature: Test Facebook Application

  Scenario Outline: Test Register Page Functionality
    Given user on Register Page
    When user Enter "<Firstname>" and "<Lastname>" and "<email>" and "<cemail>" and "<Password>" and "<date>" and "<month>" and "<year>"

    Examples: 
      | Firstname | Lastname | email            | cemail           | Password   | date | month | year |
      | sulbha    | Date     | sulbha@gmail.com | sulbha@gmail.com | sulbha@123 |   20 | Aug   | 1994 |
      | pooja     | dake     | pooja@gmaol.com  | pooja@gmaol.com  | pooja123   |   30 | Jun   | 1996 |
      | diksha    | jadhav   | diksha@gmail.com | diksha@gmail.com | diksha@123 |   10 | Jul   | 1995 |
