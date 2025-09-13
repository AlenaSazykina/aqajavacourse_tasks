package org.example.practice_oop.Task2;

public class Line {
    private Point start;
    private Point end;

    // Конструктор с двумя точками
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор с четырьмя целыми координатами
    public Line(int startX, int startY, int endX, int endY) {
        this.start = new Point(startX, startY);
        this.end = new Point(endX, endY);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    // Метод вычисления длины линии по формуле гипотенузы
    public double getLength() {
        int dx = end.getX() - start.getX();
        int dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "Линия от " + start.toString() + " до " + end.toString();
    }
}
