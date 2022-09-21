
/**
 * @author: MARK ANDREW DUZA
 * BSIT
 * STI - COLLEGE ORTIGAS-CAINTA 
 */

import java.util.*;

public class App {

    // useable Scanner within this class file
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int[] time = new int[10];

        Employee emp = new Employee(time.length);

        /*
         * for (int i = 0; i < time.length; i++) {
         * time[i] = i;
         * }
         * 
         * Employee emp = new Employee(time.length);
         * 
         * for (int i = 0; i < time.length; i++) {
         * emp.Insert(time[i]);
         * }
         * emp.displayElement();
         */

        System.out.println("\t\tPayroll...");

        System.out.print("Enter ID: ");
        String initID = sc.nextLine();

        while (!initID.matches("^[0-9]+$") || initID.length() != 5) {
            System.out.print("Invalid input! Try again: ");
            initID = sc.nextLine();
        }

        int userInputId = Integer.parseInt(initID);

        emp.setId(userInputId);

        System.out.print("Enter name: ");
        String userInputName = sc.nextLine();

        while (userInputName.isBlank()) {
            System.out.print("This field is cannot be empty! Try again: ");
            userInputName = sc.nextLine();
        }

        while (!userInputName.matches("^[a-zA-Z\s]+$")) {
            System.out.print("Invalid input! Try again: ");
            userInputName = sc.nextLine();
        }

        emp.setName(userInputName);

        System.out.print("Enter status: ");
        String initStat = sc.nextLine();

        while (!initStat.matches("^[0-9]+$") || initStat.length() > 2 || initStat.length() <= 0) {
            System.out.print("Invalid input! Try again: ");
            initStat = sc.nextLine();
        }

        int userInputStat = Integer.parseInt(initStat);

        emp.setStatus(userInputStat);

        // friendly line
        System.out.println("\n");

        System.out.println("Hours per Day");
        for (int i = 0; i < time.length; i++) {
            System.out.printf("Day %d: ", i + 1);
            String initTime = sc.nextLine();

            while (!initTime.matches("^[0-9]+$") || initTime.length() > 2 || initTime.length() <= 0) {
                System.out.print("Invalid input! Try again: ");
                initTime = sc.nextLine();
            }

            int userInputTime = Integer.parseInt(initTime);

            time[i] = userInputTime;

        }

        for (int i = 0; i < time.length; i++) {
            emp.Insert(time[i]);
        }

        // friendly line
        System.out.println("\n");

        emp.displayData();

        sc.close();
    }
}