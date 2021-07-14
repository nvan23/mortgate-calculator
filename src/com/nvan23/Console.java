package com.nvan23;

import java.util.Scanner;

public class Console {
  public static Scanner scanner = new Scanner(System.in);

  public static double readNumber(String prompt) {
    return scanner.nextDouble();
  }

  public static double readNUmber(
          String prompt,
          double min,
          double max
  ) {
    Scanner scanner = new Scanner(System.in);
    double values;
    while (true) {
      System.out.print(prompt);
      values = scanner.nextDouble();
      if (values >= min && values <= max)
        break;

      System.out.println("Enter a number between " + min + " and " + max + "\n");
    }
    return values;
  }
}
