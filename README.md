# Prisoner's 31 Game (Java)

[cite_start]A Java implementation of the "Prisoner's 31" strategy game, which simulates a variation of the classic game "31" without a deck of cards[cite: 588, 589]. [cite_start]This project demonstrates the use of **Abstract Classes** and **Inheritance**[cite: 598].

## 🎮 Game Rules
* [cite_start]**The "Card" Mechanism:** Instead of drawing from a deck, two players simultaneously show a number of fingers from 1 to 5[cite: 590]. [cite_start]The sum of these two numbers represents the value of the "card" drawn by the active player[cite: 590].
* [cite_start]**Gameplay:** A player continues to "draw" until their total points reach at least 26[cite: 591].
* [cite_start]**Busting:** If a player exceeds 31 points, they "bust" and the opponent automatically wins the round[cite: 591, 592].
* [cite_start]**Winning Criteria:** If no one busts, the player with the most points wins[cite: 593]. [cite_start]In the event of a tie, the player who played first in that round is the winner[cite: 593].
* [cite_start]**Match Structure:** Players compete in multiple rounds and alternate who starts first[cite: 594]. [cite_start]The overall winner is the player who wins the most rounds[cite: 595].

## 🛠️ Class Architecture
The project is built using a structured class hierarchy:

* [cite_start]**`Player` (Abstract)**: The base class storing the player's name and win count[cite: 598, 599]. [cite_start]It contains the abstract method `selectNumber()` and the `play()` method which handles the drawing logic[cite: 601, 602].
* [cite_start]**`HumanPlayer`**: Inherits from `Player` and prompts the user to input a number between 1 and 5[cite: 613, 615].
* [cite_start]**`ComputerPlayer`**: Inherits from `Player` and automatically selects a random number between 1 and 5[cite: 610, 612].
* [cite_start]**`GameRounds`**: Manages the sequence of play, updates wins, and handles the alternating turn order for each round[cite: 617, 620, 623].
* [cite_start]**`PrisonerGame`**: The entry point of the application where users choose between "Human vs. Computer" or "Computer vs. Computer" modes[cite: 625, 626].

## 🚀 Key Features
* [cite_start]**Turn Rotation:** The game automatically tracks and swaps the starting player for every new round[cite: 620, 623].
* [cite_start]**Input Validation:** For human players, the system repeatedly asks for input until a valid number (1-5) is provided[cite: 615].
* [cite_start]**Score Tracking:** Displays the number of rounds won by each player and announces the final overall winner[cite: 624, 628].

## 📋 Execution Instructions
Compile all `.java` files and run the `PrisonerGame` class:

```bash
javac *.java
java PrisonerGame
