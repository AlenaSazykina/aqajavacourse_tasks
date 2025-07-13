package org.example.javaclassandmethod;

/*
Практика Java. Классы и методы. #10

Многократный вызов. Дан следующий метод:

public static int lastNumSum(int a, int b){
  return (a%10)+(b%10);
}

Выполните с его помощью последовательное сложение пяти чисел: 5, 11, 123, 14, 1, и результат выведите на экран. Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.

Ответом на данное задание является код метода main, в котором происходит вызов данной функции.

Решение выполняется в таком порядке:

5+11 это 6

6+123 это 9

9+14 это 13

13+1 это 4

Итого 4

 */
/*
public class Task10 {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
    public static void printNumbers(int... nums) {
        for (int num : nums) {

        }
    }

}
*/
public class Task10 {
    public static void main(String[] args) {
        System.out.println(
                lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1)
        );
    }
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}

