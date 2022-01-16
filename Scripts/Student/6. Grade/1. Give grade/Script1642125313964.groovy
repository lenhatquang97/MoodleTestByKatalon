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

WebUI.callTestCase(findTestCase('Student/5. Submit/3. Submit'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Site Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Testing Site Log in to the site/input_Password_password'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Site/a_CNTN'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_assignment test'))

WebUI.click(findTestObject('Object Repository/Page_cntn assignment test/a_Grade'))

WebUI.setText(findTestObject('Object Repository/Page_cntn assignment test - Grading/input_Grade out of 100_grade'), '90')

WebUI.click(findTestObject('Object Repository/Page_cntn assignment test - Grading/button_Save changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_cntn assignment test - Grading/a_90.00'), '90.00')

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Student/2. Login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Grades'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Grades View/a_assignment test'), 'assignment test')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Grades View/td_90.00'), '90.00')

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Grades'))

WebUI.click(findTestObject('Object Repository/Page_Grades View/a_Overview report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Grades View/a_CNTN'), 'CNTN')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Grades View/td_90.00'), '90.00')

WebUI.closeBrowser()

