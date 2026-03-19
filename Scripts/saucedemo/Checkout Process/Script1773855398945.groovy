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

WebUI.callTestCase(findTestCase('saucedemo/Add to Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('saucedemo/checkout/button_checkout'))

WebUI.setText(findTestObject('saucedemo/checkout/input_Checkout Your Information_first-name'), 'diaz')

WebUI.setText(findTestObject('saucedemo/checkout/input_Checkout Your Information_last-name'), 'aryanta')

WebUI.setText(findTestObject('saucedemo/checkout/input_Checkout Your Information_postal-code'), '111111')

WebUI.click(findTestObject('saucedemo/checkout/input_Cancel_continue'))

WebUI.click(findTestObject('saucedemo/checkout/button_finish'))

WebUI.verifyElementPresent(findTestObject('saucedemo/checkout/title_checkout_overview'), 3)

WebUI.verifyElementText(findTestObject('saucedemo/checkout/title_checkout_complete'), 'Checkout: Complete!')

WebUI.delay(3)

WebUI.closeBrowser()

