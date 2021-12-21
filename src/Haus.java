public class Haus extends StartCodeMainWindowPP{

   public static int x = 300;       //koordinaten fuer haus
    public static int y = 300;

    public static int t = 50;       //koordinaten fuer baum
    public static int r = 50;

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
            0.0f,  0.15f,  0.15f, //spitze schwarz */

            /*
            MODELL VOM BAUM
             */
                                        //bottom
            t-20.0f, 0.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,
            t+20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 0.0f , r+20.0f,
            0.8f,  0.4f,  0.1f,
                                        //Side1
            t-20.0f, 0.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,
            t+20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t+20.0f, 60.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,

            t-20.0f, 0.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,
            t+20.0f, 60.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 60.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,
                                    //Side2
            t-20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 0.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 60.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,

            t-20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 60.0f, r-20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 60.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
                                    //Side3
            t+20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 60.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,

            t+20.0f, 0.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t-20.0f, 60.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
            t+20.0f, 60.0f, r+20.0f,
            0.8f,  0.4f,  0.1f,
                                    //Baumkrone - boden
            t-30.0f, 60.0f, r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+30.0f, 60.0f,r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+30.0f, 60.0f, r+30.0f,
            0.2f, 0.5f, 0.0f,

            t-30.0f, 60.0f, r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+30.0f, 60.0f,r+30.0f,
            0.2f, 0.5f, 0.0f,
            t-30.0f, 60.0f, r+30.0f,
            0.2f, 0.5f, 0.0f,
                                    //Baumkrone
            t-30.0f, 60.0f, r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+30.0f, 60.0f,r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+0.0f, 120.0f, r+0.0f,
            0.2f, 0.5f, 0.0f,

            t-30.0f, 60.0f, r+30.0f,
            0.2f, 0.5f, 0.0f,
            t-30.0f, 60.0f,r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+0.0f, 120.0f, r+0.0f,
            0.2f, 0.5f, 0.0f,

            t+30.0f, 60.0f, r+30.0f,
            0.2f, 0.5f, 0.0f,
            t-30.0f, 60.0f,r+30.0f,
            0.2f, 0.5f, 0.0f,
            t+0.0f, 120.0f, r+0.0f,
            0.2f, 0.5f, 0.0f,

            t+30.0f, 60.0f, r-30.0f,
            0.2f, 0.5f, 0.0f,
            t+30.0f, 60.0f,r+30.0f,
            0.2f, 0.5f, 0.0f,
            t+0.0f, 120.0f, r+0.0f,
            0.2f, 0.5f, 0.0f,
    };
}
