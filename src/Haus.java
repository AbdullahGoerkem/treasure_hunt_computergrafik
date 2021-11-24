public class Haus {
    public static float[] verticies = {                                   //front
            -0.5f,  -0.5f,   0.0f, 	 // 0 position
            1.0f,  0.0f,  0.0f,  // 0 color
            0.5f,  -0.5f,   0.0f, 	 // 1 position
            1.0f,  0.0f,  0.0f,  // 1 color
            0.5f, 0.5f, 0.0f, //2 pos
            1.0f,  0.0f,  0.0f, //2 color

            -0.5f, -0.5f, 0.0f, //3pos
            1.0f,  0.0f,  0.0f, //3colors
            0.5f, 0.5f, 0.0f, //4pos
            1.0f,  0.0f,  0.0f, //4colors
            -0.5f, 0.5f, 0.0f, //5pos
            1.0f,  0.0f,  0.0f, //5colors
            //back
            -0.5f,  -0.5f,   1.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
            0.5f,  -0.5f,   1.0f, 	 // 1 position
            0.0f,  0.68f,  0.85f,  // 1 color
            0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color

            -0.5f, -0.5f, 1.0f, //3pos
            0.0f,  0.68f,  0.85f, //3colors
            0.5f, 0.5f, 1.0f, //4pos
            0.0f,  0.68f,  0.85f, //4colors
            -0.5f, 0.5f, 1.0f, //5pos
            0.0f,  0.68f,  0.85f, //5colors
            //top
            -0.5f,  0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
            0.5f,  0.5f,   0.0f, 	 // 1 position
            0.0f,  0.68f,  0.85f,  // 1 color
            0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color

            -0.5f,  0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
            0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color
            -0.5f, 0.5f, 1.0f, //5pos
            0.0f,  0.68f,  0.85f, //5colors
            //bottom
            -0.5f,  -0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
            0.5f,  -0.5f,   0.0f, 	 // 1 position
            0.0f,  0.68f,  0.85f,  // 1 color
            0.5f, -0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color

            -0.5f,  -0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.85f,  // 0 color
            0.5f, -0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.85f, //2 color
            -0.5f, -0.5f, 1.0f, //5pos
            0.0f,  0.68f,  0.85f, //5colors
            //right
            0.5f,  -0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
            0.5f,  -0.5f,   1.0f, 	 // 1 position
            0.0f,  0.68f,  0.15f,  // 1 color
            0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color

            0.5f,  -0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
            0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color
            0.5f, 0.5f, 0.0f, //5pos
            0.0f,  0.68f,  0.15f, //5color
            //left
            -0.5f,  -0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
            -0.5f,  -0.5f,   1.0f, 	 // 1 position
            0.0f,  0.68f,  0.15f,  // 1 color
            -0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color

            -0.5f,  -0.5f,   0.0f, 	 // 0 position
            0.0f,  0.68f,  0.15f,  // 0 color
            -0.5f, 0.5f, 1.0f, //2 pos
            0.0f,  0.68f,  0.15f, //2 color
            -0.5f, 0.5f, 0.0f, //5pos
            0.0f,  0.68f,  0.15f, //5color


                                        //dach
            -0.5f, 0.5f, 0.0f,
            0.0f,  0.68f,  0.15f,
            0.5f, 0.5f, 0.0f,
            0.0f,  0.68f,  0.15f,
            0.0f, 1.0f, 0.5f,
            0.0f,  0.15f,  0.15f, //spitze schwarz

            0.5f, 0.5f, 0.0f,
            0.0f,  0.68f,  0.15f,
            0.5f, 0.5f, 1.0f,
            0.0f,  0.68f,  0.15f,
            0.0f, 1.0f, 0.5f,
            0.0f,  0.15f,  0.15f, //spitze schwarz

            0.5f, 0.5f, 1.0f,
            0.0f,  0.68f,  0.15f,
            -0.5f, 0.5f, 1.0f,
            0.0f,  0.68f,  0.15f,
            0.0f, 1.0f, 0.5f,
            0.0f,  0.15f,  0.15f, //spitze schwarz

            -0.5f, 0.5f, 1.0f,
            0.0f,  0.68f,  0.15f,
            -0.5f, 0.5f, 0.0f,
            0.0f,  0.68f,  0.15f,
            0.0f, 1.0f, 0.5f,
            0.0f,  0.15f,  0.15f //spitze schwarz
    };
}
