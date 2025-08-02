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

Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.ImageButton (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Create_Task/android.widget.TextView - Add Task'), 0)

//Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter task title'), 'Tugas Katalon', 
//    0)
//
//Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter your task'), 'Testing Mobile', 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Date'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.view.View - 2'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Button - OKE'), 0)
//
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Time'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Button - OKE (1)'), 0)
def scenario = 'input task'

switch (scenario) {
    case 'input_task_success':
        Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter task title'), title, 
            0)

        Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter your task'), task, 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Date'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.view.View - 2'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Button - OKE'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Time'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Button - OKE (1)'), 0)

        break
		
    case 'input_task_without_time':
        Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter task title'), title, 
            0)

        Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter your task'), task, 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Date'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.view.View - 2'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Button - OKE'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Time'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 
            0)

        Mobile.tap(findTestObject('Spyweb_Create_Task_Without_Time/android.widget.Button - BATAL'), 0)
		
    default:
        Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter task title'), title, 
            0)

        Mobile.setText(findTestObject('Object Repository/Create_Task/android.widget.EditText - Enter your task'), task, 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Date'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.view.View - 2'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Button - OKE'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.EditText - Set Time'), 0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 
            0)

        Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 
            0)

        Mobile.tap(findTestObject('Spyweb_Create_Task_Without_Time/android.widget.Button - BATAL'), 0)}

//Mobile.verifyElementText(findTestObject('Object Repository/Create_Task/android.widget.EditText - 100 PM'), '1:00 PM')
Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.CheckedTextView - Business'), 0)

Mobile.tap(findTestObject('Object Repository/Create_Task/android.widget.TextView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Create_Task/android.widget.TextView - Tugas Katalon'), 'Tugas Katalon')

Mobile.verifyElementText(findTestObject('Object Repository/Create_Task/android.widget.TextView - Testing Mobile'), 'Testing Mobile')

Mobile.closeApplication()

