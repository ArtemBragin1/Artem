/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworldapp;

/**
 *
 * @author Student
 */
public class CustomMath {
    public static int sum(int x, int y) {
        return x + y; //возвращает результат сложения двух чисел
    }
    
public static int division(int x, int y) {
    if (y == 0){//если делитель равен нулю
        throw new IllegalArgumentException("divider is 0");
    }//бросается исключение
    return x / y; //возвращает результат деления
}
public static void main(String[] args) {
    {
        System.out.println("Test1 failed");
    }
    try {
        System.out.println("Test3 failed");
    } catch (IllegalArgumentException e) {
        //тест считается успешным, если при попытке деления на 0
        //генерируется ожидаемое исключение
        System.out.println("Test3 passed");
    }
}
}