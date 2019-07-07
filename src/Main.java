/*
 * File: Main.java
 * Author: Bacchus Jackson
 * Date: July 7, 2019
 * Purpose: Week 7 Assignment
 * A program that takes states as user input and displays the state bird and flower
 * When the user types none, the program should print a summary of all queried states
 */

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String inputString;
    Boolean running = true;
    Scanner userInput = new Scanner(System.in);
    FactFinder factFinder = new FactFinder();

    System.out.println(startupMessage);

    while(running) {

      System.out.print("Enter State or None to Exit: ");
      inputString = userInput.nextLine();

      if(inputString.equalsIgnoreCase("none")) {

        running = false;

      } else if(inputString.equalsIgnoreCase("all")) {

        System.out.println(factFinder.getAllStatesInfo());

      } else {

        System.out.println(factFinder.getStateInfo(inputString));
      }
    }

    System.out.println("                  ***************** Summary of Report ******************");
    System.out.println(factFinder.getQueryLog());
  }

  private static String startupMessage = " __          __  _                            _           _____ _        _         ______         _     ______ _           _           _ \n" +
          " \\ \\        / / | |                          | |         / ____| |      | |       |  ____|       | |   |  ____(_)         | |         | |\n" +
          "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   | (___ | |_ __ _| |_ ___  | |__ __ _  ___| |_  | |__   _ _ __   __| | ___ _ __| |\n" +
          "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\   \\___ \\| __/ _` | __/ _ \\ |  __/ _` |/ __| __| |  __| | | '_ \\ / _` |/ _ \\ '__| |\n" +
          "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  ____) | || (_| | ||  __/ | | | (_| | (__| |_  | |    | | | | | (_| |  __/ |  |_|\n" +
          "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_____/ \\__\\__,_|\\__\\___| |_|  \\__,_|\\___|\\__| |_|    |_|_| |_|\\__,_|\\___|_|  (_)\n" +
          "                                                                                                                                         \n" +
          "                                                                                                                                         \n" +
          "" +
          "-- Enter any state to see its bird and flower \n" +
          "-- Enter 'all' to see every state \n" +
          "-- Enter 'none' to exit \n";
}