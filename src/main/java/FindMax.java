import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter size for number");
        int[] number;
        Scanner scanner = new Scanner(System.in);
        do {
        size = scanner.nextInt();
        if (size > 20){
            System.out.println("Size should not exceed 20");
        }
        }while (size > 20);
        number = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter number");
            number[i] = scanner.nextInt();
        }
        int max = number[0];
        for (int i=0;i<size;i++){
            if (max < number[i]){
                max = number[i];
            }
        }
        System.out.println("Max in array is "+ max );
    }
}
