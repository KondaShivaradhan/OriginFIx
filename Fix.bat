@ECHO OFF
javac FixO.java
java FixO
echo press yes when origin is ready
set /p id=""
javac robo.java
java robo
PAUSE