package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String spacer = "-----------------------------------------------------";
        int currentTasks = 0;
        String[] stringTaskArray = new String[10];

        // Replaced all of these with nothing so it won't say null if there is nothing written to them.
        stringTaskArray[0] = "";
        stringTaskArray[1] = "";
        stringTaskArray[2] = "";
        stringTaskArray[3] = "";
        stringTaskArray[4] = "";
        stringTaskArray[5] = "";
        stringTaskArray[6] = "";
        stringTaskArray[7] = "";
        stringTaskArray[8] = "";
        stringTaskArray[9] = "";

        System.out.println(" _______ ____  _____   ____                         \n" +
                "|__   __/ __ \\|  __ \\ / __ \\      /\\                \n" +
                "   | | | |  | | |  | | |  | |    /  \\   _ __  _ __  \n" +
                "   | | | |  | | |  | | |  | |   / /\\ \\ | '_ \\| '_ \\ \n" +
                "   | | | |__| | |__| | |__| |  / ____ \\| |_) | |_) |\n" +
                "   |_|  \\____/|_____/ \\____/  /_/    \\_\\ .__/| .__/ \n" +
                "                                       | |   | |    \n" +
                "                                       |_|   |_|    ");
        while (true) {
            System.out.println(spacer + "\nYou can add up to 10 tasks!\n" + "You have " + currentTasks + "/10!\n" + spacer + "\n1) Manage tasks \n" + "2) View tasks\n" + "3) Exit");
            while (true) {
                int menuInput = sc.nextInt(); //User input in the main menu

                if (menuInput == 1) { //1 - Manage tasks
                    System.out.println(spacer + "\nTasks management\n" + spacer + "\n1) Create a new task\n2) Update a task\n3) Destroy a task\n4) Back to main menu");
                    break; // Breaks the while loop and goes to the other while loop.
                } else if (menuInput == 2) { //2 - View tasks
                    System.out.println(spacer);
                    System.out.println("#0 - " + stringTaskArray[0]);
                    System.out.println("#1 - " + stringTaskArray[1]);
                    System.out.println("#2 - " + stringTaskArray[2]);
                    System.out.println("#3 - " + stringTaskArray[3]);
                    System.out.println("#4 - " + stringTaskArray[4]);
                    System.out.println("#5 - " + stringTaskArray[5]);
                    System.out.println("#6 - " + stringTaskArray[6]);
                    System.out.println("#7 - " + stringTaskArray[7]);
                    System.out.println("#8 - " + stringTaskArray[8]);
                    System.out.println("#9 - " + stringTaskArray[9]);
                    System.out.println(spacer + "\nYou can add up to 10 tasks!\n" + "You have " + currentTasks + "/10!\n" + spacer + "\n1) Manage tasks \n" + "2) View tasks\n" + "3) Exit");
                } else if (menuInput == 3) { //3 - Exit
                    System.exit(0); //Exits the program.
                } else {
                    System.out.println("Incorrect input"); //If there is a number like 4 or 5, it will say Incorrect input, but will crash if a word/letter is put in.
                }
            }

            while (true) {
                String secondMenuInput = sc.nextLine();
                if (secondMenuInput.equals("1")) { //1 - New task
                    if (currentTasks < 10) {
                        System.out.println("Enter name of the new task:");
                        stringTaskArray[currentTasks] = sc.nextLine();
                        currentTasks++;
                    } else {
                        System.out.println("There are no more available tasks, use 'Update a task' instead");
                    }
                    break; // Breaks the while loop and goes to the other while loop.
                } else if (secondMenuInput.equals("2")) { //2 - Modify tasks
                    if (currentTasks > 0) {
                        System.out.println("Which task do you want to change:");
                        String inputTaskChange = sc.nextLine();
                        if (Integer.parseInt(inputTaskChange) < 10) {
                            System.out.println("Enter name of the new task:");
                            stringTaskArray[Integer.parseInt(inputTaskChange)] = sc.nextLine();
                        } else {
                            System.out.println("Incorrect input");
                        }
                    } else {
                        System.out.println("There is nothing to change");
                    }
                    break; // Breaks the while loop and goes to the other while loop.
                } else if (secondMenuInput.equals("3")) { //3 - Destroy tasks
                    System.out.println("Which task do you want to destroy:");
                    int inputTaskDestroy = sc.nextInt();
                    if (inputTaskDestroy < 10) {
                        if (currentTasks > 0) {
                            stringTaskArray[inputTaskDestroy] = "";
                            currentTasks--;
                        } else {
                            System.out.println("Current Tasks number would go below zero.");
                        }
                    } else {
                        System.out.println("Incorrect input");
                    }
                    break; // Breaks the while loop and goes to the other while loop.
                } else if (secondMenuInput.equals("4")) { //4 - Back to main menu
                    break; // Breaks the while loop and goes to the other while loop.
                }
            }
        }
    }
}
