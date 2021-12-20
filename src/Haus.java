public class Haus extends StartCodeMainWindowPP{

   public static int x = 300;
    public static int y = 300;

    public static float[] verticies = {
                                        //Boden
            0.0f, 0.0f, 0.0f,
            0.6f,  1.0f,  0.5f,
            1000.0f, 0.0f, 0.0f,
            0.6f,  1.0f,  0.5f,
            1000.0f, 0.0f , 1000.0f,
            0.6f,  1.0f,  0.5f,

            0.0f, 0.0f, 0.0f,
            0.6f,  1.0f,  0.5f,
            1000f, 0.0f, 1000.0f,
            0.6f,  1.0f,  0.5f,
            0.0f,0.0f , 1000.0f,
            0.6f,  1.0f,  0.5f,

            //front
            x-20.0f,  0.0f,   y+0.0f, 	 // 0 position
            0.0f,  1.0f,  0.0f,  // 0 color
            x+20.0f,  0.0f,   y+0.0f, 	 // 1 position
            0.0f,  1.0f,  0.0f,  // 1 color
            x+20.0f, 40.0f, y+0.0f, //2 pos
            0.0f,  1.0f,  0.0f, //2 color

           x -20.0f, 0.0f, y+0.0f, //3pos
            1.0f,  0.0f,  0.0f, //3colors
           x +20.0f, 40.0f, y+0.0f, //4pos
            1.0f,  0.0f,  0.0f, //4colors
           x -20.0f, 40.0f, y+0.0f, //5pos
            1.0f,  0.0f,  0.0f, //5colors
            // Back
           x -20.0f,  0.0f,   y+40.0f, 	 // 0 position
            1.0f,  0.0f,  0.0f,  // 0 color
           x +20.0f,  0.0f,   y+40.0f, 	 // 1 position
            1.0f,  0.0f,  0.0f,  // 1 color
           x +20.0f, 40.0f, y+40.0f, //2 pos
            1.0f,  0.0f,  0.0f, //2 color

           x -20.0f, 0.0f, y+40.0f, //3pos
            1.0f,  0.0f,  0.0f, //3colors
           x +20.0f, +40.0f, y+40.0f, //4pos
            1.0f,  0.0f,  0.0f, //4colors
           x -20.0f, +40.0f, y+40.0f, //5pos
            1.0f,  0.0f,  0.0f, //5colors
            //top
           x -20.0f,  +40.0f,   y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
          x  +20.0f,  +40.0f,   y+0.0f, 	 // 1 position
            0.0f,  0.68f,  0.85f,  // 1 color
           x +20.0f, +40.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color

           x -20.0f,  +40.0f,   y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
           x +20.0f, +40.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color
            x-20.0f, +40.0f, y+40.0f, //5pos
            0.0f,  0.68f,  0.85f, //5colors
            //bottom
           x -20.0f,  +0.0f, y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
          x+ 20.0f,  +0.0f,   y+0.0f, 	 // 1 position
            0.0f,  0.68f,  0.85f,  // 1 color
           x +20.0f, 0.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color

           x -20.0f,  0.0f,   y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
           x +20.0f, 0.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color
            x-20.0f, 0.0f, y+40.0f, //5pos
            0.0f,  0.68f,  0.85f, //5colors
            //right
           x +20.0f,  0.0f, y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
           x +20.0f,  0.0f, y+40.0f, 	 // 1 position
            0.0f,  0.68f,  0.15f,  // 1 color
           x +20.0f, +40.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color

           x +20.0f,  0.0f, y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
           x +20.0f, +40.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color
           x +20.0f, +40.0f, y+0.0f, //5pos
            0.0f,  0.68f,  0.15f, //5color
            //left
           x -20.0f,  0.0f,   y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
           x -20.0f,  0.0f,   y+40.0f, 	 // 1 position
            0.0f,  0.68f,  0.15f,  // 1 color
           x -20.0f, +40.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color

            x-20.0f,  0.0f,   y+0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
           x -20.0f, +40.0f, y+40.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color
           x -20.0f, +40.0f, y+0.0f, //5pos
            0.0f,  0.68f,  0.15f, //5color


                                        //dach
           x-20.0f, +40.0f, y+0.0f,
            0.0f,  0.68f,  0.15f,
           x +20.0f, +40.0f, y+0.0f,
            0.0f,  0.68f,  0.15f,
           x +0.0f, +60.0f, y+20.0f,
            0.0f,  0.15f,  0.15f, //spitze schwarz

           x +20.0f, +40.0f, y+0.0f,
            0.0f,  0.68f,  0.15f,
           x +20.0f, +40.0f, y+40.0f,
            0.0f,  0.68f,  0.15f,
           x +0.0f, +60.0f, y+20.0f,
            0.0f,  0.15f,  0.15f, //spitze schwarz

            x+20.0f, +40.0f, y+40.0f,
            0.0f,  0.68f,  0.15f,
            x-20.0f, +40.0f, y+40.0f,
            0.0f,  0.68f,  0.15f,
            x+0.0f, +60.0f, y+20.0f,
            0.0f,  0.15f,  0.15f, //spitze schwarz

            x-20.0f, +40.0f, y+40.0f,
            0.0f,  0.68f,  0.15f,
            x-20.0f, +40.0f, y+0.0f,
            0.0f,  0.68f,  0.15f,
            x+0.0f, +60.0f, y+20.0f,
            0.0f,  0.15f,  0.15f //spitze schwarz */
    };
}
