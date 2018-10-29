package main;

import java.util.Scanner;

public class Calculator {
    public int result;
    public String selectedOperation;//this is item of menu, which was selected by user.

    public void startCalculator() {
        do {
            showMenu();

            selectedOperation = readInput("Please, select operation: ");
            switch (selectedOperation){
                case "+":{
                    add(readNumber("Please, input digit: "));
                    break;
                }
                case "-":{
                    deduct(readNumber("Please, input digit: "));
                    break;
                }
                case "*": {
                    myltiply(readNumber("Please, input digit: "));
                    break;
                }
                case "/":{
                    divide(readNumber("Please, input digit: "));
                    break;
                }
            }
// другой вариант реализации ветвления - через обычный цикл for.
//            if (selectedOperation.equals("+")) {
//                add(userNumber);
//            } else if (selectedOperation.equals("-")) {
//                deduct(userNumber);
//            } else if (selectedOperation.equals("*")) {
//                myltiply(userNumber);
//            } else if (selectedOperation.equals("/")) {
//                divide(userNumber);
            //}

        } while (selectedOperation.equalsIgnoreCase("q"));
    }

    public void showMenu() {
        System.out.println("Add");
        System.out.println("Deduct");
        System.out.println("Multiply");
        System.out.println("Divide");
        System.out.println("Q Quit");
        System.out.println("Your current value is: " + result);
    }

    public void quit() {

    }

    public void add(int userNumber) {
        result=result+userNumber;

    }

    public void deduct(int userNumber) {
        result=result-userNumber;

    }

    public void myltiply(int userNumber) {
        result=result*userNumber;

    }

    public void divide(int userNumber) {
        result=result/userNumber;

    }

    public int readNumber(String message) {
        return Integer.valueOf(readInput(message));/*здесь мы подредактировали код чтобы не было двух одинаковых дублирующих кусов кода.
        А так мы здесь используем тот же код что ниже и в нем уже переконвертируем редультаты вычислений в число.
        */
    }

    public String readInput(String message) {
        System.out.print(message);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }

}

