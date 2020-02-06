public class DrawingTree {
    public void drawingTree(int levels) {
        for (int level = 0; level < levels; level++) {
            for (int i = 0; i < levels - level; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 1 + (2 * level); i++) {
                System.out.print("0");
            }
            System.out.println("");

        }
    }
}
