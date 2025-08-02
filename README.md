Pre-requirements: 
1. Install Katalon Studio v.9.1.0 (atau terbaru)
2. Install Node Js (disarankan versi 18)
3. Install Appium latest (2.x, atau terbaru)
4. Install UiAutomator2 driver untuk android / install XCUITest driver untuk macOS
5. Prepare Android device/emulator
6. Buat Project Baru --> File - New - Project
7. Recording Mobile -> Android Devices
8. Masukkan Aplication File (APK) dan click start
9. Lakukan Recording Mobile sesuai dengan perintah yang akan dijalankan lalu save script
10. Jalankan Recording dan Klik Run -> Android
11. Atau Spy Web Mobile untuk mengambil Object Repository dan pindahkan ke objek hasil recording
12. Data Driven Test --> Simpan data Excel yanga akan di test pada Folder Katalon - Raw Data, lalu pada Katalon -> Test data klik tombol kanan New-> Test Data lalu buat nama test data dan simpan sesuai data type
13. Pada test data, klik tombol browse, dan arahkan pada file excel test data, lalu checklist pada use relative path
14. Buat Test Suite dan Pindahkan data test case ke tampilan test suite lalu Klik Show Data Binding dan klik tombol Add lalu browse test data yang telah dibuat dan klik Map All
15. Run Test Suite dan klik Android
    
**---Skenario Switch Case Test Case Create Category :**

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

**----Skenario Switch Case Test Case Create Task :**

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

   }
