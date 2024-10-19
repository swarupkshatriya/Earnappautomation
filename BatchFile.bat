cd C:\Swarup_Java_practice\EasyAppAutomation
set path=.;C:\Program Files\Java\jdk-17\bin
set ProjectPath=C:\Swarup_Java_practice\EasyAppAutomation
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\seleniumfiles\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause