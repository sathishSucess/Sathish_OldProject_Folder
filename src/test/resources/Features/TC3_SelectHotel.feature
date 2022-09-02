@selectHotel

Feature: Verifying Select Hotel page

  Scenario Outline: Verify Search Hotel page by entering all fields
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"
    And User should Search hotel by select fields with "<location>", "<hotels>", "<typeOfRoom>", "<noOfRoom>", "<checekInDate>", "<checkOutDate>", "<noOfAdults>" and "<childNos>"
    Then User should verify Select Hotel Page after Search Hotel page "Select Hotel"
    And User should select the Hotel and Click Continue button
    Then User should verify the page after Hotel selection by "Book A Hotel"

    Examples: 
      | username   | password | location | hotels         | typeOfRoom   | noOfRoom | checekInDate | checkOutDate | noOfAdults | childNos |
      | sathishFam | 741@85BN | Sydney   | Hotel Sunshine | Super Deluxe |        1 | 13/08/2022  | 14/08/2022   |          2 |        1 |

  Scenario Outline: Verify Search Hotel page by entering all fields
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"
    And User should Search hotel by select fields with "<location>", "<hotels>", "<typeOfRoom>", "<noOfRoom>", "<checekInDate>", "<checkOutDate>", "<noOfAdults>" and "<childNos>"
    Then User should verify Select Hotel Page after Search Hotel page "Select Hotel"
    And User should Click Continue button without selecting hotel
    Then User should verify the error message "Please Select a Hotel"

    Examples: 
      | username   | password | location | hotels         | typeOfRoom   | noOfRoom | checekInDate | checkOutDate | noOfAdults | childNos |
      | sathishFam | 741@85BN | Sydney   | Hotel Sunshine | Super Deluxe |        1 | 13/08/2022  | 14/08/2022   |          2 |        1 |
