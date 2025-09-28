package org.example.APT12;

import java.util.ArrayList;
import java.util.List;


/*
Заглушка сервиса
Предположим, что мы изменили класс Студента таким образом, что
проверка корректности добавляемой оценки выполняется им не самостоятельно, а с
помощью сервиса checkGrade,
который получает параметр grade
и возвращает true или false.

Реализуйте заглушку сервиса и реализуйте тест на проверку того, что
правильные оценки попадают в список оценок, а неправильные нет.

@ToString
@EqualsAndHashCode
public class Student {

    @Getter    @Setter
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    @SneakyThrows
    public void addGrade(int grade) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://localhost:5352/checkGrade?grade="+grade);
        CloseableHttpResponse httpResponse = httpClient.execute(request);
        HttpEntity entity = httpResponse.getEntity();
        if(!Boolean.parseBoolean(EntityUtils.toString(entity))){
            throw new IllegalArgumentException(grade + " is wrong grade");
        }
        grades.add(grade);
    }

    @SneakyThrows
    public int raiting() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://localhost:5352/educ?sum="+grades.stream().mapToInt(x->x).sum());
        CloseableHttpResponse httpResponse = httpClient.execute(request);
        HttpEntity entity = httpResponse.getEntity();
        return Integer.parseInt(EntityUtils.toString(entity));
    }
}
 */

public class Student {
    private List<Double> grades = new ArrayList<>();
    private GradeChecker gradeChecker; // сервис проверки оценок

    public Student(GradeChecker gradeChecker) {
        this.gradeChecker = gradeChecker;
    }

    public void addGrade(double grade) {
        if (gradeChecker.checkGrade(grade)) {
            grades.add(grade);
        }
    }

    public List<Double> getGrades() {
        return grades;
    }
}