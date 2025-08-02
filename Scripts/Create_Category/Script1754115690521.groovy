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

Mobile.startApplication('C:\\Users\\mk.rima\\Downloads\\Todo_2.0_APKPure.apk', true)

Mobile.tap(findTestObject('Object Repository/Create_Category/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/Create_Category/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Create_Category/android.widget.CheckedTextView - Category'), 0)

Mobile.tap(findTestObject('Object Repository/Create_Category/android.widget.ImageButton (1)'), 0)

//Mobile.setText(findTestObject('Object Repository/Create_Category/android.widget.EditText - Enter category'), 'Sport', 0)
//Mobile.tap(findTestObject('Object Repository/Create_Category/android.widget.Button - ADD'), 0)
//Mobile.verifyElementText(findTestObject('Object Repository/Create_Category/android.widget.TextView - Sport'), 'Sport')
def scenario = 'input category'

switch (scenario) {
    case 'input_category_success':
        Mobile.setText(findTestObject('Object Repository/Create_Category/android.widget.EditText - Enter category'), category, 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Category/android.widget.Button - ADD'), 0)

        break
    case 'input_category_unsuccess':
        Mobile.setText(findTestObject('Object Repository/Create_Category/android.widget.EditText - Enter category'), category, 
            0)

        Mobile.tap(findTestObject('Spyweb_Create Category/android.widget.Button - CANCEL'), 0)

        break
    default:
        Mobile.setText(findTestObject('Object Repository/Create_Category/android.widget.EditText - Enter category'), category, 
            0)

        Mobile.tap(findTestObject('Spyweb_Create Category/android.widget.Button - CANCEL'), 0)

        break
}

Mobile.closeApplication()

