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

WebUI.navigateToUrl('http://localhost/ProjectSimpleCI-master/index.php/news')

WebUI.click(findTestObject('Object Repository/edit/a_Edit'))

WebUI.setText(findTestObject('Object Repository/edit/textarea_jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj_7474be'), 'jaja')

WebUI.click(findTestObject('Object Repository/edit/input_Text_submit'))

WebUI.click(findTestObject('Object Repository/edit/a_Edit_1'))

WebUI.setText(findTestObject('Object Repository/edit/input_Title_title'), '15th test')

WebUI.click(findTestObject('Object Repository/edit/input_Text_submit'))

WebUI.click(findTestObject('Object Repository/edit/a_Delete'))

WebUI.click(findTestObject('Object Repository/edit/body_Simple CRUDHome  Add NewsNews archive _456ffc'))

WebUI.closeBrowser()

