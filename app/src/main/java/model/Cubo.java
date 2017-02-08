package model;

public class Cubo {
    private static Cubo instance = null;

    public static Cubo getInstance() {
        if (instance == null) {
            instance = new Cubo();
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
}
