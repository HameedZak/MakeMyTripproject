package pageObjectModal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMytPOM {

	public WebDriver driver;

	public MakeMytPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='makeFlex hrtlCenter prependTop5 appendBottom40']")
	WebElement Popupclick;

	@FindBy(xpath = "//span[@class='landingSprite swipIcon']")
	WebElement Swipeicon;

	@FindBy(xpath = "//input[@id='fromCity']")

	WebElement FromCity;

	@FindBy(xpath = "//input[@id='toCity']")

	WebElement ToCity;

	@FindBy(xpath = "//div//label[@for='departure']")

	WebElement Departure;

	@FindBy(xpath = "//div[@aria-label='Wed Sep 15 2021']")

	WebElement Departuredate;

	@FindBy(xpath = "//div[@data-cy='returnArea']")
	WebElement Return;

	@FindBy(xpath = "//div[@aria-label='Thu Sep 16 2021']")

	WebElement ReturnDate;

	@FindBy(xpath = "//div[@data-cy='flightTraveller']")
	WebElement Travelerclass;

	@FindBy(xpath = "//li[@data-cy='adults-2']")
	WebElement Adults;

	@FindBy(xpath = "//li[@data-cy='children-1']")
	WebElement childern;

	@FindBy(xpath = "//li[@data-cy='infants-1']")
	WebElement Infants;

	@FindBy(xpath = "//ul//li[text()='Business']")
	WebElement BussinessClass;

	@FindBy(xpath = "//button[@class='primaryBtn btnApply pushRight']")
	WebElement Applybutton;

	@FindBy(xpath = "//a[text()='Search']")
	WebElement Searchbutton;

	@FindBy(xpath = "//span[text()='+ 2 more']")
	WebElement Showmore;

	@FindBy(xpath = "//span[@title='Air India']")
	WebElement Airindiafilter;

	@FindBy(xpath = "//span[@title='Vistara']")
	WebElement Vistarafilter;

	@FindBy(xpath = "//label[@id='flightCard-5']")
	WebElement AirIndiaonwards;

	@FindBy(xpath = "//button[text()='Book Now']")
	WebElement Booknow;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement Continue;

	public void normalClick() {
		Popupclick.click();
	}

	public void clickSwipeIcon() {
		Swipeicon.click();
	}

	public void clickFromCity() throws InterruptedException {
		FromCity.click();

		List<WebElement> list = driver.findElements(By.xpath("//li[@role='option']//p"));

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().contains("Bangalore, India")) {
				Thread.sleep(2000);
				list.get(i).click();
				break;
			}
		}

	}

	public void clickToCity(String ToCity2) throws InterruptedException {
		ToCity.click();

		List<WebElement> list1 = driver.findElements(By.xpath("//li[@role='option']//p"));
		for (int i = 0; i < list1.size(); i++) {

			if (list1.get(i).getText().contains(ToCity2)) {
				Thread.sleep(2000);
				list1.get(i).click();
				break;
			}

		}

	}

	public void clickOnDeparture() {
		Departure.click();
	}

	public void clickDepartureDate() {
		// Departuredate.click();
		List<WebElement> elements = driver.findElements(By.xpath("//p[normalize-space(text()) = " + Ddate + "]"));

		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().contains(Ddate)) {
				elements.get(i).click();
				break;
			}
		}

	}

	public void clickOnReturn() {
		Return.click();
	}

	public void clickReturnDate() {
		ReturnDate.click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//p[normalize-space(text()) = " + Rdate + "]"));

		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().contains(Rdate)) {
				elements.get(i).click();
				break;
			}
		}
		
		
	}

	public void clickOnTravelClass() {
		Travelerclass.click();
	}

	public void selectAdults() {
		Adults.click();
	}

	public void selectChilder() {
		childern.click();
	}

	public void selectInfants() {
		Infants.click();
	}

	public void selectBussinessClass() {
		BussinessClass.click();
	}

	public void clickOnApplybtton() {
		Applybutton.click();
	}

	public void clickOnSearchButton() {
		Searchbutton.click();
	}

	public void clickonShowmore() {
		Showmore.click();
	}

	public void selectAirIndiafilter() {
		Airindiafilter.click();
	}

	public void selectVistrafilter() {
		Vistarafilter.click();
	}

	public void clickAirIndiaonwards() {
		AirIndiaonwards.click();
	}

	public void clickOnbooknow() {
		Booknow.click();
	}

	public void clickOnContinue() {
		Continue.click();
	}

}
