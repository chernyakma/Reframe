package com.vaadin.testbenchexample;

import com.vaadin.flow.component.grid.testbench.GridElement;
import com.vaadin.testbench.TestBenchElement;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class GroupIT extends BaseLoginTest {

    @Test
    public void addAgent() {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectItemByIndex(9);
        ScenarioView agent = $(ScenarioView.class).first();
        agent.officeCode().sendKeys("CFHelpdesk002");
        agent.officeType().selectByText("Reframe");
        agent.firstName().sendKeys("CF");
        agent.lastName().sendKeys("HelpDesk002");
        agent.email().sendKeys("helpdesk@test.com");
        agent.dob().setDate(LocalDate.of(1965, 01, 05));
        agent.addAddressButton().click();
        EntryDialogContent addAddress = $(EntryDialogContent.class).first();
        addAddress.addAddress("56 Main Street", "Norfolk", "23501");
        addAddress.state().selectByText("Virginia");
        addAddress.type().selectByText("Mailing");
        addAddress.okButton().click();
        ScenarioView agentCancel = $(ScenarioView.class).first();
//        Assertions.assertEquals( "Virginia", addAddress.state().getSelectedText());
        Assertions.assertEquals("56 Main Street", agentCancel.addressLine1().getText());
        Assertions.assertEquals("helpdesk@test.com", agentCancel.email().getValue());
        //       ScenarioView agentCancel = $(ScenarioView.class).first();
        agentCancel.getCancelAgentButton().click();


    }

    @Test
    public void addAgentHierarchies() throws Exception {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectItemByIndex(10);
        SearchComponentView getAgent = $(SearchComponentView.class).first();
        getAgent.searchByAgentNumber().sendKeys("CFHelpdesk002");
        getAgent.searchButton().click();
        getAgent.family().getCell("CFHelpdesk002").click();
        NaviMenuView menu = $(NaviMenuView.class).first();
        menu.getAgentHierarchies().click();
        ScenarioView addHierarchies = $(ScenarioView.class).first();
        addHierarchies.addAgentHierarchiesButton().click();
        EntryDialogContent hierarchy = $(EntryDialogContent.class).first();
        hierarchy.hierarchyName().sendKeys("CFHelpdesk002Hierarchy");
        hierarchy.addAgentHierarchy().click();
        EntryDialogContent hierarchy1 = $(EntryDialogContent.class).last();
        hierarchy1.agentNumber().openPopup();
        hierarchy1.agentNumber().sendKeys("CFHelpdesk002");
        Thread.sleep(2_000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowDown'}));", hierarchy1.agentNumber());
        hierarchy1.agentNumber().sendKeys(Keys.ENTER);
        hierarchy1.agentLevel().selectByText("Servicing Agent - 20");
        hierarchy1.okButton().click();
        EntryDialogContent hierarchy2 = $(EntryDialogContent.class).first();
        hierarchy2.addAgentHierarchy().click();
        EntryDialogContent hierarchySecond = $(EntryDialogContent.class).last();
        hierarchySecond.agentNumber().openPopup();
        hierarchySecond.agentNumber().sendKeys("SGMGA1");
        Thread.sleep(2_000);
        //       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowDown'}));", hierarchySecond.agentNumber());
        hierarchySecond.agentNumber().sendKeys(Keys.ENTER);
        hierarchySecond.agentLevel().selectByText("MGA - 1");
        hierarchySecond.okButton().click();

        EntryDialogContent hierarchy3 = $(EntryDialogContent.class).first();
        hierarchy3.addAgentHierarchy().click();
        EntryDialogContent hierarchyThird = $(EntryDialogContent.class).last();
        hierarchyThird.agentNumber().openPopup();
        hierarchyThird.agentNumber().sendKeys("SG005");
        Thread.sleep(2_000);
        //       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowDown'}));", hierarchyThird.agentNumber());
        hierarchyThird.agentNumber().sendKeys(Keys.ENTER);
        hierarchyThird.agentLevel().selectByText("Agent 75 - 5");
        hierarchyThird.okButton().click();
        EntryDialogContent assertion = $(EntryDialogContent.class).first();
        Assertions.assertEquals("CFHelpdesk002",assertion.agentNumber1().getText());
        Assertions.assertEquals("Servicing Agent - 20", assertion.agentLevel1().getText());
        Assertions.assertEquals("SG005", assertion.agentNumber2().getText());
        Assertions.assertEquals("Agent 75 - 5", assertion.agentLevel2().getText());
        Assertions.assertEquals("SGMGA1", assertion.agentNumber3().getText());
        Assertions.assertEquals("MGA - 1", assertion.agentLevel3().getText());
        assertion.closeButton().click();

    }

    @Test
    public void addGroup() throws Exception {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectItemByIndex(2);
        ScenarioView group=$(ScenarioView.class).first();
        group.addGroup("HelpdeskGroup001","Helpdesk Group","Helpdesk Group","group@test.com","687456787");
        group.businessType().selectByText("Limited Liability Company");
        group.groupEfDate().setDate(LocalDate.of(2025, 01, 01));
        group.groupStateOfInt().selectByText("Virginia");
        group.employeeListBill().selectByText("Employee Id");
        group.getGroupSaveButton().click();
        NaviMenuView addAgent=$(NaviMenuView.class).first();
        addAgent.getAgent().click();
        ScenarioView agent=$(ScenarioView.class).first();
        agent.addAgentButton().click();
        EntryDialogContent searchAgent=$(EntryDialogContent.class).first();
        searchAgent.searchAgentNumber().openPopup();
        Thread.sleep(2_000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowDown'}));", searchAgent.searchAgentNumber());
        searchAgent.searchAgentNumber().sendKeys(Keys.ENTER);
        searchAgent.commissionSchedule().selectByText("Level Schedule");
        Assertions.assertEquals("SGMGA1 Agent",searchAgent.writingAgentName().getValue());
        searchAgent.okButton().click();
        ScenarioView assertion=$(ScenarioView.class).first();
        Assertions.assertEquals("CFAgent002Hierarchy",assertion.agentName().getText());
        Assertions.assertEquals("Level Schedule",assertion.levelSchedule().getText());
        assertion.deleteGroupButton().click();
        VaadinConfirmDialogView confirm=$(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();




    }
}