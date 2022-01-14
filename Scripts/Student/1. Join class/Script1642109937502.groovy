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

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Testing Site Log in to the site/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/input_Username_username'), 
    'student')

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/input_New password_newpassword'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.setText(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/input_First name_firstname'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/input_Surname_lastname'), 
    'b')

WebUI.setText(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/input_Email address_email'), 
    'c@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Users Accou_a8eb60/input_Address_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Search/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Site/a_CNTN'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Participants'))

WebUI.click(findTestObject('Object Repository/Page_cntn Participants/input_Participants_btn btn-secondary my-1'))

WebUI.click(findTestObject('Object Repository/Page_cntn Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_cntn Participants/small_cgmail.com'))

WebUI.click(findTestObject('Object Repository/Page_cntn Participants/button_Enrol users'))

WebUI.closeBrowser()

