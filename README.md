# Sourcery Bonus Task
Simple console app to solve Sourcery Academy bonus task

## Task:
You were given an input of many strings, that contain numbers and letters (see below). Each line is a single string and the number of lines is unlimited.

Your task is to write a Java program that reads .txt files with provided input, iterates over each line and prints lines which contain at least one number that is equal to or higher than 10.

#### Your input: 
asf5g5g66       <br />
gh5n0rh5e       <br />
d9d10d0         <br />
oo9etyd1c3dfg4  <br />
abc999l0j       <br />
dsf1sf5sd9l0    <br />
l0l02Ol0l       <br />
asf5g5g6O       <br />
ee8OidXXI0l     <br />
d9dI0dl0        <br />

#### Output:        
asf5g5g66       <br />
d9d10d0         <br />
abc999l0j

## Run application
Simply run Main method in main class

###Default Settings for the task:

`filePathAndName` = "././bonusTaskMock.txt" </br>
`pattern` = "\\d+"                          </br>
`searchIntGreaterOrEqualTo` = 10

### Configuration
even though its simple console app, but you can change some settings.

###Change file:
In the Main class change hardcoded value `filePathAndName`.

###Change Regex pattern:
In the Main class change hardcoded value `pattern`.
> warning: **changing regex which does not satisfy task may break the code**


###Change Comparable number:
In the Main class change hardcoded value `searchIntGreaterOrEqualTo`.
> warning: **changing Comparable number which does not satisfy task may break the code**



