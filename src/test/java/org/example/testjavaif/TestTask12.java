package org.example.testjavaif;
import static org.example.javaif.Task12.printDays;

public class TestTask12 {
    // Для тестирования
    public static void main(String[] args) {
        printDays("понедельник"); // должен вывести все дни с понедельника до воскресенья
        System.out.println();
        printDays("среда"); // должен вывести среду, четверг, пятницу, субботу, воскресенье
        System.out.println();
        printDays("неделя"); // не день недели
    }
}



