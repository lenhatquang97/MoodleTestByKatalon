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

WebUI.click(findTestObject('Object Repository/AddANewUserObject/Page_SiteTesting Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/AddANewUserObject/Page_SiteTesting Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Username_username'), 
    'testing_description')

WebUI.click(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_New password_newpassword'), 
    'cnpXG5HhkrZpEXzNIGBMZQ==')

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_First name_firstname'), 
    'Quang')

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Surname_lastname'), 
    'Le5')

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Email address_email'), 
    'testing_description@gmail.com')

WebUI.click(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/a_Additional names'))

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_First name - phonetic_firstnamephonetic'), 
    'Quang')

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Surname - phonetic_lastnamephonetic'), 
    'Le')

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Middle name_middlename'), 
    'Nhat')

WebUI.click(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/a_Optional_1'))

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Phone_phone1'), 
    '0123456789')

WebUI.setText(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_ID number_idnumber'), 
    '1000')

WebUI.click(findTestObject('Object Repository/OptionalUserFormObject/Page_SiteTesting Administration Users Accou_a8eb60/input_Address_submitbutton'))

WebUI.navigateToUrl('http://localhost/admin/user.php')

