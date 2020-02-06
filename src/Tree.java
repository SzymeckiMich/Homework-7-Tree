import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrawingTree draw = new DrawingTree();
        System.out.println("Podaj ilość poziomów choinki, mieszczącą się w przedziale [1,20]");
        int levels = scanner.nextInt();
        scanner.nextLine();
        boolean flag = true;
        if (levels >= 5 && levels <= 20) {
            flag = false;
        }

        while (flag) {
            System.out.println("Podaj inną wartość");
            levels = scanner.nextInt();
            scanner.nextLine();
            if (levels >= 5 && levels <= 20) {
                flag = false;
            } else if (levels > 20) {
                System.out.println("Za duża wartość");
            } else {
                System.out.println("Za mała wartość");
            }
        }
        draw.drawingTree(levels);

    }
}

