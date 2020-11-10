package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String spacer = "-----------------------------------------------------";
        int currentTasks = 0;

        String[] stringTaskArray = new String[10];

        System.out.println(" _______ ____  _____   ____                         \n" +
                "|__   __/ __ \\|  __ \\ / __ \\      /\\                \n" +
                "   | | | |  | | |  | | |  | |    /  \\   _ __  _ __  \n" +
                "   | | | |  | | |  | | |  | |   / /\\ \\ | '_ \\| '_ \\ \n" +
                "   | | | |__| | |__| | |__| |  / ____ \\| |_) | |_) |\n" +
                "   |_|  \\____/|_____/ \\____/  /_/    \\_\\ .__/| .__/ \n" +
                "                                       | |   | |    \n" +
                "                                       |_|   |_|    ");
        while (true) {
            System.out.println(spacer + "\nYou can add up to 10 tasks!\n" + "You have " + currentTasks + "/10!\n" + spacer + "\n1) Manage tasks \n" + "2) Exit");
            while (true) {
                int menuInput = sc.nextInt();
                if (menuInput == 1) {
                    System.out.println(spacer + "\nTasks management\n" + spacer + "\n1) Create a new task\n2) Update a task\n3) Destroy a task\n4) Back to main menu");
                    break;
                } else if (menuInput == 2) {
                    System.exit(0);
                } else {
                    System.out.println("Incorrect input");
                }
            }

            while (true) {
                int secondMenuInput = sc.nextInt();
                if (secondMenuInput == 1) {
                    System.out.println("Enter name of the new task:");
                    stringTaskArray[1+currentTasks]= sc.next();
                    currentTasks++;
                } else if (secondMenuInput == 2) {
                    System.out.println("What task do you want to change:");
                    int inputTaskChange = sc.nextInt();
                    System.out.println("Enter name of the new task:");
                    stringTaskArray[inputTaskChange] = sc.next();
                } else if (secondMenuInput == 3) {
                    System.out.println("What task do you want to destroy:");
                    int inputTaskDestroy = sc.nextInt();
                    stringTaskArray[inputTaskDestroy] = "";
                    currentTasks--;
                } else if (secondMenuInput == 4) {
                    break;
                } else {
                    System.out.println("Incorrect input");
                }
            }
        }
    }
}
