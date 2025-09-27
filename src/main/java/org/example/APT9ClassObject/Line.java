package org.example.APT9ClassObject;


public class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false;
        Line other = (Line) obj;
        return (this.start.equals(other.start) && this.end.equals(other.end));
    }

    // Глубокое клонирование
    @Override
    public Line clone() {
        try {
            Line cloned = (Line) super.clone();
            // Клонируем точки вручную (глубокое копирование)
            cloned.start = this.start.clone();
            cloned.end = this.end.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            // В случае ошибки создаем вручную
            return new Line(this.start.clone(), this.end.clone());
        }
    }
}
