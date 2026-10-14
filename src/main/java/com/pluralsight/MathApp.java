package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        double paolaSalary = 87000.0;
        double taciaSalary = 120000.0;
        double highestSalary = Math.max(paolaSalary, taciaSalary);
        System.out.println("The highest salary is " + highestSalary);

        //Question 2
        double carPrice = 40000.0;
        double truckPrice = 80000.0;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is " + smallestPrice);

        //Question 3
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + circleArea);

        //Question 4
        double originalNumber = 5.0;
        double squareRoot = Math.sqrt(originalNumber);
        System.out.println("The square root of " + originalNumber);

        //Question 5
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between the point is " + distance);

        //Question 6
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value of " + negativeValue + " is " + absoluteValue);

        //Question 7
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is " + randomNumber);

        //Question 8
        long days = 24;
        long hoursPerDay = 24;
        long minutesPerHour = 60;
        long totalMinutes = days * hoursPerDay * minutesPerHour;
        System.out.println("There are " + totalMinutes + " minutes in " + days + " days.");

        //BONUS
        long secondsPerMinute = 60;
        long millisPerSecond = 1000;
        long totalMilliseconds = totalMinutes * secondsPerMinute * millisPerSecond;
        System.out.println("Bonus - There are " + totalMilliseconds + " milliseconds in " + days + " days.");
    }
}
