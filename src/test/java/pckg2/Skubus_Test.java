package pckg2;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
import pckg1.Skubus_Actions;

public class Skubus_Test {
        @Test
        public void Skubus() {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false)
            );
            Page page = browser.newPage();
            page.navigate("https://skubus.vercel.app");
            Skubus_Actions obj=new Skubus_Actions(page);
            obj.Registration();
            obj.students();
            obj.edit();
            obj.parent();

        }
    }
