package fis.ecom.bdd.pages;

public interface IEbayHomePage {
	void goToAmazon(String url);
	void enterSearchText(String searchText);
	void clickSearchButton();
	void selectFirstBookFromAvailableBooks();
	void clickAddToCart();
	void validateItemsInCart();
}
