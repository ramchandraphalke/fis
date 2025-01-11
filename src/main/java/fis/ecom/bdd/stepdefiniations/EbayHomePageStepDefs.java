package fis.ecom.bdd.stepdefiniations;

import fis.ecom.bdd.pages.impl.EbayHomePage;
import fis.ecom.web.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EbayHomePageStepDefs {

	BaseClass baseClass;
	EbayHomePage ebayHomePage;

	public EbayHomePageStepDefs(BaseClass baseClass) {
		this.baseClass = baseClass;
		ebayHomePage = new EbayHomePage(baseClass.getDriver());
	}

	@Given("Open Ebay site {string}")
	public void open_amazon_site(String url) {
		try {
			ebayHomePage.goToAmazon(url);
		} catch (Exception e) {
			System.out.println("Not able to open Ebay site");
		}
	}

	@Given("Enter search text as {string}")
	public void enter_search_text_as(String searchText) {
		try {
			ebayHomePage.enterSearchText(searchText);
		} catch (Exception e) {
			System.out.println("Not able to enter search text");
		}
	}

	@Given("Click on search button")
	public void click_on_search_button() {
		try {
			ebayHomePage.clickSearchButton();
		} catch (Exception e) {
			System.out.println("Not able to hit enter button");
		}
	}

	@Then("Select first book from available books")
	public void select_first_book_from_available_books() {
		try {
			ebayHomePage.selectFirstBookFromAvailableBooks();
		} catch (Exception e) {
			System.out.println("Could not select first book from list");
		}
	}
	
	@Then("Click add to cart")
	public void click_add_to_cart() {
		try {
			ebayHomePage.clickAddToCart();
		} catch (Exception e) {
			System.out.println("Could not add item to cart");
		}
	}
	
	@Then("Validate items present in cart")
	public void validate_items_present_in_cart() {
		try {
			ebayHomePage.validateItemsInCart();
		} catch (Exception e) {
			System.out.println("Could not validate items in cart");
		}
	}
}
