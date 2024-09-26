# Lawn mower exercise with TDD
A simple app managing moving robotic lawnmowers

## The exercise
A company has decided to develop an automatic lawnmower for rectangular surfaces.

The mower can be programmed to cover the entire surface.
The position of the mower is represented by a combination of coordinates (x,y) and a letter indicating orientation in English cardinal notation (N,E,W,S). The lawn is divided into grids to simplify navigation.

For example, the mower's position could be “0, 0, N”, meaning it's in the lower left corner of the lawn, facing north.

To control the mower, we send it a simple sequence of letters. Possible letters are “D”, “G” and “A”. “D” and ‘G’ rotate the mower 90° to the right or left respectively, without moving it. “A” moves the mower forward one square in the direction it faces, without changing its orientation.

If the position after movement is outside the lawn, the mower does not move, retains its orientation and processes the next command.

The square directly north of position (x, y) is assumed to have coordinates (x, y+1).

To program the mower, we provide it with an input file constructed as follows:
- The first line corresponds to the coordinates of the top right-hand corner of the lawn, while those of the bottom left-hand corner are assumed to be (0,0).
- The rest of the file is used to control all the mowers that have been deployed. Each mower has two lines:
- the first line gives the initial position of the mower, as well as its orientation. Position and orientation are given in the form of 2 numbers and a letter, separated by a space.
- the second line is a series of instructions instructing the mower to explore the lawn. The instructions are a sequence of characters without spaces.

Each mower moves sequentially, meaning that the second mower moves only when the first has completed its series of instructions.

When a mower completes a series of instructions, it communicates its position and orientation.

## Objective
Design and write a program running on a JVM ≥ 1.7 or a node.js server, implementing the above specification and passing the following test

## Test
The following file is provided as input:
5 5
1 2 N
LALALALAA
3 3 E
AARAARARRA

The following result is expected (final position of the shears):
1 3 N
5 1 E

NB: Input data can be injected in a form other than a file (e.g. an automated test).
