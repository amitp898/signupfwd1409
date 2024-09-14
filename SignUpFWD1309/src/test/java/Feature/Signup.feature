Feature: user will sign up successfully with valid data

  Background:
    Given user is on application login page

   Scenario: user will navigate to sign up page
     Given i provide valid name and emailid
     When i click on signup button
     Then i successfully navigate to signup page
     Given i provide valid title
     And i provide valid password
     And i provide valid date of birth
     And i provide valid first name
     And i provide valid last name
     And i provide valid address
     And i select the country
     And i provide valid state
     And i provide valid city
     And i provide valid zipcode
     And i provide valid mobile number
     When i click create account button
     Then i successfully navigate to home page


