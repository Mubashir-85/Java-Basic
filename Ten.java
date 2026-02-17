// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ten {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Your Name: ");
        // String name = sc.nextLine();

        // System.out.println("Enter Your Age: ");
        // int age = sc.nextInt();

        // System.out.println("Name: " + name + ", Age: " + age);

        // sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Enter Your Name:");
            String name = br.readLine();
            System.out.println("Enter Your Age:");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Name: " + name + ", Age: " + age);
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        }

    }
}
