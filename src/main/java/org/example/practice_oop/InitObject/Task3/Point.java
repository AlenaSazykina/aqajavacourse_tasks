package org.example.practice_oop.InitObject.Task3;

// Класс Точка
class Point {
    private double x;
    private double y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}

// Класс Линия
class Line {
    private Point start;
    private Point end;
    
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    public double getLength() {
        return start.distanceTo(end);
    }
    
    public Point getStart() {
        return start;
    }
    
    public Point getEnd() {
        return end;
    }
    
    @Override
    public String toString() {
        return "Линия [" + start.toString() + "," + end.toString() + "]";
    }
}
