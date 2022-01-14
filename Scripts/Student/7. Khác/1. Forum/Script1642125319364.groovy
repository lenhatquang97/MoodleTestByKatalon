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

WebUI.callTestCase(findTestCase('Student/2. Login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_forum test'))

WebUI.click(findTestObject('Object Repository/Page_forum test/a_Add a new discussion topic'))

WebUI.setText(findTestObject('Object Repository/Page_forum test/input_Subject_subject'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_forum test/p_Test'))

WebUI.setText(findTestObject('Object Repository/Page_forum test/div_Test forum'), '<p dir="ltr" style="text-align: left;" id="yui_3_17_2_1_1642140744739_515">Test forum</p><p dir="ltr" style="text-align: left;" id="yui_3_17_2_1_1642140744739_515"><br></p>')

WebUI.click(findTestObject('Object Repository/Page_forum test/input_Draft saved_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_forum test/a_Test'))

WebUI.click(findTestObject('Object Repository/Page_cntn Test/a_Delete'))

WebUI.click(findTestObject('Object Repository/Page_cntn/button_Continue'))

WebUI.closeBrowser()

