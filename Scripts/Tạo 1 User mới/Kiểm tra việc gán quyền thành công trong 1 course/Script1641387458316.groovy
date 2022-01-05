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

WebUI.callTestCase(findTestCase('Tạo 1 User mới/Điền đầy đủ thông tin bắt buộc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_Automation Testing Site/a_Sample Course For Permission'))

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_Course Sample Course For Permission/span_Participants'))

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_SampleC Participants/input_With selected users_btn btn-secondary my-1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddToCourseObj/Page_SampleC Participants/select_Manager            Teacher          _ffc00f'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_SampleC Participants/span_'))

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_SampleC Participants/li_Quang Le1    testinggmail.com'))

WebUI.click(findTestObject('Object Repository/AddToCourseObj/Page_SampleC Participants/button_Enrol users'))

WebUI.verifyElementText(findTestObject('Object Repository/AddToCourseObj/Page_SampleC Participants/td_testinggmail.com'), 
    'testing@gmail.com')

