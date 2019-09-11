package com.javacourse.se.lesson5;

import com.javacourse.se.lesson7.Bus; // импорт пакета в котором находится нужный нам класс

public class Main {
    public static void main(String[] args) {
        Bus ourBus = new Bus(); // объявление и инициализация объекта
        Bus firstBus = new Bus(); // объявление и инициализация объекта
        Bus secondBus = new Bus(); // объявление и инициализация объекта

        // задаем поля значения
        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        // выводим метод showColor()
        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
