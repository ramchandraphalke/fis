package fis.ecom.bdd.pages.impl;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import fis.ecom.bdd.pages.IEbayHomePage;
import fis.ecom.commonutilities.CommonUtility;

public class EbayHomePage extends CommonUtility implements IEbayHomePage {

	private WebDriver driver;

	public EbayHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gh-ac")
	private WebElement searchbox;

	@FindBy(id = "gh-btn")
	private WebElement searchbutton;

	@FindBy(xpath = "(//div[@class=\"s-item__info clearfix\"])[3]//span[@role=\"heading\"]")
	private WebElement firstBookInList;

	@FindBy(xpath = "//span[contains(text(), 'Add to cart')]")
	private WebElement addToCartButton;

	@FindBy(id = "gh-cart-n")
	private WebElement itemsInCart;
	
	String originalWindowHandle;

	@Override
	public void goToAmazon(String url) {
		driver.get(url);
		waitTillPageLoads();
	}

	@Override
	public void enterSearchText(String searchText) {
		waitForElement(searchbox).clear();
		searchbox.sendKeys(searchText);
	}

	@Override
	public void clickSearchButton() {
		originalWindowHandle = driver.getWindowHandle();
		waitForElement(searchbutton).click();
	}

	@Override
	public void selectFirstBookFromAvailableBooks() {
		waitForElement(firstBookInList).click();
		Set<String> allWindowHandles =  driver.getWindowHandles();
		String newTabHandle = null;
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                newTabHandle = windowHandle;
                break;
            }
        }
        if (newTabHandle != null) {
            driver.switchTo().window(newTabHandle);
        } 
	}

	@Override
	public void clickAddToCart() {
		waitForElement(addToCartButton).click();
		System.out.println("item added to cart");
	}

	@Override
	public void validateItemsInCart() {
		waitForElement(itemsInCart);
		System.out.println("item in cart are visible");
		System.out.println("items in cart are : "+itemsInCart.getText());
		Assert.assertEquals(itemsInCart.getText(), "1");
		System.out.println("Items in cart validated successfully!");
	}

}
