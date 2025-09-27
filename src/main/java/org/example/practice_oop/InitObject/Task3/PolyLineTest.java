package org.example.practice_oop.InitObject.Task3;
/*
Практика ООП. Объекты и классы #3. Ломаная линия
Создайте класс Ломаная (PolyLine), которая будет представлять собой ломаную линию (см. пример на рис.1), которая описывается: 

массив Точек, через которые линия проходит
При создании объекта можно ничего не указывать, или указать начальный набор Точек
Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это результат приведения к строке Точки с номером N
Может вернуть массив Линий (getLines)
Может вернуть свою длину (getLength)
Под Точкой имеется ввиду класс, созданный в задании 1 (точка координат). Под Линией имеется ввиду класс, созданный в задании 2 (линия).

Необходимо выполнить следующие задачи:

Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
Рассчитать длину Ломаной
Получить у Ломаной массив Линий 
Рассчитать длину массива Линий
Сравнить длину Ломаной и массива Линий: они должны совпасть
Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
Подсказка: текстовое представление объекта лучше реализовывать в переопределенном методе toString()
 */

import java.util.List;

// Тестовый класс
public class PolyLineTest {
    public static void main(String[] args) {
        // Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8;9}
        Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(8, 9);
        
        
        PolyLine polyline = new PolyLine();
        polyline.addPoint(point1);
        polyline.addPoint(point2);
        polyline.addPoint(point3);
        polyline.addPoint(point4);

        System.out.println("=== Создание ломаной ===");
        System.out.println("Ломаная: " + polyline);
        
        System.out.println("\n=== Рассчет длины ломаной ===");
        double length = polyline.getLength();
        System.out.println("Длина ломаной: " + String.format("%.2f", length));
        
        System.out.println("\n=== Получение массива линий ===");
        List<Line> lines = polyline.getLines();
        System.out.println("Массив линий:");
        for (int i = 0; i < lines.size(); i++) {
            Line line = lines.get(i);
            System.out.println("  Линия " + (i+1) + ": " + line);
            System.out.println("    Длина: " + String.format("%.2f", line.getLength()));
        }
        
        System.out.println("\n=== Рассчет длины массива линий ===");
        double totalLinesLength = 0;
        for (Line line : lines) {
            totalLinesLength += line.getLength();
        }
        System.out.println("Суммарная длина линий: " + String.format("%.2f", totalLinesLength));
        
        System.out.println("\n=== Сравнение длин ===");
        System.out.println("Длина ломаной: " + String.format("%.2f", length));
        System.out.println("Сумма длин линий: " + String.format("%.2f", totalLinesLength));
        System.out.println("Совпадают: " + (Math.abs(length - totalLinesLength) < 0.01));
        
        System.out.println("\n=== Изменение координат точки {2;8} на {12;8} ===");
        // Меняем координаты точки
        point2.setX(12);
        point2.setY(8);
        
        System.out.println("После изменения точки:");
        System.out.println("Ломаная: " + polyline);
        System.out.println("Длина ломаной: " + String.format("%.2f", polyline.getLength()));
        
        System.out.println("\nНовые линии:");
        List<Line> newLines = polyline.getLines();
        for (int i = 0; i < newLines.size(); i++) {
            Line line = newLines.get(i);
            System.out.println("  Линия " + (i+1) + ": " + line);
            System.out.println("  Длина: " + String.format("%.2f", line.getLength()));
        }
        
        System.out.println("\n=== Проверка отражения изменений ===");
        System.out.println("Точка 2 в ломаной: " + point2);
        if (newLines.size() > 0) {
            System.out.println("Точка 2 в первой линии: " + newLines.get(0).getStart());
        }
        if (newLines.size() > 1) {
            System.out.println("Точка 2 во второй линии: " + newLines.get(1).getStart());
        }
    }
}

