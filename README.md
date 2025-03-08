# Duck Simulation Program

## Overview
This Java program demonstrates the Strategy Design Pattern using different types of ducks that exhibit varied flying, quacking, and swimming behaviors.

## Project Structure
The project consists of the following classes:

### 1. **Behavior Interfaces and Implementations**
#### **Flying Behavior**
- **`FlyBehaviour.java`** - Interface defining the `fly()` method.
- **`CanFly.java`** - Implements `FlyBehaviour`, providing flying behavior.
- **`CannotFly.java`** - Implements `FlyBehaviour`, providing non-flying behavior.

#### **Quacking Behavior**
- **`QuackBehaviour.java`** - Interface defining the `quack()` method.
- **`Quack.java`** - Implements `QuackBehaviour`, defining a normal quack.
- **`Squeak.java`** - Implements `QuackBehaviour`, defining a squeaking sound.

#### **Swimming Behavior**
- **`SwimBehaviour.java`** - Interface defining the `swim()` method.
- **`SwimWithLegs.java`** - Implements `SwimBehaviour` for normal swimming.
- **`Floating.java`** - Implements `SwimBehaviour` for floating.

### 2. **Duck Superclass and Concrete Duck Types**
- **`Duck.java`** - Abstract class that serves as a blueprint for all ducks. Each duck has:
  - `QuackBehaviour`
  - `FlyBehaviour`
  - `SwimBehaviour`
  - Methods to set behaviors dynamically.
  - `performQuack()`, `performSwim()`, and `performFly()` methods to delegate behavior to respective strategy objects.

- **Duck Subclasses:**
  - **`MallardDuck.java`** - A Mallard duck that quacks, swims, and can fly.
  - **`RedHeadDuck.java`** - A Redhead duck that quacks, swims, and can fly.
  - **`RubberDuck.java`** - A Rubber duck that squeaks, floats, and cannot fly.
  - **`DecoyDuck.java`** - A Decoy duck that quacks, swims, but cannot fly.

### 3. **Main Execution Class**
- **`Main.java`** - The main driver class that creates different duck objects and demonstrates their behaviors.
