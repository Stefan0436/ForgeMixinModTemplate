@echo off
set /p url=Git url: 
set /p outputname=Output folder name: 
git clone %url% "%outputname%"
if not exist "%outputname%" exit
cd %outputname% 
del download.sh
del download.bat
