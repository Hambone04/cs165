import java.util.Scanner;
public class DescendingOrder {
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
   
      //finds the largest number in the list, and holds its index
      for (int i = 0; i < numElements - 1; i++) {
         int maxIndex = i;
         for (int j = numElements - 1; j > i ; j--) {
            if (numbers[j] > numbers[maxIndex]) {
               maxIndex = j;
            }
         }

         //swaps the current index [i] and the largest number [maxIndex]
         int temp = numbers[i];
         numbers[i] = numbers[maxIndex];
         numbers[maxIndex] = temp;

         //prints the array and a newline after each outer for loop completion
         for (int k = 0; k < numElements; k++) {
            System.out.print(numbers[k] + " ");
         }
         System.out.println("");
      }
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      input = scnr.nextInt();
      for (i = 0; i <= 10; i++) {
         if (input != -1) {
            numbers[i] = input;
            numElements += 1;
            input = scnr.nextInt();
         }
         else {
            selectionSortDescendTrace(numbers, numElements);
            scnr.close();
            break;
         }
      }
   }
}
