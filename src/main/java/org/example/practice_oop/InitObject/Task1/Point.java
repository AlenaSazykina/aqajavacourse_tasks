package org.example.practice_oop.InitObject.Task1;

/*
 Практика ООП. Объекты и классы #1. Точка координат
Создайте класс Точка, расположенную на двумерной плоскости, которая описывается:

Координата Х: число
Координата Y: число
При создании требует указать обе координаты
Может возвращать текстовое представление вида “{X;Y}”
Далее необходимо создать три объекта точки: {1;3} {1;3} {5;8}

Выведите на экран текстовое представление этих точек и результат сравнения точек между собой. 
Убедитесь, что оба сравнения дали false.
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Метод, возвращающий строковое представление точки
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);

        // Выводим текстовое представление точек
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Сравнение объектов (ссылок) - должно быть false
        System.out.println(p1 == p2);  // false
        System.out.println(p1 == p3);  // false

        // Для полноты - сравнение через equals (по умолчанию сравнивает ссылки)
        System.out.println(p1.equals(p2));  // false, если equals не переопределён
    }
}
