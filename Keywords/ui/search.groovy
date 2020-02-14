package ui

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil

public class search {

	@Keyword
	def itb(){

		KeywordUtil.logInfo("Click More")
		Mobile.tap(findTestObject('/Home/button_MoreOption'), 10)
		Mobile.waitForElementPresent(findTestObject('/Home/button_CampusSearch'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("Click Search")
		Mobile.tap(findTestObject('/Home/button_CampusSearch'), 10)
		Mobile.waitForElementPresent(findTestObject('/WebView/input_SearchKampus'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("Type ITB")
		Mobile.tap(findTestObject('/WebView/input_SearchKampus'), 10)
		Mobile.setText(findTestObject('/WebView/input_SearchKampus'),
				"itb", 10)
		Mobile.hideKeyboard()
		Mobile.verifyElementExist(findTestObject('/WebView/sugest_ITB'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("Search ITB")
		Mobile.tap(findTestObject('/WebView/sugest_ITB'), 10)

		KeywordUtil.logInfo("Check Web was loaded")
		Mobile.verifyElementExist(findTestObject('/WebView/Header_InstitutTeknologiBandung'), 60)
		Mobile.verifyElementExist(findTestObject('/WebView/Header_InstitutTeknologiBandung'), 60)
		Mobile.delay(3)
		Mobile.scrollToText("Institut Teknologi Bandung (ITB)")
		Mobile.delay(1)
		Mobile.takeScreenshot()
	}
}
