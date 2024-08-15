# 🧭 Maze Pathfinder: Unveil the Hidden Routes!

Ever wondered how to navigate a maze when some paths are blocked? This Java program takes on the challenge, exploring every possible way to traverse a grid-like maze from start to finish—without hitting any walls! 🏃‍♂️💨

## 🚀 The Challenge

You're given a maze in the form of a 2D boolean array:
- `true` means "Come on in! The path is open!"
- `false` means "Whoa there! This route is blocked!"

Your mission: Find all the routes from the top-left corner (starting point) to the bottom-right corner (destination) without crashing into any blocked paths.

## 🔍 How It Works

The `Restriction` function is your guide through the maze. It uses recursion to explore all possible paths:
- **`D`** ➡️ Move Down
- **`H`** ➡️ Move Right

The function prints out every valid path it discovers. Think of it as mapping out the safest routes for an adventurous explorer!

### 🧩 Example Maze

Given the maze below:

```java
boolean[][] maze = {
    {true, true, true},
    {true, false, true},
    {true, true, true}
};
