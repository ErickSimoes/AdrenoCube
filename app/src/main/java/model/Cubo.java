package model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Cubo {
    private static Cubo instance = null;

    private Cubo() {
        mCubePositions = ByteBuffer.allocateDirect(cubePositionData.length * mBytesPerFloat).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mCubePositions.put(cubePositionData).position(0);
    }

    public static Cubo getInstance() {
        if (instance == null) {
            instance = new Cubo ();
        }
        return instance;
    }



    final float[] cubePositionData={
            // Face frontal
            -1.0f, 1.0f, 1.0f,-1.0f, -1.0f, 1.0f,1.0f, 1.0f, 1.0f,-1.0f, -1.0f, 1.0f,1.0f, -1.0f, 1.0f,1.0f, 1.0f, 1.0f,
            // Face direita
            1.0f, 1.0f, 1.0f,1.0f, -1.0f, 1.0f,1.0f, 1.0f, -1.0f,1.0f, -1.0f, 1.0f,1.0f, -1.0f, -1.0f,1.0f, 1.0f, -1.0f,
            // Face traseira
            1.0f, 1.0f, -1.0f,1.0f, -1.0f, -1.0f,-1.0f, 1.0f, -1.0f,1.0f, -1.0f, -1.0f,-1.0f, -1.0f, -1.0f,-1.0f, 1.0f, -1.0f,
            // Face esquerda
            -1.0f, 1.0f, -1.0f,-1.0f, -1.0f, -1.0f,-1.0f, 1.0f, 1.0f,-1.0f, -1.0f, -1.0f,-1.0f, -1.0f, 1.0f,-1.0f, 1.0f, 1.0f,
            // Face superior
            -1.0f, 1.0f, -1.0f,-1.0f, 1.0f, 1.0f,1.0f, 1.0f, -1.0f,-1.0f, 1.0f, 1.0f,1.0f, 1.0f, 1.0f,1.0f, 1.0f, -1.0f,
            // Face inferior
            1.0f, -1.0f, -1.0f,1.0f, -1.0f, 1.0f,-1.0f, -1.0f, -1.0f,1.0f, -1.0f, 1.0f,-1.0f, -1.0f, 1.0f,-1.0f, -1.0f, -1.0f,
    };

    private final String pointVertexShader =
            "uniformmat4 u_MVPMatrix;           \n" +
                    "attributevec4 a_Position;  \n"+
                    "voidmain()                 \n"+
                    "{                          \n"+
                    " gl_Position= u_MVPMatrix  \n"+
                    " * a_Position;             \n"+
                    " gl_PointSize= 5.0;        \n"+
                    "}                          \n";

    private final String pointFragmentShader =
            "precisionmediumpfloat;                 \n"
                    + "voidmain()                   \n"
                    + "{                            \n"
                    + " gl_FragColor= " +
                    "vec4(0.0f, 0.55f, 0.0f, 1.0); \n"
                    + "}                            \n";

    private final int mBytesPerFloat= 4;
    private FloatBuffer mCubePositions;

}
