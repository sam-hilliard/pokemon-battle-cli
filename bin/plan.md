# Plan for Pokemon Battle CLI

This is the basic plan for my code and how I plan on organizing classes.

## Description

The user will run this java application via a terminal of their choice. All information and interaction will be made exclusively through a text-based interface.

### General Process

1. Run application.
2. Prompted a title screen. Includes basic information.
3. Option for an info screen or to jump into game.
4. Enter your trainer name.
5. Choose your opponent with varying levels of difficulty.
6. Choose your team of pokemon.
7. Enter battle.
8. Play until you defeat all of the opponent's pokemon or opponent cleans you out.
9. Prompted victory or defeat.
10. Option to start the entire process over again.

### Special features

- Lottery style item pickup
  - occurs randomly (maybe every 5 or 6 rounds)
  - items can include:
    - berries
    - potions
    - revives
    - pokemon level up (1+, 2+, 5+...)??
    - add new pokemon to team

## Structure

Definitions for organization of files and classes.

## Files

- Main.java
  - all objects created, run, and tested here
  - user input recieved here and output printed
- Game.java
  - game loop, text displayed, and main control flow
- Pokemon.java
  - creates a pokemon based on stats entered by a json file
- Trainer.java
  - will be parent class for player and cpu
- Player.java
  - class for the user
- Cpu.java
  - class for player's opponent

## Classes

### Pokemon

- Instance variables
  - String name
  - String[] type
  - String[] weaknesses
  - Map<String, Object>[] moves
  - Map<String, Integer> stats
    - hp, attack, defense, special attack, special defense, speed
  - Boolean isFainted
- Methods
  - setters/getters
  - int attack()
  - void recieveDamage(int health)
  - void restoreHP(int health)

### Trainer

- Instance variables
  - String name
  - Pokemon[] pokemon
  - Pokemon currentPokemon
  - Item[] items
- Methods
  - setters/getters
  - useItem
  - choosePokemon(Pokemon pokemon)
  