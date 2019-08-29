package surprisequiz;

public class Pyramid {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 12-i; j > 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
