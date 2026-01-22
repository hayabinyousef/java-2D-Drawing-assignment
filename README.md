# java-2D-Drawing-assignment
This repository contains a Java Swing application that renders a complex
vector-style illustration using `Graphics2D`, `Path2D`, and `AffineTransform`.
## Project Context
This project was completed as part of Computer Graphics and Multimedia course’s assignment .
It is shared for academic reference only.

## Overview
The application uses Java’s 2D graphics API to manually construct and render
a detailed illustration through a sequence of vector paths and transformations.

## Technologies Used
- Java
- Swing (`JFrame`, `JPanel`)
- AWT (`Graphics2D`, `Color`)
- `Path2D` and `AffineTransform`

## How It Works
- The drawing is defined using multiple `Path2D` shapes
- Transformations are applied to scale and position the artwork
- Colors are manually assigned for different parts of the illustration
- Rendering adapts to the window size

```bash
javac Dora.java
java Dora
