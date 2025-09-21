package org.example.practice_oop.Polimorf;
/*
 Практика ООП. Полиморфизм #1. Трехмерная точка
Дан класс, описывающий точку координат:

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
Создайте такой подкласс (Point3D) класса Point, 
который будет иметь не две, а три координаты на плоскости: X,Y,Z. 
Вместо класса приведенного в задании можно использовать сделанный ранее 
самостоятельно класс Точки.
 */
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Можно добавить геттеры для удобства
    public int getX() { return x; }
    public int getY() { return y; }

    // Переопределим toString для удобства вывода
    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);  // вызов конструктора класса Point
        this.z = z;
    }

    // Геттер для z
    public int getZ() {
        return z;
    }

    // Переопределяем toString для вывода трёх координат
    @Override
    public String toString() {
        return "Point3D{x=" + x + ", y=" + y + ", z=" + z + "}";
    }
}

public class Task1 {
    public static void main(String[] args) {
        Point p2d = new Point(5, 10);
        System.out.println(p2d);  // Point{x=5, y=10}

        Point3D p3d = new Point3D(3, 6, 9);
        System.out.println(p3d);  // Point3D{x=3, y=6, z=9}
    }
}
