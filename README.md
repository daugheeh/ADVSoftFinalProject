# ADVSoftFinalProject
Within this Github repository you can find all of the unit tests generated through both ChatGPT as well as Randoop.

Steps to reproduce the testing yourself:
  Randoop:
    -Install Randoop to your system
    -Open command prompt
    -Use the following command to change the directory:
      cd C:\randoop-4.2.5\code
    -Compile each file you want to test with (I used my FlawedCode examples) using the following:
      javac <codefile.java>
    -The next step is to run randoop and have it create unit tests with the following command:
      java -classpath "C:\randoop-4.2.5\code;C:\randoop-4.2.5\randoop-all-4.2.5.jar
      " randoop.main.Main gentests --testclass=FlawedCode1 --testclass=FlawedCode2
      --testclass=FlawedCode3 --testclass=FlawedCode4 --testclass=FlawedCode5 --no-regression-
      tests=true --unchecked-exception=ERROR --npe-on-null-input=ERROR --oom-exception=EXPECTED
      --sof-exception=EXPECTED
    -After it has run its course (it should take a couple minutes) it should generate between 18-31 files of unit tests
    
  ChatGPT:
    -Navigate to chat.openai.com
    -Create an account or login in any of the other optional manners (like through google or apple)
    -When it comes to the prompt you are welcome to get creative but the exact prompt that I used was:
      Please write error revealing unit tests to reveal all errors in the following java code snippets,
      please include comments detailing where and what in the code snippets each test is testing:
        Paste all the code that you are testing with here
    -Within 10-15 seconds it should give an output of the unit tests to test each code snippet.

  Testing Stats:
    -Speed: In order to test the speed with which randoop and GPT were able to complete the desired task
            I screen recorded myself doing each of these tests and then went back and subtracted the start time from the finish time.
            There are more precise ways to measure this, but the goal was to measure how long the actual user experience is for
            using these tools.
    -Accuracy: To determine the accuracy of the tests, the best way to accomplish this, and the way that I did, is to intentionally
               plant specifc errors in the code, then determining after running the tests how many of them were accounted for by the program.
               This ended up being relatively easy in my experience because both programs didn't fail to account for any of the bugs I planted.
    -Usability: Of the three this is probably the most difficult to recreate because you need to have willing participants that are not 
                involved in the study (not yourself) and just survey them about how easy each method of unit test creation is easiest to 
                decipher and use.
                
  
