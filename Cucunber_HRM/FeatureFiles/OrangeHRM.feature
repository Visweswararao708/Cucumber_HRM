@tag1
Feature:
As Admin user i want to user HRm modules
@adminlogin
Scenario:
i want test login functionality
Given i want launch url "http://orangehrm.qedgetech.com/" in a browser
Then i want check login button
When i enter usernmame as "Admin"
And i enter password as "Qedge123!@#"
And click login button
Then i verify login sucess
When i close browser
@positiveData
Scenario Outline:
validate lgin with multipledata
Given i want launch url "http://orangehrm.qedgetech.com/" in a browser
Then i want check login button
When i enter usernmame as "<Username>"
And i enter password as "<password>"
And click login button
Then i verify login sucess
When i close browser
Examples:
|Username|password|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
|Admin|Qedge123!@#|
@negativeData
Scenario Outline:
validate login with multiple with negative data
Given i want launch url "http://orangehrm.qedgetech.com/" in a browser
Then i want check login button
When i enter usernmame as "<Username>"
And i enter password as "<password>"
And click login button
Then i capture error message"<ErrorMessage>"
Examples:
|Username|password|ErrorMessag|
|Admin|Qedge123|Invalid credentials|
|Admin|Qedge123|Invalid credentials|
|Admin||Password cannot be empty|
|Admin||Password cannot be empty|
||Qedge123!@|Username cannot be empty|
When i close browser















