package TestLayer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.FbRegistrationPage;

public class FB_Reg_TestLayer extends BaseClass {
	@BeforeClass
	public void setUp() {
		intialization();
	}

	@Test(priority = 1)
	public void dataClass() throws InterruptedException, IOException {
		FbRegistrationPage obj = new FbRegistrationPage();
		obj.fbRegPageData("Taterao", "Gaikwad", "9324808033", "1234566", "5", "May", "1995");

	}

}
