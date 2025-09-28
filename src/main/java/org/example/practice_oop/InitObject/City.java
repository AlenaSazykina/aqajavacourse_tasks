/*
Объекты и классы #4. Города - задание необязательное
Данное задание не является обязательным для решения. Вы можете выполнить его для дополнительной тренировки навыка по данной теме

Создайте класс Город (City), которая будет представлять собой точку на карте со следующими характеристиками:

Название Города: строка
Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него
При создании Город требует указать название и можно (но не обязательно) указывать набор путей
Город может возвращать текстовое представление, в виде названия Города и списка связанных с ним Городов (в виде пары: “название: стоимость”)
Городу в любой момент можно добавить новый путь в другой город, указав либо сам путь, либо пару Город-цена
Город должен иметь метод путешествия (travelBy). Такой метод принимает число n, который обозначает количество переходов. Проще говоря, в текущем списке путей берется первый город, из его списка путей так же берется первый город, из списка путей которого в свою очередь берется город и так далее до тех пор, пока либо количество городов не станет равным n, либо у текущего города не окажется путей. Метод возвращает последний Город пути или null если мы попали в тупик
Используя
разработанную сущность реализуйте схему, представленную на рисунке 1.

https://davtb-teachbase.api.eric.s3storage.ru/material_images/8e2d1bbb64da542c50a8d11fe809bfe69ab9cf37.png
Рис. 1. Города и пути между ними
Далее
необходимо методу путешествия объекта B передать некоторое число и вывести
возвращенный город на экран:

Если передано число 1, результат должен быть либо A, либо С
Если передано число 2, результат должен быть либо B, либо D, либо F
Если передано число 3, результат может быть любом городом в зависимости от порядка следования путей в списках таковых у городов
Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A
 */

package org.example.practice_oop.InitObject;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Path> paths;

    // Вложенный класс для хранения пары "Город + стоимость"
    private static class Path {
        City city;
        int cost;

        Path(City city, int cost) {
            this.city = city;
            this.cost = cost;
        }
    }

    // Конструктор
    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    // Добавление пути
    public void addPath(City city, int cost) {
        this.paths.add(new Path(city, cost));
    }

    // Переход по первому пути n раз
    public City travelBy(int n) {
        City current = this;
        for (int i = 0; i < n; i++) {
            if (current.paths.isEmpty()) {
                return null;
            }
            current = current.paths.get(0).city;
        }
        return current;
    }

    // Строковое представление
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> [");
        for (int i = 0; i < paths.size(); i++) {
            Path p = paths.get(i);
            sb.append(p.city.name).append(": ").append(p.cost);
            if (i < paths.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Тестирование
    public static void main(String[] args) {
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        B.addPath(C, 20);
        B.addPath(A, 10);

        C.addPath(F, 25);
        C.addPath(E, 15);

        A.addPath(B, 10);
        A.addPath(D, 20);

        F.addPath(A, 5);

        System.out.println("travelBy(1) from B: " + cityNameOrNone(B.travelBy(1)));
        System.out.println("travelBy(2) from B: " + cityNameOrNone(B.travelBy(2)));
        System.out.println("travelBy(3) from B: " + cityNameOrNone(B.travelBy(3)));
    }

    // Удобный метод для печати имени города или null
    private static String cityNameOrNone(City city) {
        if (city == null) {
            return "None";
        }
        return city.getName();
    }
}