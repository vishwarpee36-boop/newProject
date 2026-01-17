package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orglnk;
	public WebElement getOrglnk() {
		return orglnk;
	}
	
<<<<<<< HEAD
	@FindBy(linkText="Opportunities")
	private WebElement opportunitilnk;
	public WebElement getOpportunitilnk() {
		return opportunitilnk;
	}
	
	
=======
@FindBy(linkText="ConatactLink")
private WebElement Contactlink;


>>>>>>> branch 'master' of https://github.com/meghaathreya99-lead/GitHubProject.git
}
