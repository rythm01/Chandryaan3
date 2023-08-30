# Chandryaan3

Chandryaan3 is a Java program that simulates the movement of a spacecraft on a three-dimensional grid. The program provides methods to control the movement and direction of the vehicle.

## Features

- Move the vehicle forward and backward in its current direction.
- Turn the vehicle left or right in its horizontal plane.
- Change the vehicle's orientation to face upward or downward.
- Perform a series of commands to control the vehicle's movement.

## Usage

1. **Setup Initial Configuration:**

   In the `Chandryaan3` class constructor, provide the initial direction and coordinates for the vehicle. The available directions are "N" (North), "S" (South), "E" (East), "W" (West), "Up" (Upward), and "Down" (Downward).

2. **Movement Commands:**

   Use the following commands to control the vehicle's movement:

   - `'f'`: Move forward
   - `'b'`: Move backward
   - `'r'`: Turn right
   - `'l'`: Turn left
   - `'u'`: Turn upward
   - `'d'`: Turn downward

3. **Handling Commands:**

   To handle a series of commands, use the `handleMove(char[] commands)` method. Pass an array of commands to simulate the vehicle's movement.

4. **Example:**

   ```java
   // Create a Chandryaan3 instance with initial direction "N" and coordinates [0, 0, 0]
   Chandryaan3 chandryaan = new Chandryaan3("N", new int[]{0, 0, 0});

   // Define commands
   char[] commands = {'f', 'r', 'u', 'b', 'l'};

   // Simulate movement based on commands
   chandryaan.handleMove(commands);

   // Print final direction and coordinates
   System.out.println("Final direction: " + chandryaan.dir);
   System.out.println("Final coordinates: " + java.util.Arrays.toString(chandryaan.coordinates));

4. **Output:**
   
   ![image](https://github.com/rythm01/Chandryaan3/assets/115993280/7773fdf5-a213-4f06-8d78-26685464b0a2)
