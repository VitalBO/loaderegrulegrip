SET APP_PATH=%~dp0
SET LIBRARY_PATH=%APP_PATH%lib\

%JAVA_HOME%\jre\bin\java.exe -DXms2000m -DXmx8000m -cp .;%LIBRARY_PATH%* ru.iac.MainParser
