;wait for 10sec  to get the upload popup
Local $winID =winwait("[CLASS:#32770]","",10)

;set fous on File Name Text field of upload window 
ControlFocus($winID,"","Edit1")

;wait for 1sec
sleep(1000)

;set generic file path
ControlSetText($winID,"","Edit1","C:\Users\rohit\Desktop\AutoIT Files\"&$CmdLine[1])

;wait for 1sec
sleep(1000)

ControlClick($winID,"","Button1")