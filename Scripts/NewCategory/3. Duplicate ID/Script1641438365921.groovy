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

WebUI.click(findTestObject('Object Repository/NewCategory/Page_Automation Testing Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/NewCategory/Page_Automation Testing Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/NewCategory/Page_Automation Testing Site Log in to the site/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('Object Repository/NewCategory/Page_Automation Testing Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/NewCategory/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/NewCategory/Page_SiteTesting Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/NewCategory/Page_SiteTesting Administration Search/a_Add a category'))

WebUI.setText(findTestObject('Object Repository/NewCategory/Page_SiteTesting Add new category/div_1 1'), '1 <p>1</p>')

WebUI.setText(findTestObject('Object Repository/NewCategory/Page_SiteTesting Add new category/input_Category name_name'), 
    'test2')

WebUI.setText(findTestObject('Object Repository/NewCategory/Page_SiteTesting Add new category/input_Category ID number_idnumber'), 
    '1234')

WebUI.click(findTestObject('Object Repository/NewCategory/Page_SiteTesting Add new category/input_Description_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/NewCategory/Page_SiteTesting Add new category/div_ID number is already used for another category'), 
    'ID number is already used for another category')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

