Feature: Hotel Booking In Adactin Application
@login
Scenario: User Login The Web Application
Given user Launch The Url Of Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Naigates To Search Hotel Page
@searchhotel
Scenario: User Search The Hotel In Search Hotel Page
When user Select The Location In Location Dropdown
And user Select The Hotel In Hotels Dropdown
And user Select The Room Type In Room Type Dropdown
And user Select The Number Of Rooms In Number Of Rooms Dropdown
And user Enter The Check In Date In Check In Date Tab
And user Enter The Check Out Date In Check Out Date Tab
And user Select The Number Of Adults In Adults Per Room Dropdown
And user Select The Number Of Children In Children Per Room Dropdown
Then user Click The Search Button And It Navigates To The Select Hotel Page
@selecthotel
Scenario: User Select The Hotel In Select Hotel Page
When user Click The Radio Button To Select The Hotels In the Below List Of Hotels
Then user Click The Continue Button And It Navigates To The Book A Hotel Page
@bookhotel
Scenario: User Enter The Details Which Need In Book A Hotel Page 
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Address In Billing Address Field 
And user Enter The Credit Card Number In Credit Card no. Field
And user Select The Card Type In Credit Card Type Dropdown
And user Select The Expiry Month And Year in The Expiry Date Dropdown 
And user Enter The Cvv Number In The CVV Number Field
Then user Click The Book Now Button And It Navigates To The Booking Confirmation
@logout
Scenario: User Logut From The Application
Then User Click The Logout Button And It Navigates To The Logout Page 