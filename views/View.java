package views;

import models.Animal;
import models.TypeAnimal;

import java.util.ArrayList;

public class View implements ViewInterface{
    @Override
    public void printStart() {
        String s = """
                Программа урпавления питомником. 
                О питомнике.
                В питомнике содержится 6 видов животных:
                1. Кошки
                2. Собаки
                3. Хомяки
                4. Лошади
                5. Ослы
                6. Верблюды
                Вы можете вносить и удалять записи о питомцах. 
                """;
        System.out.println(s);
    }

    @Override
    public void printFunctionList() {
        String s = """
                Список функций:
                1. Внести животное
                2. Посмотреть всех животных
                3. Выбрать животное
                4. удалить выбраное животное
                """;
        System.out.println(s);
    }

    @Override
    public void printAnimalList(ArrayList<Animal> animals) {
        System.out.println("Список животных");
        for (Animal animal:animals) {
                 printAnimal(animal);
        }
    }
    private void printAnimal(Animal animal){
        if (animal != null)
            System.out.println(animal.getName() + " " + animal.getBirthDate().toString() + " " + TypeAnimal.getType(animal.getClass().toString()));
        else
            System.out.println("Отсутствует");
    }
    @Override
    public void printAskNewAnimal() {
        String s = """
                Введите новое животное в формате:
                ИМЯ ГОД МЕСЯЦ ТИП
                ТИП - целое число от 1 до 6
                """;
        System.out.println(s);
    }

    @Override
    public void printAskFindAnimal() {
        String s = """
                Введите данные животноего в формате:
                ИМЯ ТИП
                ТИП - целое число от 1 до 6
                """;
        System.out.println(s);
    }

    @Override
    public void printChooseAnimal(Animal animal) {
        System.out.println("Выбрано:");
        printAnimal(animal);
    }
}
