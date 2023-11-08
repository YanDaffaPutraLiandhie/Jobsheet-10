import java.util.Scanner;

public class NestedLoop__2341720142 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[][] = new double[5][7];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                array[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        double total = 0;
        int  count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
                total += array[i][j];
                count++;
            }
            System.out.println();
        }
        double ratarata = total/count;
        System.out.println("Rata Rata suhu =" + ratarata); 
    }
}
