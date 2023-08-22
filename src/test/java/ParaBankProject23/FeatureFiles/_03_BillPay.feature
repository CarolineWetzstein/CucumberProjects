Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank Website

  Scenario: Login with valid credentials
    And Enter "CGroup4" as username and "Qwerty+12" as password
    And Click on Log in button
    Then Verify success Login

  Scenario Outline: Bill Payment
When Click on Bill Pay Link
And Fill form information
| Field         | Value               |
| Payee Name    | "<PayeeName>"       |
| Address       | "<Address>"         |
| City          | "<City>"            |
| State         | "<State>"           |
| Zip code      | "<ZipCode>"         |
| PhoneNumber   | "<PhoneNumber>"     |
| Account       | "<Account>"         |
| Verify Accout | "<VerifyAccount>"   |
| Amount        | "<Amount>"          |

And Click on send payment button
Then Verify successful payment

Examples:
| PayeeName        | Address   | City   | State   | ZipCode   | PhoneNumber| Account | VerifyAccount | Amount |
| Electricity Bill | Address1  | City1  | State1  | 123456    | 21345678   | 12345   | 12345         | 85     |
| Water Bill       | Address2  | City2  | State2  | 654321    | 23453234   | 21345   | 21345         | 45     |
| Gas Bill         | Address3  | City3  | State3  | 345678    | 12345677   | 67876   | 67876         | 150    |
| Internet         | Address4  | City4  | State4  | 098765    | 22334455   | 09878   | 09878         | 60     |