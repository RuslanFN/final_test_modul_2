package services;

import models.TypeAnimal;

import java.util.Map;

public interface UserMenuServiceInterface {
    TypeAnimal numberToTypeAnimal(String userInput);
    /*
    switch (userInput){
            case "1":
                return TypeAnimal.CAT;
            case "2":
                return TypeAnimal.DOG;
            case "3":
                return TypeAnimal.HUMSTER;
            case "4":
                return TypeAnimal.HOURSE;
            case "5":
                return TypeAnimal.DONKEY;
            case "6":
                return TypeAnimal.CAMEL;
            default:
                throw new IllegalArgumentException("Некорректный номер типа животного");
        }
     */
    String getUserAnswer();
    Map<String, String> getDataAnimal(String userInput);
    public Map<String, String> getDataAnimalToFind(String userInput);



}
