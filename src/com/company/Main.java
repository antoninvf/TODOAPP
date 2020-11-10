package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String spacer = "-----------------------------------------------------";
        int currentTasks = 0;

        String[] stringTaskArray = new String[10];
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
            System.out.println(spacer + "\nYou can add up to 10 tasks!\n" + "You have " + currentTasks + "/10!\n" + spacer + "\n1) Manage tasks \n" + "2) View tasks\n" +"3) Exit");
            while (true) {
                int menuInput = sc.nextInt();
                if (menuInput == 1) {
                    System.out.println(spacer + "\nTasks management\n" + spacer + "\n1) Create a new task\n2) Update a task\n3) Destroy a task\n4) Back to main menu");
                    break;
                } else if (menuInput == 2) {
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
                    System.out.println(spacer + "\nYou can add up to 10 tasks!\n" + "You have " + currentTasks + "/10!\n" + spacer + "\n1) Manage tasks \n" + "2) View tasks\n" +"3) Exit");
                } else if (menuInput == 3) {
                    System.exit(0);
                } else {
                    System.out.println("Incorrect input");
                }
            }

            while (true) {
                String secondMenuInput = sc.nextLine();
                if (secondMenuInput.equals("1")) {
                    System.out.println("Enter name of the new task:");
                    stringTaskArray[currentTasks] = sc.nextLine();
                    currentTasks++;
                    break;
                } else if (secondMenuInput.equals("2")) {
                    System.out.println("Which task do you want to change:");
                    int inputTaskChange = sc.nextInt();
                    System.out.println("Enter name of the new task:");
                    stringTaskArray[inputTaskChange] = sc.nextLine();
                    break;
                } else if (secondMenuInput.equals("3")) {
                    System.out.println("Which task do you want to destroy:");
                    int inputTaskDestroy = sc.nextInt();
                    stringTaskArray[inputTaskDestroy] = "";
                    currentTasks--;
                    break;
                } else if (secondMenuInput.equals("4")) {
                    break;
                }
            }
        }
    }
}
