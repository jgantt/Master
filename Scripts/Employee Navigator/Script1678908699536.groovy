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

WebUI.navigateToUrl('https://www.employeenavigator.com/')

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Home - Employee Navigator/a_Login'))

WebUI.setText(findTestObject('Object Repository/Employee Navigator/Page_Employee Navigator Identity Provider/input_Username_Username'), 
    'jgantt13')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee Navigator/Page_Employee Navigator Identity Provider/input_Password_Password'), 
    'glcjE6NubqF4IE5/Iqr1QQ==')

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Employee Navigator Identity Provider/input_you forgot to put in a code_btn btn-s_86759a'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Employee Navigator/Page_Home/a_Profile'), 10)

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Home/a_Profile'))

WebUI.waitForElementClickable(findTestObject('Employee Navigator/Page_Profile Overview/span_Education'), 10)

WebUI.click(findTestObject('Employee Navigator/Page_Profile Overview/span_Education'))

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Education/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Employee Navigator/Page_Education/input_Graduation Date_GraduationDate'), 
    '12/9/1998')

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Education/td_11'))

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Education/button_Save'))

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Education/b_Jeffrey Gantt_caret text-header'))

WebUI.click(findTestObject('Object Repository/Employee Navigator/Page_Education/a_Logout'))

