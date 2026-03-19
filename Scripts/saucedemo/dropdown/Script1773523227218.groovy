import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('saucedemo/LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('saucedemo/dropdown/product_sort_container'), 'lohi', false)

WebUI.verifyOptionSelectedByValue(findTestObject('saucedemo/dropdown/product_sort_container'), 'lohi', false, 5)

WebUI.delay(1)

List<WebElement> priceElements = WebUI.findWebElements(findTestObject('saucedemo/dropdown/inventory_item_price'), 10)

List<Double> actualPrices = new ArrayList<Double>()

for (WebElement element : priceElements) {
    String priceText = element.getText().replace('$', '').trim()

    actualPrices.add(Double.parseDouble(priceText))
}

List<Double> expectedPrices = new ArrayList<Double>(actualPrices)

Collections.sort(expectedPrices)

WebUI.verifyMatch(actualPrices.toString(), expectedPrices.toString(), false)

