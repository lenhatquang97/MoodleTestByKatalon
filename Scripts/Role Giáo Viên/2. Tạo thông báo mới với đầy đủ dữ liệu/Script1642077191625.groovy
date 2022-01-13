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

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Automation Testing Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Automation Testing Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Automation Testing Site Log in to the site/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Automation Testing Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Automation Testing Site/a_Init Course'))

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Course Init Course/span_Announcements Forum'))

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Announcements/a_Add a new topic'))

WebUI.setText(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Announcements/input_Subject_subject'), 
    'Test announce')

WebUI.setText(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Announcements/div_test content'), 
    '<p dir="ltr" style="text-align: left;">test content</p>')

WebUI.click(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Announcements/input_Message_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Tạo thông báo mới với dữ liệu đúng/Page_Announcements/p_Your post was successfully added'), 
    'Your post was successfully added.')

WebUI.closeBrowser()

