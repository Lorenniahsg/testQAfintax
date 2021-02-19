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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://qainterview.pythonanywhere.com/')

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), '9')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), '999')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), '-2')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), '')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), 'a')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), 'a1')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), 'a@')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.setText(findTestObject('Object Repository/Page_/input_The greatest factorial calculator_number'), '@a')

WebUI.click(findTestObject('Object Repository/Page_/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Page_/a_Terms and Conditions'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/a_Privacy'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/a_Qxf2 Services'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/span_The greatest factorial calculator_icon_e49caa'))

WebUI.click(findTestObject('Object Repository/Page_Factoriall/h1_The greatest factorial calculator'))

