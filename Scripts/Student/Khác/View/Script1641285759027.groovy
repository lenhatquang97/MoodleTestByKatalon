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

WebUI.callTestCase(findTestCase('Student/login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_CNTN'))

WebUI.navigateToUrl('http://localhost/course/view.php?id=2')

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Announcements Forum'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/i_Actions_icon fa fa-star-o fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/i_Actions_icon fa fa-star fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/a_Topic'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CNTN Topic/h3_Topic'), 'Topic')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CNTN Topic/a_Test'), 'Test')

WebUI.closeBrowser()

