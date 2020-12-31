Feature: Singup flow


@Sanity
Scenario: Signup
Given User has the apk file and successfully installed the application
When user launches the app
And Click on SignUp button
And Enter the following details

#********************** Sending data as list ***********************

#|Rajat | Shandilya | rs@gmail.com | qwerty |
#|Rajat1 | Shandilya1 | rs1@gmail.com | qwerty1 |
#|Rajat2 | Shandilya2 | rs2@gmail.com | qwerty2 |

#********************** Sending data as Map ***********************

  |FirstName | LastName | EmailId | Password |
|Rajat | Shandilya | rs@gmail.com | qwerty |
|Rajat1 | Shandilya1 | rs1@gmail.com | qwerty1 |
|Rajat2 | Shandilya2 | rs2@gmail.com | qwerty2 |

Then User should be able to successfully signup
