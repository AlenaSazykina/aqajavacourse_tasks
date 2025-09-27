package org.example.APT9ClassObject;


public class Point implements Cloneable {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Переопределяем equals для сравнения по координатам
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // сравниваем с самим собой
        if (obj == null || getClass() != obj.getClass()) return false; // проверка класса
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    // Переопределяем clone для создания копии точки
    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            // В случае ошибки создаем вручную
            return new Point(this.x, this.y);
        }
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}
