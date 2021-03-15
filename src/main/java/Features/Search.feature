Feature: Amazon Search

Scenario: Amazon search for Book and assert cost scenario

Given Read the URL and navigate
When Verify title of Main page is "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
Then Search for the text "qa testing for beginners"
And Verify search results available
And Store price of "1" search option and click
And Verify price on Product page is same as Search page
And Click AddToCard and validate price in cart
And Close Browser

