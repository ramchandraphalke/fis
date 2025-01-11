Feature: Ebay add to cart Functionality
  As a QA
  I want to search for book and then add it to card 
  so that I can validate items present in cart

  @Ebay
  Scenario: Validate Ebay add to cart functionality
  	Given Open Ebay site "https://www.ebay.com/"
  	And Enter search text as "book"
  	And Click on search button
  	Then Select first book from available books
		Then Click add to cart
		Then Validate items present in cart