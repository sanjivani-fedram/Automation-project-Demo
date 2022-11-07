package BasicOfTestGN;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseReportLog {
	@Test
	public void Tc1() {
		Reporter.log("Suryaansh", true);
	}
	@Test
	public void Tc2() {
		Reporter.log("Sanjivani", true);
	}
	@Test
	public void Tc3() {
		Reporter.log("Ravikumar", true);
	}
	@Test
	public void TC4() {
		Reporter.log("Sanjivani Gangaparsad Jakkalwar", false);
	}
}
