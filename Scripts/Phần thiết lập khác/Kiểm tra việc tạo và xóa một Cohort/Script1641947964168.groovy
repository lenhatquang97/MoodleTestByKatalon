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

WebUI.click(findTestObject('Object Repository/AddANewUserObject/Page_Dashboard/span_Site administration'))

WebUI.navigateToUrl('http://localhost/admin/search.php')

WebUI.click(findTestObject('Object Repository/AddCohort/Page_SiteTesting Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/AddCohort/Page_SiteTesting Administration Search/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/AddCohort/Page_SiteTesting Administration Users Accou_c8a473/a_Add new cohort'))

WebUI.setText(findTestObject('Object Repository/AddCohort/Page_Add new cohort/input_Name_name'), 'Cohort1')

WebUI.click(findTestObject('Object Repository/AddCohort/Page_Add new cohort/input_Description_submitbutton'))

WebUI.verifyTextPresent('Cohort1', false)

WebUI.click(findTestObject('Object Repository/AddCohort/Page_SiteTesting Administration Users Accou_c8a473/i_Created manually_icon fa fa-trash fa-fw'))

WebUI.verifyElementText(findTestObject('Object Repository/AddCohort/Page_Delete cohort/p_Do you really want to delete cohort Cohort1'), 
    'Do you really want to delete cohort \'Cohort1\'?')

WebUI.click(findTestObject('Object Repository/AddCohort/Page_Delete cohort/button_Continue'))

WebUI.navigateToUrl('http://localhost/cohort/index.php?page=0&contextid=1')

