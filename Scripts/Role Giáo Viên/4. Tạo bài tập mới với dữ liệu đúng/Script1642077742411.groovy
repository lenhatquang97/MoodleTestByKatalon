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

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Automation Testing Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Automation Testing Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Automation Testing Site Log in to the site/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Automation Testing Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Automation Testing Site/a_Init Course'))

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Course Init Course/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Course Init Course/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Course Init Course/img_Recommended_icon icon'))

WebUI.setText(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Editing Assignment/input_Assignment name_name'), 
    'Bài taapkj mới')

WebUI.click(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_Editing Assignment/input_Upon activity completion_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Tạo bài tập mới với dữ liệu đúng/Page_init Bi taapkj mi/h2_Bi taapkj mi'), 
    'Bài taapkj mới')

WebUI.closeBrowser()

