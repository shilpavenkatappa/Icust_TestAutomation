package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ICUSTKIOSKMethods extends KIOSKGenericWrapper{

		public static Properties props;

		@BeforeMethod
		public void launchApplication() throws IOException, InterruptedException {
			FileInputStream fis = new FileInputStream("./src/main/resources/icustKiosk.properties");
			props = new Properties();
			props.load(fis);
			lanuchBrowser("chrome", props.getProperty("IcustKiosk_Url"));
		}

		@AfterMethod
		public void closeBrowser() {

			driver.close();

		}
}
