package pckg1;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.util.regex.Pattern;

public class Skubus_Actions {
        private Page page;

        public Skubus_Actions(Page page) {
            this.page = page;
        }
        public void Registration() {
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Admin")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("name@example.com")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("name@example.com")).fill("admin@skubus.com");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("••••••••")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("••••••••")).fill("adminpassword123");
            page.getByRole(AriaRole.BUTTON).filter(new Locator.FilterOptions().setHasText(Pattern.compile("^$"))).click();
            page.getByRole(AriaRole.CHECKBOX, new Page.GetByRoleOptions().setName("Remember me")).check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign In")).click();
        }
        public void students() {
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Students")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Student")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Jane Doe")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Jane Doe")).fill("Jenifa");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("STU-2026-")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("STU-2026-")).press("CapsLock");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("STU-2026-")).fill("IRH1001");
            page.locator("input[name=\"dateOfBirth\"]").fill("2005-09-06");
            page.locator("select[name=\"gender\"]").selectOption("Female");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("e.g. 10th Grade")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("e.g. 10th Grade")).fill("1");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("e.g. A")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("e.g. A")).fill("A");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("+1 (555) 000-")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("+1 (555) 000-")).fill("9045668834");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("School Lane...")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("School Lane...")).fill("J");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("School Lane...")).press("CapsLock");
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("School Lane...")).fill("Jenifas house");
        }
        public void edit() {
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Student")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(1).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("+1 (555) 000-")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("+1 (555) 000-")).fill("8853982675");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save Changes")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).nth(3).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save Changes")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("View Profile")).nth(2).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Register").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go Back")).click();
        }
        public void parent(){

        }
    }
