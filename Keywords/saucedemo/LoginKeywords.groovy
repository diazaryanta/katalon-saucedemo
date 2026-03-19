package saucedemo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class LoginKeywords {

    @Keyword
    def loginSauce(String username, String password) {
        WebUI.openBrowser('https://www.saucedemo.com/')
        WebUI.maximizeWindow()
        
        WebUI.setText(findTestObject('Object Repository/saucedemo/Login Page/input_username'), username)
        
        WebUI.setEncryptedText(findTestObject('Object Repository/saucedemo/Login Page/input_password'), password)
        
        WebUI.click(findTestObject('Object Repository/saucedemo/Login Page/btn_login'))
    }
}