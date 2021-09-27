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

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Tutup'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Connect with Google'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Resa Nirmaya Sari'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Search for cuisine, name, address'), 
    0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.EditText - Search for cuisine, name, address'), 
    'Ice cream', 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Midoricha - Ice Cream  Drink'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Tidak'), 0)

Mobile.tap(findTestObject('AndroidFive/android.widget.EditText - Title (optional) (1)'), 0)

Mobile.setText(findTestObject('AndroidFive/android.widget.EditText - Title (optional) (1)'), 'Taste', 0)

Mobile.tap(findTestObject('AndroidFive/android.widget.EditText - Please review more than 100 words, do not spam to get reward points (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.EditText - Please review more than 100 words, do not spam to get reward points'), 
    'This is my favorite', 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Post'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Rate'), 0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.SeekBar - 50.0'), '77.0', 0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.SeekBar - 50.0 (1)'), '77.0', 0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.SeekBar - 50.0 (2)'), '77.0', 0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.SeekBar - 50.0 (3)'), '77.0', 0)

Mobile.setText(findTestObject('Object Repository/AndroidFive/android.widget.SeekBar - 50.0 (4)'), '77.0', 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - No. person'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.CheckedTextView - 8'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Expense'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.CheckedTextView - 500,000'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Come back'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.CheckedTextView - Sure'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Done'), 0)

Mobile.tap(findTestObject('AndroidFive/android.widget.TextView - Post'), 0)

Mobile.tap(findTestObject('Object Repository/AndroidFive/android.widget.Button - CLOSE'), 0)

Mobile.getText(findTestObject('Object Repository/AndroidFive/android.widget.TextView - Taste'), 0)

Mobile.getText(findTestObject('Object Repository/AndroidFive/android.widget.TextView - This is my favorite'), 0)

Mobile.getText(findTestObject('Object Repository/AndroidFive/android.widget.TextView - View translations'), 0)

Mobile.closeApplication()

