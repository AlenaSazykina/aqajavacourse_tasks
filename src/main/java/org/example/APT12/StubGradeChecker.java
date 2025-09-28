package org.example.APT12;

public class StubGradeChecker implements GradeChecker {
    @Override
    public boolean checkGrade(double grade) {
        // Допустим, допустимые оценки: от 1.0 до 5.0
        return grade >= 1.0 && grade <= 5.0;
    }
}
