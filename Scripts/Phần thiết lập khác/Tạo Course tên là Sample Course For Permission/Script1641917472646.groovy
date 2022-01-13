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
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling


WebUI.callTestCase(findTestCase('Kiểm tra thẻ Site Administration/Đăng nhập thành công'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AddSampleCourse/Page_Dashboard/span_Site home'))

if(WebUI.verifyTextPresent('Sample Course For Permission', false,FailureHandling.OPTIONAL) == true) {
	KeywordUtil.markPassed("Pass")
}
else {
	
	WebUI.click(findTestObject('Object Repository/AddSampleCourse/Page_Automation Testing Site/button_Add a new course'))
	
	WebUI.setText(findTestObject('Object Repository/AddSampleCourse/Page_SiteTesting Add a new course/input_Course full name_fullname'),
		'Sample Course For Permission')
	
	WebUI.setText(findTestObject('Object Repository/AddSampleCourse/Page_SiteTesting Add a new course/input_Course short name_shortname'),
		'SampleC')
	
	WebUI.click(findTestObject('Object Repository/AddSampleCourse/Page_SiteTesting Add a new course/input__saveandreturn'))
	
	WebUI.verifyTextPresent('Sample Course For Permission', false)
}



