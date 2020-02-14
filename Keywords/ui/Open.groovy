package ui

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

public class Open {
	
	@Keyword
	def app(){
		
		KeywordUtil.logInfo("Open Apps")
		Mobile.startApplication(GlobalVariable.apk, false)
		Mobile.waitForElementPresent(findTestObject('/Home/text_Header_Tenji'), 10)
		Mobile.takeScreenshot()
		
	}
}
