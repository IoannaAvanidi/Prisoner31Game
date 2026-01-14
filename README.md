# Prisoner's 31 Game (Java)

[cite_start]A Java implementation of the "Prisoner's 31" strategy game, designed to simulate a card-less version of the classic game "31"[cite: 588, 589]. [cite_start]This project focuses on **Abstract Classes** and **Inheritance**[cite: 598].

## 🎮 Game Rules
* [cite_start]**The "Card" Mechanism**: Instead of drawing from a deck, two players simultaneously choose a number between 1 and 5[cite: 590]. [cite_start]These numbers are summed to determine the value of the "drawn card"[cite: 590].
* [cite_start]**Gameplay**: A player continues to "draw" until their total points reach at least 26[cite: 591].
* [cite_start]**Busting**: If a player exceeds 31 points, they "bust" and the opponent automatically wins the round[cite: 591, 592].
* [cite_start]**Winning Criteria**: If no one busts, the player with the most points (up to 31) wins[cite: 593]. [cite_start]In case of a tie, the player who played first in that round is declared the winner[cite: 593].
* [cite_start]**Match Structure**: Players compete in multiple rounds, alternating the starting position for each new round[cite: 594]. [cite_start]The final winner is the one with the most round victories[cite: 595].

## 🛠️ Technical Structure
[cite_start]The project is built using a structured class hierarchy[cite: 596]:

* [cite_start]**`Player` (Abstract)**: The base class storing the player's name and win count[cite: 599]. [cite_start]It contains the abstract method `selectNumber()` and the `play()` method that executes the drawing logic[cite: 601, 602].
* [cite_start]**`HumanPlayer`**: Inherits from `Player` and prompts the user to input a valid number between 1 and 5[cite: 613, 615].
* [cite_start]**`ComputerPlayer`**: Inherits from `Player` and automatically selects a random number between 1 and 5[cite: 610, 612].
* [cite_start]**`GameRounds`**: Manages round execution, updates win counts, and handles the alternating turn order[cite: 617, 620, 623].
* [cite_start]**`PrisonerGame`**: The entry point (main class) where the user chooses between "Human vs. Computer" or "Computer vs. Computer" modes[cite: 625, 626].

## 🚀 Key Features
* [cite_start]**Turn Rotation**: Automatically swaps the starting player for every new round to maintain fairness[cite: 620, 623].
* [cite_start]**Input Validation**: Ensures human players provide a valid input within the 1-5 range before proceeding[cite: 615].
* [cite_start]**Score Management**: Tracks and prints the score after each round and announces the overall winner at the end[cite: 624, 628].

## 📋 Execution Instructions
Compile all `.java` files and run the `PrisonerGame` class:

```bash
javac *.java
java PrisonerGame
