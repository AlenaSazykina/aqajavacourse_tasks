package org.example.practice_oop.Incapsulation.Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    // Конструктор с обязательным именем и необязательным набором оценок
    public Student(String name, int... initialGrades) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        this.grades = new ArrayList<>();
        // Добавляем оценки только если они в диапазоне 2..5
        for (int grade : initialGrades) {
            addGrade(grade);
        }
    }

    // Конструктор с только именем
    public Student(String name) {
        this(name, new int[0]);
    }

    // Добавить одну оценку (если она в допустимом диапазоне)
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
        grades.add(grade);
    }

    // Получить все оценки (копия списка, чтобы нельзя было изменить из вне)
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    // Получить имя
    public String getName() {
        return name;
    }

    // Текстовое представление в формате: "Имя: [оценка1, оценка2,...]"
    @Override
    public String toString() {
        return name + ": " + grades.toString();
    }
}
