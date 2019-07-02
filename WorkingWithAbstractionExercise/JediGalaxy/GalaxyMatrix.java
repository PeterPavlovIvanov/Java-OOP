package WorkingWithAbstractionExercise.JediGalaxy;

public class GalaxyMatrix {
    private int x;
    private int y;
    private int[][] matrix;

    public GalaxyMatrix(int x, int y) {
        this.x = x;
        this.y = y;
        this.matrix = new int[x][y];
        fillMatrix();
    }

    private void fillMatrix(){
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.matrix[i][j] = value++;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
