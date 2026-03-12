package automationscripts;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class myfirstplaywirte {
	public static void main(String args[]) throws InterruptedException
	{
	Playwright py=Playwright.create();
	BrowserType bt=	 py.chromium();
	Browser bb=bt.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
	Page page =bb.newPage();
	page.navigate("https://playwright.dev/java/docs/intro");
	String Str =page.title();
	System.out.println("Page Title"+Str);
    Thread.sleep(5000);
    page.close();
    bb.close();
    py.close();
    
	}

}
