package org.example.testAPT;


import org.example.APT11.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class TestStudent {

    @Test
    void testGradesEncapsulation() {
        Student student = new Student("Ivan");
        student.addGrade(4);
        student.addGrade(5);

        // Получаем копию оценок
        List<Integer> gradesCopy = student.getGrades();

        // Меняем копию
        gradesCopy.add(2);

        // Внутренний список не должен измениться
        List<Integer> internalGrades = student.getGrades();

        assertEquals(2, internalGrades.size());
        assertFalse(internalGrades.contains(2));
    }

    @Test
    void testAddGradeThrowsExceptionForInvalidGrade() {
        Student student = new Student("Maria");
        // Проверяем выброс исключения для некорректных оценок
        assertThrows(IllegalArgumentException.class, () -> student.addGrade(1));
        assertThrows(IllegalArgumentException.class, () -> student.addGrade(6));
    }

    @Test
    void testEqualsAndHashCode() {
        Student s1 = new Student("Alex");
        Student s2 = new Student("Alex");

        s1.addGrade(3);
        s2.addGrade(3);

        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    void testToString() {
        Student s = new Student("John");
        s.addGrade(2);
        String str = s.toString();
        assertTrue(str.contains("John"));
        assertTrue(str.contains("2"));
    }

}
