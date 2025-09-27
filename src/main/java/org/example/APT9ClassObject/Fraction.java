package org.example.APT9ClassObject;

/*
Класс Object #1. Сравнение дробей - задание необязательное
Данное задание не является обязательным для решения. Вы можете выполнить его для дополнительной тренировки навыка по данной теме

Имеется класс, описывающий Дробь

class Fraction{
    int num,denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }    
}
Переопределите
метод сравнения объектов по состоянию таким образом, чтобы две дроби считались
одинаковыми тогда, когда у них одинаковые значения числителя и знаменателя.

Переопределите
метод клонирования, унаследованный от класса Object,
таким образом, чтобы при его вызове возвращался новый объект Дроби, значения
полей которого будут копиями оригинальной Дроби.
 */

public class Fraction implements Cloneable {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }

    // Переопределение equals для сравнения по числителю и знаменателю
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Fraction other = (Fraction) obj;
        return this.num == other.num && this.denum == other.denum;
    }

    // Переопределение clone - поверхностное клонирование
    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Fraction(this.num, this.denum);
        }
    }
}
