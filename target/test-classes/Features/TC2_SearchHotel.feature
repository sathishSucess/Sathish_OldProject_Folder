@searchHotel
Feature: Verifying SearchHotel Page

  Scenario Outline: Verify Search Hotel page by entering all fields
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"
    And User should Search hotel by select fields with "<location>", "<hotels>", "<typeOfRoom>", "<noOfRoom>", "<checekInDate>", "<checkOutDate>", "<noOfAdults>" and "<childNos>"
    Then User should verify Select Hotel Page after Search Hotel page "Select Hotel"

    Examples: 
      | username   | password | location | hotels         | typeOfRoom   | noOfRoom | checekInDate | checkOutDate | noOfAdults | childNos |
      | sathishFam | 741@85BN | Sydney   | Hotel Sunshine | Super Deluxe |        1 | 15/09/2022   | 16/09/2022   |          3 |        1 |

  Scenario Outline: Verify Search Hotel page by entering only Mandatory fields
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"
    And User should Search hotel by mandatory fields with "<location>", "<noOfRoom>", "<checekInDate>", "<checkOutDate>" and "<noOfAdults>"
    Then User should verify Select Hotel Page after Search Hotel page "Select Hotel"

    Examples: 
      | username   | password | location | checkInDate | checkOutDate | noOfAdults |
      | sathishFam | 741@85BN | Sydney   | 12/09/2022  | 15/09/2022   |          3 |

  Scenario Outline: Verify CheckIn and Checkout Date in Select Hotel page
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"
    And User should Search hotel by select fields with "<location>", "<hotels>", "<typeOfRoom>", "<noOfRoom>", "<checkInDate>", "<checkOutDate>", "<noOfAdults>" and "<childNos>"
    Then User should verify the error messages after Search Hotel "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password | location | hotels         | typeOfRoom   | noOfRoom | checkInDate | checkOutDate | noOfAdults | childNos |
      | sathishFam | 741@85BN | London   | Hotel Sunshine | Super Deluxe |        1 | 22/09/2022  | 15/09/2022   |          3 |        1 |

  Scenario Outline: Verify Search Hotel page by not entering any values
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"
    And Click Search button
    Then User should verify the error messages in the Search Hotel page "Please Select a Location"

    Examples: 
      | username   | password |
      | sathishFam | 741@85BN |
