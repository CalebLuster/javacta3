import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double userList[] = new double[5]; // Initialize the array with a length of 5

        int index = 0; // Initialize the index variable
        
        while(index < 5){
            System.out.println("Enter a number: ");
            userList[index] = scanner.nextDouble();
            index++;
        }
        

        System.out.println("Total is " + (userList[0] + userList[1] + userList[2] + userList[3] + userList[4]));
        System.out.println("Average is " + (userList[0] + userList[1] + userList[2] + userList[3] + userList[4]) / 5);
        System.out.println("Max is " + Math.max(userList[0], Math.max(userList[1], Math.max(userList[2], Math.max(userList[3], userList[4])))));
        System.out.println("Min is " + Math.min(userList[0], Math.min(userList[1], Math.min(userList[2], Math.min(userList[3], userList[4])))));
        System.out.println("Interest on total at 20% is " + (userList[0] + userList[1] + userList[2] + userList[3] + userList[4]) * 0.2);
        scanner.close();
    }
}