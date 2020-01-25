# 2D Game project
The task is to implement a simple 2D game platform game (something like Super Mario).

The project contains a few basic classes to set you up and running quickly. Please review them before starting.

## Tasks

### Background
Draw a background behind the hero. Use one of the appropriate textures from `resources` (e.g. `winter/BG/BG.png`).

### Gravity
Implement a gravity. That means, the everlasting force that pulls hero downward. Hero should start falling slowly and
his speed should increase gradually until he disappears from the screen.

### Ground
The hero should stop on the ground. Render some tiles to represent the earth.

### Moving  
Implement left and right movement of the hero by pressing left/right arrow keys. Use
`scene.setOnKeyPressed()`/`scene.setOnKeyReleased()` methods in `Game` class. 

### Jumping
Hero can now jump by pressing `space` key.

### Exit
Render an item (e.g. door) which will represent an exit from the game. If hero passes through it, the
application will end.

### Key
Hero now needs to pick a key before being able to exit.

### Monsters
Monsters now roam the world. They can be killed by being jumped on.

### Main Menu
Implement a main menu which will launch before the game.

### Levels
Create more levels which can be picked from the main menu.

### Mouse Support
User can pick levels from main menu by mouse clicking.

### Map Editor
Leverage https://www.mapeditor.org for level editing.

### Simple Physics
Implement a simple physics by using bounding boxes of game objects. E.g. tiles that cannot be passed. 

## Caveats
On Linux the project might stagger due to a high memory consumption which can be solved by passing `-Dprism.order=sw`
argument.