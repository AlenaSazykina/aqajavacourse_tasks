package org.example.APT9Enum;

public class Sauce {
    // Перечисление для уровня остроты
    public enum Spiciness {
        VERY_SPICY("очень острый"),
        SPICY("острый"),
        NOT_SPICY("не острый");

        private final String description;

        Spiciness(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private String name;
    private Spiciness spiciness;

    // Конструктор, требующий название и уровень остроты
    public Sauce(String name, Spiciness spiciness) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
        this.name = name;
        this.spiciness = spiciness;
    }

    // Геттеры (при необходимости)
    public String getName() {
        return name;
    }

    public Spiciness getSpiciness() {
        return spiciness;
    }

    // Строковое представление
    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness.getDescription();
    }
}
