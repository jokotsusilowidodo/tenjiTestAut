package ui

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil

public class VideoCheking {

	@Keyword
	def List(){

		KeywordUtil.logInfo("Check video was loaded")
		Mobile.verifyElementExist(findTestObject('/Home/Video_List/TitleVideo_G12_Chemistry'), 10)
		Mobile.verifyElementExist(findTestObject('/Home/Video_List/TitlleVideo_G12_Japanese_Classics'), 10)
		Mobile.verifyElementExist(findTestObject('/Home/Video_List/TitleVideo_G12_English'), 10)
		Mobile.verifyElementExist(findTestObject('/Home/Video_List/TitleVideo_G12_Math'), 10)
		Mobile.verifyElementExist(findTestObject('/Home/Video_List/TitleVideo_G12_JapaneseHistory'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("Click Video G12 Math")
		Mobile.tap(findTestObject('/Home/Video_List/TitleVideo_G12_Math'), 10)
		Mobile.waitForElementPresent(findTestObject('/Home/Video_List/VideoContent/text_Header_G12_English'), 10)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("Check Video was Loaded")
		Mobile.waitForElementPresent(findTestObject('/Home/Video_List/VideoContent/seekbar'), 10)
		Mobile.delay(3)
		Mobile.takeScreenshot()

		KeywordUtil.logInfo("Play Video")
		Mobile.tap(findTestObject('/Home/Video_List/VideoContent/button_Play'), 10)
		Mobile.delay(10)
		Mobile.takeScreenshot()
	}
}
