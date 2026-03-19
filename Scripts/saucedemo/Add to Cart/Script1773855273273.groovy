import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('saucedemo/LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('saucedemo/add to cart/button_add_to_cart'))

WebUI.click(findTestObject('saucedemo/add to cart/shopping_cart_link'))

WebUI.verifyElementPresent(findTestObject('saucedemo/add to cart/span_title_your_cart'), 5)

WebUI.waitForElementVisible(findTestObject('saucedemo/add to cart/span_title_your_cart'), 5)

WebUI.verifyElementText(findTestObject('saucedemo/add to cart/cart_item_title'), 'Sauce Labs Backpack')

