# Prisoner's 31 Game (Java)

A Java implementation of the "Prisoner's 31" strategy game, designed to simulate a card-less version of the classic game "31". [cite_start]This project focuses on **Abstract Classes**, **Inheritance**, and **Game State Management**[cite: 588, 598].

## 🎮 Game Rules
* [cite_start]**The "Draw" Mechanism:** Instead of drawing cards, two players simultaneously choose a number from 1 to 5[cite: 590]. [cite_start]The two numbers are summed, and the total is added to the active player's points[cite: 590].
* [cite_start]**Gameplay:** A player continues "drawing" until their points reach at least 26[cite: 591].
* [cite_start]**Busting:** If a player exceeds 31 points, they "bust" and the opponent automatically wins the round[cite: 591, 592].
* [cite_start]**Winning Criteria:** If neither player busts, the one with the highest score wins[cite: 593]. [cite_start]In the event of a tie, the first player of that round is declared the winner[cite: 593].
* [cite_start]**Match Structure:** Players play multiple rounds, alternating who goes first[cite: 594]. [cite_start]The overall winner is the one with the most round victories[cite: 595].

## 🛠️ Class Architecture
The project is structured around a specialized class hierarchy:

* [cite_start]**`Player` (Abstract)**: The base class storing the player's name and win count[cite: 598, 599]. [cite_start]It defines the abstract method `selectNumber()` and the core `play()` logic[cite: 601, 602].
* [cite_start]**`HumanPlayer`**: Inherits from `Player` and handles manual input from the user, ensuring the choice is between 1 and 5[cite: 614, 615].
* [cite_start]**`ComputerPlayer`**: Inherits from `Player` and implements automated play by randomly selecting numbers between 1 and 5[cite: 611, 612].
* [cite_start]**`GameRounds`**: Manages the sequence of rounds, tracks scores, and alternates the starting player[cite: 617, 618, 623].
* **`PrisonerGame`**: The entry point containing the `main` method. [cite_start]It allows the user to choose between "Human vs. Computer" or "Computer vs. Computer" modes[cite: 625, 626].

## 🚀 Key Features
* [cite_start]**Automated AI:** Features a random-choice AI for simulation modes[cite: 612].
* [cite_start]**Turn Rotation:** Automatically swaps the starting player each round to ensure fairness[cite: 620, 623].
* [cite_start]**Input Validation:** Robust handling of user input to keep values within the 1-5 range[cite: 615].

## 📋 Execution Instructions
Compile all `.java` files and run the `PrisonerGame` class:

```bash
javac *.java
java PrisonerGame
