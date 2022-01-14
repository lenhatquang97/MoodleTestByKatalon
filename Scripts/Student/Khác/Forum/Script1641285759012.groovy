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

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Forum'))

WebUI.click(findTestObject('Object Repository/Page_Forum/a_Add a new discussion topic'))

WebUI.setText(findTestObject('Object Repository/Page_Forum/input_Subject_subject'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Forum/input_Message_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_Forum/div_test'), '<p dir="ltr" style="text-align: left;">test</p>')

WebUI.click(findTestObject('Object Repository/Page_Forum/input_Message_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Forum/a_test'))

WebUI.click(findTestObject('Object Repository/Page_CNTN test/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_CNTN/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Forum/div_(There are no discussion topics yet in _507a86'), 
    '(There are no discussion topics yet in this forum)')

WebUI.closeBrowser()

