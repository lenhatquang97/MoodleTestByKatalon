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

WebUI.click(findTestObject('Object Repository/Page_Course CNTN/span_Test Assignment'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test/button_Add submission'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Edit submission/div_You can drag and drop files here to add_ebeecb'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Edit submission/a_Recent files'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Edit submission/div_Wikimedia_yui_3_17_2_1_1641269282999_774'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Edit submission/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_CNTN Test - Edit submission/input_Loading_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CNTN Test/a_1911115050_146_TIN206_29-12-2021.pptx'), '1911115050_146_TIN206_29-12-2021.pptx')

