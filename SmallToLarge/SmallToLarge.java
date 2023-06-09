
import java.util.Scanner;
public class SmallToLarge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temporary;
        int [] array = new int[10];
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Array " + (i+1) + ". enter the eleman: ");
            array[i] = scan.nextInt();
        }
        System.out.println("Array in order from smallest to largest:\n");
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++)
            {
                if(array[j] < array[i]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println("The array " + (i+1) + ". elemant : " + array[i]);
        }
    }
}