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

WebUI.click(findTestObject('Object Repository/Page_Course and category management/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Administration Search/a_Manage courses and categories'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_Create new course'))

WebUI.setText(findTestObject('Object Repository/Page_SiteTesting Add a new course/input_Course full name_fullname'), 'CNTN')

WebUI.setText(findTestObject('Object Repository/Page_SiteTesting Add a new course/input_Course short name_shortname'), 'cntn')

WebUI.click(findTestObject('Object Repository/Page_SiteTesting Add a new course/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Page_Grades View/span_General'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/div_Assignment'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Assignment/input_Assignment name_name'), 'assignment test')

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_File submissions_assignsubmission_fil_19d1d4'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Online text_assignsubmission_onlinete_900d47'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Upon activity completion_submitbutton2'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Add an activity or resource_1'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/div_Chat'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Chat/input_Name of this chat room_name'), 'chat test')

WebUI.click(findTestObject('Object Repository/Page_Editing Chat/input_Upon activity completion_submitbutton2'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Add an activity or resource_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/div_Forum'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Forum/input_Forum name_name'), 'forum test')

WebUI.click(findTestObject('Object Repository/Page_Editing Forum/input_Upon activity completion_submitbutton2'))

WebUI.closeBrowser()

