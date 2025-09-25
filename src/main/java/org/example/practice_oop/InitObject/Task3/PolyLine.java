package org.example.practice_oop.InitObject.Task3;

// Класс Ломаная (PolyLine)
import java.util.ArrayList;
import java.util.List;

class PolyLine {
    private List<Point> points;
    
    // Конструктор без параметров
    public PolyLine() {
        this.points = new ArrayList<>();
    }
    
    // Конструктор с начальным набором точек
    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points);
    }
    
    // Добавить точку в конец ломаной
    public void addPoint(Point point) {
        points.add(point);
    }
    
    // Получить массив линий
    public List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        if (points.size() < 2) {
            return lines;
        }
        
        for (int i = 0; i < points.size() - 1; i++) {
            lines.add(new Line(points.get(i), points.get(i + 1)));
        }
        
        return lines;
    }
    
    // Получить длину ломаной
    public double getLength() {
        if (points.size() < 2) {
            return 0;
        }
        
        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).distanceTo(points.get(i + 1));
        }
        
        return totalLength;
    }
    
    // Получить точку по индексу
    public Point getPoint(int index) {
        if (index >= 0 && index < points.size()) {
            return points.get(index);
        }
        return null;
    }
    
    // Установить точку по индексу
    public void setPoint(int index, Point point) {
        if (index >= 0 && index < points.size()) {
            points.set(index, point);
        }
    }
    
    // Получить количество точек
    public int getPointCount() {
        return points.size();
    }
    
    // Строковое представление ломаной
    @Override
    public String toString() {
        if (points.isEmpty()) {
            return "Линия []";
        }
        
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i).toString());
            if (i < points.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }  
}



