import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.println("Each child gets " + chocolatesPerChild + " chocolates.");
        System.out.println("The number of remaining chocolates is " + remainingChocolates);

        scanner.close();
    }
}