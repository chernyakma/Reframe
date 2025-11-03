package com.vaadin.testbenchexample;
import java.io.File;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.vaadin.testbench.screenshot.ImageFileUtil;

public class UniversalLifeIT extends BaseLoginTest {



/*
	@Test
	public void addLoan() throws InterruptedException, IOException {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 6 );
		SearchComponentView getPolicy = $( SearchComponentView.class ).first();
		getPolicy.searchByPolicy().sendKeys( "RFL0000022" );
		getPolicy.searchButton().click();
		getPolicy.family().getCell( "RFL0000022" ).click();
		NaviMenuView transaction = $( NaviMenuView.class ).first();
		transaction.transactionsWL().click();
		ScenarioView loanTransaction = $(ScenarioView.class).first();
		loanTransaction.addTransactionButton().click();
//		EntryDialogContent selectTransaction = $(EntryDialogContent.class).first();
		TransactionPopUpPageView selectTransaction = $(TransactionPopUpPageView.class).first();
		selectTransaction.transactionType().selectByText( "Loan" );
		selectTransaction.effectiveDate().setDate(LocalDate.of(2026,7,15));
		EntryDialogContent loan = $(EntryDialogContent.class).first();
//		loan.LoanEffectveDate().setDate(LocalDate.of(2030,4,7));;
		loan.loanAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "500" );
		loan.disbursementMethod().selectByText( "Check Disbursement" );
		Assertions.assertEquals( "500.00",loan.loanAmount().getValue() );
		TransactionPopUpPageView getApproved = $(TransactionPopUpPageView.class).first();
		getApproved.approved().click();
		loan.okButton().click();
		ScenarioView processLoanTransaction = $(ScenarioView.class).first();
		processLoanTransaction.processInitialPremiumTransactionButton().click();

		VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
		confirm.getSaveButton().click();
		ScenarioView transactionsPage = $(ScenarioView.class).first();
		waitUntil(driver -> !transactionsPage.progressBar().isDisplayed(), 80);
/*		ScenarioView transactionsPage = $(ScenarioView.class).first();
		transactionsPage.viewLoanTransactionButton().click();
		Thread.sleep( 5_000 );
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
				"Screenshot 2024-05-31 165800.png" ) ) );
		TransactionViewPage transactionPage = $(TransactionViewPage.class).first();
		transactionPage.cancel().click();



		NaviMenuView policy = $(NaviMenuView.class).first();
		policy.getPolicy().click();
		ScenarioView policyPage = $(ScenarioView.class).first();
		Assertions.assertEquals( "500.00",policyPage.loanBalance().getValue() );
		NaviMenuView transactions = $(NaviMenuView.class).first();
		transactions.transactionsWL().click();
		ScenarioView deleteTransaction = $(ScenarioView.class).first();
		deleteTransaction.reverseLoanTransactionButton().click();
		VaadinConfirmDialogView ok = $(VaadinConfirmDialogView.class).first();
		ok.getSaveButton().click();
		ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
		waitUntil(driver -> !deleteLoanTransaction.progressBar().isDisplayed(), 80);
//		ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
		deleteLoanTransaction.deleteLoanTransactionButton().click();
		VaadinConfirmDialogView confirmation = $(VaadinConfirmDialogView.class).first();
		confirmation.getSaveButton().click();

	}
*/
	@Test
	public void addNewBusiness() throws Exception {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchBySSN().setValue( "511-20-7948" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();
		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
	//	addNewBusiness.effectiveDate().setDate(LocalDate.of(2024,11,1));
	//	addNewBusiness.getProductType().selectByText( "Indexed Universal Life" );
		addNewBusiness.getFaceAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "50000" );
//		addNewBusiness.getInsured().selectItemByIndex( 0 );
        addNewBusiness.getState().selectByText( "Virginia" );
		addNewBusiness.getOkButton().click();

		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getReport().click();
		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getApplyButtonReport().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();

		ApplicationView application = $( ApplicationView.class ).first();
//		application.getAgentNumber().sendKeys("6879456");
//		Thread.sleep( 3_000 );
//		application.getAgentNumber().sendKeys(Keys.ARROW_DOWN);
//		application.getAgentNumber().sendKeys(Keys.ENTER);

		application.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
//		Assertions.assertEquals( "6879456", application.getAgentNumber().getSelectedText() );
//		application.applicationFundsReceived().selectByText( "Yes" );
//		Assertions.assertEquals( "Yes", application.applicationFundsReceived().getSelectedText() );
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		application.applicationStatus().selectByText("Active");
		application.policyIssueDate().setDate(LocalDate.now());
		application.addFundButton().click();
		EntryDialogContent fund = $(EntryDialogContent.class).first();
		fund.fundName().selectByText("Fixed Fund");
		fund.okButton().click();

		NaviMenuView getDocument = $( NaviMenuView.class ).first();
		getDocument.getDocument().click();
		ApplicationView report = $( ApplicationView.class ).first();
		report.downloadButton().click();
		Thread.sleep( 3_000 );
		application.compareAndDeleteDownloadedPdfFPIUL();

		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
	//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Application.pdf") );
		String filePathApp = System.getenv("UPLOAD_FILE_PATH_App");
		File fileToUploadApp = new File(filePathApp).getAbsoluteFile();
	//	File fileToUploadApp = new File(filePathApp);
		addNote.uploadFileButton().upload(fileToUploadApp);
		Thread.sleep( 5_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Illustration" );
	//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Illustration .pdf" ) );
		String filePathIll = System.getenv("UPLOAD_FILE_PATH_ILL");
		File fileToUploadIll = new File(filePathIll).getAbsoluteFile();
	//	File fileToUploadIll = new File(filePathIll);
		addNote.uploadFileButton().upload(fileToUploadIll);
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		Thread.sleep( 3_000 );
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();
	//	VaadinConfirmDialogView ok = $(VaadinConfirmDialogView.class).first();
	//	ok.getSaveButton().click();
		ScenarioView getPolicyStatus = $(ScenarioView.class).first();
		Assertions.assertEquals( "Active",getPolicyStatus.policyStatus().getText() );


	}


	@Test
	public void addNewBusinessEFT() throws Exception {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchBySSN().setValue( "511-20-7948" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();
		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
//			addNewBusiness.effectiveDate().setDate(LocalDate.of(2025,05,1));
//		addNewBusiness.getProductType().selectByText( "Indexed Universal Life" );
		addNewBusiness.getFaceAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "100000" );
//		addNewBusiness.getInsured().selectItemByIndex( 0 );

		addNewBusiness.getState().selectByText( "Virginia" );
		addNewBusiness.getOkButton().click();

		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getReport().click();
		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getApplyButtonReport().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();

		ApplicationView application = $( ApplicationView.class ).first();

		application.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
		application.paymentMethod().selectByText("Bank Draft");
		application.draftDay().sendKeys("1");
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );

		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		application.applicationStatus().selectByText("Active");
		application.policyIssueDate().setDate(LocalDate.now());
		application.addFundButton().click();
		EntryDialogContent fund = $(EntryDialogContent.class).first();
		fund.fundName().selectByText("Fixed Fund");
		fund.okButton().click();

		NaviMenuView getDocument = $( NaviMenuView.class ).first();
		getDocument.getDocument().click();
		ApplicationView report = $( ApplicationView.class ).first();
		report.downloadButton().click();
		Thread.sleep( 3_000 );
		application.compareAndDeleteDownloadedPdfFPIUL();

		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
		//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Application.pdf") );
		String filePathApp = System.getenv("UPLOAD_FILE_PATH_App");
		File fileToUploadApp = new File(filePathApp).getAbsoluteFile();
		addNote.uploadFileButton().upload(fileToUploadApp);
		Thread.sleep( 5_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Illustration" );
		//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Illustration .pdf" ) );
		String filePathIll = System.getenv("UPLOAD_FILE_PATH_ILL");
		File fileToUploadIll = new File(filePathIll).getAbsoluteFile();
		addNote.uploadFileButton().upload(fileToUploadIll);
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		Thread.sleep( 3_000 );
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();
		//	VaadinConfirmDialogView ok = $(VaadinConfirmDialogView.class).first();
		//	ok.getSaveButton().click();
		ScenarioView getPolicyStatus = $(ScenarioView.class).first();
		Assertions.assertEquals( "Active",getPolicyStatus.policyStatus().getText() );


	}


}







