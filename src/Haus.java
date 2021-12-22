public class Haus extends StartCodeMainWindowPP{

   public static int x = 300;       //koordinaten fuer haus
    public static int y = 300;

    public static int t = 50;       //koordinaten fuer baum
    public static int r = 50;

    public static int kircheX = 200;
    public static int kircheY = 50;

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
            x-20.0f,  0.0f,   y+0.0f, 	 // 1 position
            0.0f,  1.0f,  0.0f,          // 1 color
            x+20.0f,  0.0f,   y+0.0f, 	 // 2 position
            0.0f,  1.0f,  0.0f,          // 2 color
            x+20.0f, 40.0f, y+0.0f,      // 3 position
            0.0f,  1.0f,  0.0f,          // 3 color

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

            /*
            KIRCHE MODELL
             */
                                                 //boden
            kircheX-40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,

            kircheX-40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
                                                //wand1
            kircheX-40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,

            kircheX-40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
            kircheX-40.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
                                                //wand2 (kleinere wand)
            kircheX-10.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,

            kircheX-10.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
                                                //wand3
            kircheX-40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,

            kircheX-40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,
            kircheX-40.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,
                                                //wand4 (kleinere wand)
            kircheX-10.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,

            kircheX-10.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
                                                //wand5
            kircheX-40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-40.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,

            kircheX-40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-40.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
            kircheX-40.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,
                                               //wand6 (hohes dach)
            kircheX-40.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
            kircheX-10.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
            kircheX-10.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,

            kircheX-40.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
            kircheX-10.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,
            kircheX-40.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,
                                              //wand7
            kircheX-10.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,

            kircheX-10.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 60.0f, kircheY+20.0f,
            1.0f,1.0f,1.0f,
            kircheX-10.0f, 60.0f, kircheY-20.0f,
            1.0f,1.0f,1.0f,
                                              //wand8 (niedriges dach)
            kircheX-10.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,

            kircheX-10.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX-10.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
                                              //wand9
            kircheX+40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 0.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,

            kircheX+40.0f, 0.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY+20.0f,
            0.5f, 0.5f, 0.5f,
            kircheX+40.0f, 20.0f, kircheY-20.0f,
            0.5f, 0.5f, 0.5f,
                                            //Dach
            kircheX-50.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX+0.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX+0.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,

            kircheX-50.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX+0.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-50.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,
                                             //dach seite1
            kircheX-50.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX+0.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-25.0f, 80.0f, kircheY+0.0f,
            0.8f,  0.4f,  0.1f,
                                            //dach seite2
            kircheX+0.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX+0.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-25.0f, 80.0f, kircheY+0.0f,
            0.8f,  0.4f,  0.1f,
                                            //dach seite3
            kircheX+0.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-50.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-25.0f, 80.0f, kircheY+0.0f,
            0.8f,  0.4f,  0.1f,
                                              //dach seite4
            kircheX-50.0f, 60.0f, kircheY+30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-50.0f, 60.0f, kircheY-30.0f,
            0.8f,  0.6f,  0.3f,
            kircheX-25.0f, 80.0f, kircheY+0.0f,
            0.8f,  0.4f,  0.1f,
    };
}
