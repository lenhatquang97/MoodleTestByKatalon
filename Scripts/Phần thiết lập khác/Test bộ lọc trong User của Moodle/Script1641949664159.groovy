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

WebUI.callTestCase(findTestCase('Kiểm tra thẻ Site Administration/Đăng nhập thành công'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TestFilter/Page_Dashboard/span_Site administration'))

WebUI.navigateToUrl('http://localhost/admin/search.php')

WebUI.click(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Search/a_Browse list of users'))

WebUI.click(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Users Accou_36dc4d/a_Show more'))

WebUI.setText(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Users Accou_36dc4d/input_User full name value_realname'), 
    'Quang')

WebUI.selectOptionByValue(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Users Accou_36dc4d/select_contains        doesnt contain      _4edb1a'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Users Accou_36dc4d/input_Email address value_email'), 
    'testing_des')

WebUI.click(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Users Accou_36dc4d/input_Last IP address value_addfilter'))

WebUI.verifyTextPresent('testing_description@gmail.com', false)

WebUI.click(findTestObject('Object Repository/TestFilter/Page_SiteTesting Administration Users Accou_36dc4d/input_concat(Email address starts with , , _fe21c5'))

