Feature: Book a Flight ticket for different cities on Makemytrip
Scenario: Verify the process of booking a flight in Makemytrip for Bangalore to Dehli
Given launch the makemytrip website
And User click on pop-up
When User select the cities in From and To field
|Delhi|
And select the Departure and Return date along with Travel&class and click on Search button
|25|26|
Then User should be in flght detail screen
When User selects Air india and Vistara flights in popular filter
And User scroll down
And select Onward flight as Air India and Return as Vistara
And click on Book button
Then User should be prompted with a pop-up
And click on Continue button
And user shoule navigate to complete your booking screen
And print the fair details
And quite the browser


Scenario: Verify the process of booking a flight in Makemytrip for Bangalore to Mumbai
Given launch the makemytrip website
And User click on pop-up
When User select the cities in From and To field
|Mumbai|
And select the Departure and Return date along with Travel&class and click on Search button
|25|26|
Then User should be in flght detail screen
When User selects Air india and Vistara flights in popular filter
And User scroll down
And select Onward flight as Air India and Return as Vistara
And click on Book button
Then User should be prompted with a pop-up
And click on Continue button
And user shoule navigate to complete your booking screen
And print the fair details
And quite the browser



