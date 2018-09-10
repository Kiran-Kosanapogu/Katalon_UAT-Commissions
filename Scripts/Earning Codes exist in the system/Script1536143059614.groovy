import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Commission Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Callidus Cloud Commissions Man/div_ADMINISTRATION'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/Reason Codes'), 8)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/Reason Codes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/a_Advanced Search'))

not_run: WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Field Name'))

not_run: WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/option_Earning Code id'), 8)

not_run: WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/option_Earning Code id'))

not_run: WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/td_Comparision'))

not_run: WebUI.scrollToElement(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'), 2)

not_run: WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/option_Equals'))

not_run: WebUI.setText(findTestObject('Page_Callidus Cloud Commissions Man/td_Value'), 'commission')

not_run: WebUI.click(findTestObject('Page_Callidus Cloud Commissions Man/input_Apply Search'))

not_run: WebUI.callTestCase(findTestCase('Commission Logout'), [:], FailureHandling.STOP_ON_FAILURE)

