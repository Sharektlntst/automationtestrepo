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

WebUI.navigateToUrl('https://www.amazon.com/')
 //masked the maxim and delays
//WebUI.maximizeWindow()
//Add comments

//WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/clckSignin'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign-In/InputText'), 'ktlntst@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/clckCont'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Sign-In/password'), '8ONjX3ggx5RmoBbvnoZOyw==')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/signIn'))

WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/Page_Amazon.com  Music/protectPassword'), '8ONjX3ggx5RmoBbvnoZOyw==')

//WebUI.click(findTestObject('Object Repository/Page_Amazon.com  Music/impairedVision'))


//WebUI.navigateToUrl('https://www.amazon.com/')*/
//WebUI.click(findTestObject('Object Repository/Page_Amazon.com  Music/searchMusic'))
WebUI.setText(findTestObject('Object Repository/Page_Amazon.com  Music/searchMusic'), 'Music')
////*[@id="nav-flyout-searchAjax"]/div[2]/div[2]/div
WebUI.click(findTestObject('Object Repository/Page_Amazon.com  Music/clckSearch'))

//WebUI.click(findTestObject('Object Repository/Page_Amazon.com  Music/musicPlayer'))

//WebUI.click(findTestObject('Object Repository/Page_Amazon.com  Music/piMusic'))

//WebUI.closeBrowser()

