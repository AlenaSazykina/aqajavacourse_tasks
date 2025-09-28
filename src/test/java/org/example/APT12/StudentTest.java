package org.example.APT12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testAddGradeWithStub() {
        // Создаем заглушку сервиса
        GradeChecker checker = new StubGradeChecker();
        Student student = new Student(checker);

        // Добавляем оценки
        student.addGrade(4.5); // допустимая
        student.addGrade(0.5); // недопустимая
        student.addGrade(3.0); // допустимая
        student.addGrade(6.0); // недопустимая

        // Получаем список оценок
        var grades = student.getGrades();

        // Проверяем, что только допустимые оценки добавлены
        assertEquals(2, grades.size());
        assertTrue(grades.contains(4.5));
        assertTrue(grades.contains(3.0));
        assertFalse(grades.contains(0.5));
        assertFalse(grades.contains(6.0));
    }
}