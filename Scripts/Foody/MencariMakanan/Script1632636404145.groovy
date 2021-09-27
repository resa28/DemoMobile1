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

Mobile.startApplication('androidapp\\Foody Find Reserve Delivery_v5.8.7_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.TextView - Tutup'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.TextView - Connect with Google'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.TextView - Resa Nirmaya Sari'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.TextView - Search for cuisine, name, address'), 
    0)

Mobile.setText(findTestObject('Object Repository/AndroidFour/android.widget.EditText - Search for cuisine, name, address'), 
    'Ice cream', 0)

Mobile.tap(findTestObject('Object Repository/AndroidFour/android.widget.TextView - Midoricha - Ice Cream  Drink'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

