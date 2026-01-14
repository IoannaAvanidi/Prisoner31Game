# Prisoner's 31 Game (Java)

A Java implementation of the "Prisoner's 31" strategy game, designed to simulate a card-less version of the classic game "31". This project focuses on **Abstract Classes** and **Inheritance**.

## 🎮 Game Rules

* **The "Card" Mechanism:** Instead of drawing from a deck, two players simultaneously choose a number between 1 and 5. These numbers are summed to determine the value of the "drawn card".
* **Gameplay:** A player continues to "draw" until their total points reach at least 26.
* **Busting:** If a player exceeds 31 points, they "bust" and the opponent automatically wins the round.
* **Winning Criteria:** If no one busts, the player with the most points (up to 31) wins. In case of a tie, the player who played first in that round is declared the winner.
* **Match Structure:** Players compete in multiple rounds, alternating the starting position for each new round. The final winner is the one with the most round victories.

## 🛠️ Technical Structure

The project is built using a structured class hierarchy:

* **Player (Abstract):** The base class storing the player's name and win count. It contains the abstract method `selectNumber()` and the `play()` method that executes the drawing logic.
* **HumanPlayer:** Inherits from `Player` and prompts the user to input a valid number between 1 and 5.
* **ComputerPlayer:** Inherits from `Player` and automatically selects a random number between 1 and 5.
* **GameRounds:** Manages round execution, updates win counts, and handles the alternating turn order.
* **PrisonerGame:** The entry point (main class) where the user selects the game mode.

* ## 🚀 Key Features

* **Polymorphic Design:** Uses a common abstract base class to handle both human and AI players interchangeably.
* **Automated AI:** Features a `ComputerPlayer` that simulates gameplay by generating random strategic choices.
* **Input Validation:** Includes robust error handling for human input to ensure numbers remain within the 1-5 range.
* **Turn Management:** Automatically rotates the starting player each round to ensure fair competition.
* **Versatile Modes:** Supports Human vs. Computer or Computer vs. Computer simulation modes.

## 📋 Execution Instructions

Compile all `.java` files and run the `PrisonerGame` class:

```bash
javac *.java
java PrisonerGame
