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

WebUI.click(findTestObject('Object Repository/NewCourse/Page_Automation Testing Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/NewCourse/Page_Automation Testing Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/NewCourse/Page_Automation Testing Site Log in to the site/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('Object Repository/NewCourse/Page_Automation Testing Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/NewCourse/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/NewCourse/Page_SiteTesting Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/NewCourse/Page_SiteTesting Administration Search/a_Add a new course'))

WebUI.setText(findTestObject('Object Repository/NewCourse/Page_SiteTesting Add a new course/input_Course full name_fullname'), 
    'Test2')

WebUI.setText(findTestObject('Object Repository/NewCourse/Page_SiteTesting Add a new course/input_Course short name_shortname'), 
    'test')

WebUI.click(findTestObject('Object Repository/NewCourse/Page_SiteTesting Add a new course/input__saveanddisplay'))

WebUI.verifyElementText(findTestObject('Object Repository/NewCourse/Page_SiteTesting Add a new course/div_Short name is already used for another _823d7b'), 
    'Short name is already used for another course (Test Course)')

WebUI.closeBrowser()

