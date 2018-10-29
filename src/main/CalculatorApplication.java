package main;

public class CalculatorApplication {//это чисто точка входа, больше ничего (в ней будет только точка входа - метод main)

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.startCalculator();/*на этом все, считается правилом хорошего тона что точка входа должна иметь минимальное
        кол-во кода, но достаточное для понимания.
        */


    }
}
