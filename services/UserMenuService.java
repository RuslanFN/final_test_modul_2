package services;

import models.TypeAnimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMenuService implements UserMenuServiceInterface {


    @Override
    public TypeAnimal numberToTypeAnimal(String userInput) {
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
    }


    @Override
    public String getUserAnswer() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    private boolean isDigit(String arg){
        try{
            Integer.parseInt(arg);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public Map<String, String> getDataAnimal(String userInput){
        String[] args = userInput.split(" ");
        if (args.length != 4){
            throw new IllegalArgumentException("Неправильные количество или формат аргументов");
        }
        if (!isDigit(args[1]) || !isDigit(args[2]) || !isDigit(args[3])){
            throw new IllegalArgumentException("Ошибка конвертации чисел");
        }
        Map<String, String> argsMap = new HashMap<>();
        argsMap.put("name", args[0]);
        argsMap.put("year", args[1]);
        argsMap.put("month", args[2]);
        argsMap.put("type", args[3]);
        return argsMap;
    }
    public Map<String, String> getDataAnimalToFind(String userInput){
        String[] args = userInput.split(" ");
        if (args.length != 2){
            throw new IllegalArgumentException("Неправильные количество или формат аргументов");
        }
        if (!isDigit(args[1])){
            throw new IllegalArgumentException("Ошибка конвертации чисел");
        }
        Map<String, String> argsMap = new HashMap<>();
        argsMap.put("name", args[0]);
        argsMap.put("type", args[1]);
        return argsMap;
    }
}

