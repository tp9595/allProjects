;wait for window to active 
WinWaitActive ("Open") 
Sleep(2000)
Send("D:\All mechanical books\ForUpload.txt") ; provide path of file to upload 
Sleep(1000)
Send("{TAB}")   ;Press TAB to shift control to open button
Sleep(1000)
Send("{TAB}")   ;Press TAB to shift control to open button
Sleep(1000)
Send("{ENTER}") ;Press Enter 