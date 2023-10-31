$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url Of Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Naigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Url_Of_Adactin_Application()"
});
formatter.result({
  "duration": 20994992100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 247737600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 247891000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Login_Button_And_It_Naigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1427017100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User Search The Hotel In Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-the-hotel-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@searchhotel"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user Select The Location In Location Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select The Hotel In Hotels Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The Room Type In Room Type Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Number Of Rooms In Number Of Rooms Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Enter The Check In Date In Check In Date Tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Enter The Check Out Date In Check Out Date Tab",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The Number Of Adults In Adults Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The Number Of Children In Children Per Room Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Location_In_Location_Dropdown()"
});
formatter.result({
  "duration": 426233300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Hotel_In_Hotels_Dropdown()"
});
formatter.result({
  "duration": 331510800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Room_Type_In_Room_Type_Dropdown()"
});
formatter.result({
  "duration": 213957400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Dropdown()"
});
formatter.result({
  "duration": 271545200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Check_In_Date_In_Check_In_Date_Tab()"
});
formatter.result({
  "duration": 368289200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Tab()"
});
formatter.result({
  "duration": 353171600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Number_Of_Adults_In_Adults_Per_Room_Dropdown()"
});
formatter.result({
  "duration": 200223000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Number_Of_Children_In_Children_Per_Room_Dropdown()"
});
formatter.result({
  "duration": 327800700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 973752400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Select The Hotel In Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@selecthotel"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user Click The Radio Button To Select The Hotels In the Below List Of Hotels",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Click The Continue Button And It Navigates To The Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Radio_Button_To_Select_The_Hotels_In_the_Below_List_Of_Hotels()"
});
formatter.result({
  "duration": 135763200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1060181500,
  "status": "passed"
});
});