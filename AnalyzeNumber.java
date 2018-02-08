/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzenumber;

import java.util.Scanner;

public class AnalyzeNumber {

    public static void main(String[] args) {
// 1 - ask for how many numbers to input
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = getNumbers(n);
        double average = calculateAverage(n, numbers);
        double count = countAboveAverage(average, n, numbers);
        System.out.println ("Average: " + average);
        System.out.println ("Number of elements above the average is " + count);
    }
// 2 - ask for the numbers
    public static double[] getNumbers(int n) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
      return numbers;    
    }
// 3 - calculate the average
    public static double calculateAverage(int n, double[] numbers) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        double average = sum / n;
       }
     return n;
    }
// 4 - count how many numbers are above the average
    public static int countAboveAverage(double average, int n, double[] numbers) {
        int count = 0; // The number of elements above average
        for (int i = 0; i < n; i++) {
            if (numbers [i] > average)
                count++;
            }
        return count;
        } 
// 5 - print the result to the screen
    public static void Average (double[] average) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    int count = 0;
    System.out.println ("Average: " + average);
    System.out.println ("Number of elements above the average is " + count);
 }
}