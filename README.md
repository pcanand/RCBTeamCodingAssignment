# RCBTeamCodingAssignment
Maven POM.xml can be used to execute the test cases in Jenkins
POM.xml, testng.xml both can be used to run the test cases in the eclipse 


Frameworks: TestNG(6.14.3), RestAssured(4.4.0)
Reporting : ExtenReports(2.41.2) Once on test execution reports will be generated in test-output folder with the current timeanddate(1029DEC01.html) 
Logs      : Log4j(1.2.15)


Attached Jenkins console output on executing the test from git
Started by user admin
Running as SYSTEM
Building in workspace C:\ProgramData\Jenkins\.jenkins\workspace\Autimation
The recommended git tool is: NONE
using credential 8c235348482f4ffcbab95587d2060af6
 > git.exe rev-parse --resolve-git-dir C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\.git # timeout=10
Fetching changes from the remote Git repository
 > git.exe config remote.origin.url https://github.com/pcanand/RCBTeamCodingAssignment.git # timeout=10
Fetching upstream changes from https://github.com/pcanand/RCBTeamCodingAssignment.git
 > git.exe --version # timeout=10
 > git --version # 'git version 2.38.1.windows.1'
using GIT_ASKPASS to set credentials github
 > git.exe fetch --tags --force --progress -- https://github.com/pcanand/RCBTeamCodingAssignment.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git.exe rev-parse "refs/remotes/origin/main^{commit}" # timeout=10
Checking out Revision 951a619224ea25892bedbd3eeac2da11483570aa (refs/remotes/origin/main)
 > git.exe config core.sparsecheckout # timeout=10
 > git.exe checkout -f 951a619224ea25892bedbd3eeac2da11483570aa # timeout=10
Commit message: "lastchanges"
 > git.exe rev-list --no-walk 951a619224ea25892bedbd3eeac2da11483570aa # timeout=10
Parsing POMs
Established TCP socket on 56988
[Autimation] $ "C:\Program Files\Java\jdk-11.0.16/bin/java" -cp C:\ProgramData\Jenkins\.jenkins\plugins\maven-plugin\WEB-INF\lib\maven35-agent-1.14.jar;C:\ProgramData\Jenkins\.jenkins\tools\hudson.tasks.Maven_MavenInstallation\Maven\boot\plexus-classworlds-2.6.0.jar;C:\ProgramData\Jenkins\.jenkins\tools\hudson.tasks.Maven_MavenInstallation\Maven/conf/logging jenkins.maven3.agent.Maven35Main C:\ProgramData\Jenkins\.jenkins\tools\hudson.tasks.Maven_MavenInstallation\Maven C:\ProgramData\Jenkins\war\WEB-INF\lib\remoting-3071.v7e9b_0dc08466.jar C:\ProgramData\Jenkins\.jenkins\plugins\maven-plugin\WEB-INF\lib\maven35-interceptor-1.14.jar C:\ProgramData\Jenkins\.jenkins\plugins\maven-plugin\WEB-INF\lib\maven3-interceptor-commons-1.14.jar 56988
<===[JENKINS REMOTING CAPACITY]===>channel started
Executing Maven:  -B -f C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\pom.xml clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< TestAutomation:RestAPI >-----------------------
[INFO] Building RestAPI 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ RestAPI ---
[INFO] Deleting C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ RestAPI ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ RestAPI ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 3 source files to C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\target\classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ RestAPI ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\src\test\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ RestAPI ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ RestAPI ---
[INFO] No tests to run.
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
[TestNGContentHandler] [WARN] It is strongly recommended to add "<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >" at the top of your file, otherwise TestNG may fail or not work as expected.
12-02-2022 11:18:12 BaseClass.java INFO  [main] test.BaseClass 36 - Logger has been Initialized
12-02-2022 11:18:12 BaseClass.java INFO  [main] test.BaseClass 64 - overseasplayerValidationTest has been started
12-02-2022 11:18:14 BaseClass.java INFO  [main] test.BaseClass 70 - Completed Test Sucessfully
12-02-2022 11:18:14 BaseClass.java INFO  [main] test.BaseClass 64 - keeperValidationTest has been started
1Wicket Keeper Found
12-02-2022 11:18:15 BaseClass.java INFO  [main] test.BaseClass 70 - Completed Test Sucessfully
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.111 s - in TestSuite
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[JENKINS] Recording test results
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ RestAPI ---
[INFO] Building jar: C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\target\RestAPI-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ RestAPI ---
[INFO] Installing C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\target\RestAPI-0.0.1-SNAPSHOT.jar to C:\Windows\system32\config\systemprofile\.m2\repository\TestAutomation\RestAPI\0.0.1-SNAPSHOT\RestAPI-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\pom.xml to C:\Windows\system32\config\systemprofile\.m2\repository\TestAutomation\RestAPI\0.0.1-SNAPSHOT\RestAPI-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.553 s
[INFO] Finished at: 2022-12-02T11:18:17+05:30
[INFO] ------------------------------------------------------------------------
Waiting for Jenkins to finish collecting data
[JENKINS] Archiving C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\pom.xml to TestAutomation/RestAPI/0.0.1-SNAPSHOT/RestAPI-0.0.1-SNAPSHOT.pom
[JENKINS] Archiving C:\ProgramData\Jenkins\.jenkins\workspace\Autimation\target\RestAPI-0.0.1-SNAPSHOT.jar to TestAutomation/RestAPI/0.0.1-SNAPSHOT/RestAPI-0.0.1-SNAPSHOT.jar
channel stopped
Finished: SUCCESS
