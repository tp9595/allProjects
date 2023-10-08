;wait for window to active 
WinWaitActive ("File Upload") 
Sleep(2000)
Send("D:\All mechanical books\ForUpload.txt") ; provide path of file to upload 
Sleep(1000)
Send("{TAB}")   ;Press TAB to shift control to open button
Sleep(1000)
Send("{TAB}")   ;Press TAB to shift control to open button
Sleep(1000)
Send("{ENTER}") ;Press Enter 