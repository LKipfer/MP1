# MP1
 Mini Project 1: Geographical Data Management System

 Creator: Lukas Kipfer
 Class:   BITPT19
 Programs used: IntelliJ, SceneBuilder 2.0

 *General Info:*

 Dear Mr. Bradley

 First i wanted to let you know that i have worked on this project by myself and not in a group. I decided to do it by myself for 2 specific reasons:
 - In September i started a new job which is very demanding. I wasn't able to focus much on school especially in the first few weeks and thought it would be unfair of me to take on a group project when i had barely any spare time to cooperate..
 - Furthermore, i really wanted to learn JavaFX in my own tempo. In the 1st semester, we have barely touched upon the topics of JavaFX and i feel like i only passed the exam because of the cheatsheet which we were allowed to use. By working on this project by myself, i was able to learn a lot and am very happy with the results that i have achieved.

Nonetheless, i have tried to use GitHub throughout the project despite being solo, in order to gain some experiences with it as well.


*Minimum Requirements:*
- Class Hierarchy:  Created a parent class "GovernedRegion" that can be used to inherit attributes to the subclasses "Country" and "State".
--> One of my biggest issues was to find a way to display multiple subclasses in one tableview. This is why only the subclass "Country" was effectively used in the program. In the end i thought it would make sense to display a different subclass in a separate tableview, however i didnt have time to implement that feature. I left the 2nd table in, in hopes that you could give me a feedback if that 2nd table would be a good idea or not.
(My idea was to create a combobox on top, to differentiate between the 2 classes. The buttons would then check which subclass was called in the combobox and would then target the according table.)

- CRUD: The user can create, read, update and delete entries.
--> All Buttons work well. I was able to prevent some simple errors. For example the program gave an error because it couldnt load an empty field in the table. So i told the constructor to print the string "None" in that field. Sadly, i wasnt able to fix wrong inputs yet such as a String input when the program expects an integer, etc.


 *Additional Features:*
 - Save to textfile: The program loads data from the textfile and saves any changes or new entries whenever a button is clicked.
 --> This feature probably took me the most time to implement, but i thought it would be the most important one.

 - Row can be called via Mouseclick: By clicking into a row, the textfields copy the row's data. This makes the update feature a lot simpler for the user.

 - Error Feedback: Implemented try & catch in some methods to display any exceptions.


Should you have any questions about my program then please contact me via: Lukas.Kipfer@students.fhnw.ch
I am looking forward to read your feedback.

Best regards,
Lukas Kipfer
