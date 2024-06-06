# Spring Core

Learning Spring Core Fundamentals

## Description

At this point we have a class called GameRunner class which is used to run a game. As the class name defines it runs the game so it is dependent on another game called MarioGame. So GameRunner class requires a game object to run.


### Explanation (Tight Coupling)

To run GameRunner class it is dependent on MarioGame till now it works fine, so the problem occurs here is what if we want to run another game. we have to change all the dependencies in main method and also in Game Runner class. so every time if we want change the game we have to make many changes in two different classes this make the code tightly coupled.
