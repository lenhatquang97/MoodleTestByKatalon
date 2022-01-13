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

WebUI.click(findTestObject('NewCourse/Page_Automation Testing Site (1)/div_You are not logged in. (Log in)'))

WebUI.click(findTestObject('NewCourse/Page_Automation Testing Site (1)/a_Log in'))

WebUI.setText(findTestObject('NewCourse/Page_Automation Testing Site Log in to the site (1)/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('NewCourse/Page_Automation Testing Site Log in to the site (1)/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('NewCourse/Page_Automation Testing Site Log in to the site (1)/button_Log in'))

WebUI.click(findTestObject('NewCourse/Page_Dashboard (1)/span_Site administration'))

WebUI.click(findTestObject('NewCourse/Page_SiteTesting Administration Search (1)/a_Courses'))

WebUI.click(findTestObject('NewCourse/Page_SiteTesting Administration Search (1)/a_Add a new course'))

WebUI.setText(findTestObject('NewCourse/Page_SiteTesting Add a new course (1)/input_Course full name_fullname'), 'Test Course')

WebUI.setText(findTestObject('NewCourse/Page_SiteTesting Add a new course (1)/input_Course short name_shortname'), 'test')

WebUI.click(findTestObject('NewCourse/Page_SiteTesting Add a new course (1)/input__saveanddisplay'))

WebUI.verifyElementText(findTestObject('NewCourse/Page_test Participants (1)/h1_Test Course'), 'Test Course')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

