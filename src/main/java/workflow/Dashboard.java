package workflow;

import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;
import org.testng.Assert;
import common.CommonMethods;
import pages.DashboardPage;

public class Dashboard extends DashboardPage {

	public WebDriver driver;
	public CommonMethods common;
	public static Logger log = Logger.getLogger(UserLogin.class);

	public Dashboard(WebDriver driver, CommonMethods common) {
		super(driver);
		this.driver = driver;
		this.common = common;
	}

	public void changeLangaugeToEnglish() {
		common.fnWait("1200");
		common.fnvisibledElementWithoutClick(userNameDroDown);
		common.fnVisibledElementClick(userNameDroDown);
		common.fnVisibledElementClick(english);
		common.fnWebAlertHandling();
	}

	public void changeLangaugeToJapanese() {
		common.fnvisibledElementWithoutClick(userNameDroDown);
		common.fnVisibledElementClick(userNameDroDown);
		common.fnVisibledElementClick(japanese);
		common.fnWebAlertHandling();
	}
}