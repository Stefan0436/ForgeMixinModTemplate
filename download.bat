@echo off
set /p url="Git url: "
set /p outputname="Output folder name: "
git clone %url% "%outputname%"
cd %outputname% 
