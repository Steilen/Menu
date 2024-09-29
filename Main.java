import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int[] numbers = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 integers into the array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print("Number " + (i+1) + " = ");
            numbers[i] = scanner.nextInt();
        }

        int choice;
        do{
            System.out.println("\n-Menu-");
            System.out.println("1. Print array");
            System.out.println("2. Find maximum value");
            System.out.println("3. Calculate sum of elements");
            System.out.println("4. Count even and odd numbers");
            System.out.println("5. Reverse array");
            System.out.println("6. Find minimum value");
            System.out.println("7. Multiply all elements");
            System.out.println("0. Exit");
            System.out.print("Choose an action: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Array output:");
                    printArray(numbers);
                    break;

                case 2:
                    int max = findMax(numbers);
                    System.out.println("Maximum value = " + max);
                    break;

                case 3:
                    int sum = calcSum(numbers);
                    System.out.println("Sum of elements = " + sum);
                    break;

                case 4:
                    int evenAmount = countEven(numbers);
                    int oddAmount = numbers.length - evenAmount;
                    System.out.println("Number of even numbers: " + evenAmount);
                    System.out.println("Number of odd numbers: " + oddAmount);
                    break;

                case 5:
                    reverseArray(numbers);
                    System.out.println("Array after reversal:");
                    printArray(numbers);
                    break;

                case 6:
                    int min = findMin(numbers);
                    System.out.println("Minimum value = " + min);
                    break;

                case 7:
                    int product = calcProduct(numbers);
                    System.out.println("Product of elements = " + product);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while(choice != 0);
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] array){
        int max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int calcSum(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    public static int countEven(int[] array){
        int counter = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static void reverseArray(int[] array){
        int n = array.length;
        for(int i=0;i<n/2;i++){
            int tmp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = tmp;
        }
    }

    public static int findMin(int[] array){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int calcProduct(int[] array){
        int product = 1;
        for(int i=0;i<array.length;i++){
            product *= array[i];
        }
        return product;
    }
}
