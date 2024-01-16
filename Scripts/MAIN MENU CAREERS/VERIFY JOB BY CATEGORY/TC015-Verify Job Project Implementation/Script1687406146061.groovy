import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://career.koltiva.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('MENU CAREERS/h3_Create Meaningful Career Paths and Make Positive Impacts on Our Planet'), 
    3)

WebUI.scrollToPosition(50, 60)

WebUI.click(findTestObject('MENU CAREERS/span_Allow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MENU CAREERS/p_Technology'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('MENU CAREERS/h6_Job Search'), 0)

WebUI.verifyTextPresent('2 available positions in 1 countries', false)

WebUI.closeBrowser()

