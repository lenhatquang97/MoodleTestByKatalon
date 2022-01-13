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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_CNTN'))

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Test Assignment'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test/a_Grade'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CNTN Test - Grading/small_nguyenkhoa0721gmail.com'), 'nguyenkhoa0721@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Grading/input_Grade out of 100_grade'))

WebUI.setText(findTestObject('Object Repository/Page_CNTN Test - Grading/input_Grade out of 100_grade'), '99')

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Grading/button_Save changes'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CNTN Test - Grading/a_99.00'), '99.00')

WebUI.closeBrowser()

