package controllers;

import models.*;
import services.*;
import views.*;

import java.util.ArrayList;
import java.util.Map;

public class Controller implements ControllerIntarface{
    AnimalServiceInterface animalServiceInterface;
    UserMenuServiceInterface userMenuServiceInterface;
    ViewInterface viewInterface;
    public Controller(ArrayList<Animal> animals) {
        this.animalServiceInterface = new AnimalService(animals);
        this.userMenuServiceInterface = new UserMenuService();
        this.viewInterface = new View();
    }

    @Override
    public void userMenuStart() {
        viewInterface.printStart();

        viewInterface.printFunctionList();
        viewInterface.printChooseAnimal(animalServiceInterface.getChooseAnimal());
        String cmnd = userMenuServiceInterface.getUserAnswer();
        while (!cmnd.toLowerCase().equals("стоп")){
            switch (cmnd){
                case "1":
                    createAnimal();
                    break;
                case "2":
                    lookAllAnimal();
                    break;
                case "3":
                    chooseAnimal();
                    break;
                case "4":
                    removeAnimal();
                    break;
                default:
                    animalServiceInterface.executeCommand(cmnd);
            }
            viewInterface.printFunctionList();
            viewInterface.printChooseAnimal(animalServiceInterface.getChooseAnimal());
            cmnd = userMenuServiceInterface.getUserAnswer();
        }
    }

    @Override
    public void createAnimal() {
        viewInterface.printAskNewAnimal();
        String ans = userMenuServiceInterface.getUserAnswer();
        Map<String, String> ansMap = userMenuServiceInterface.getDataAnimal(ans);
        int year = Integer.parseInt(ansMap.get("year"));
        int month = Integer.parseInt(ansMap.get("month"));
        String name = ansMap.get("name");
        TypeAnimal type = userMenuServiceInterface.numberToTypeAnimal(ansMap.get("type"));
        animalServiceInterface.createAnimal(year, month, name, type);
    }

    @Override
    public void removeAnimal() {
        animalServiceInterface.removeChooseAnimal();
    }

    @Override
    public void lookAllAnimal() {
        viewInterface.printAnimalList(this.animalServiceInterface.getListAnimals());
    }

    @Override
    public void chooseAnimal() {
        viewInterface.printAskFindAnimal();
        String ans = userMenuServiceInterface.getUserAnswer();
        Map<String, String> ansMap = userMenuServiceInterface.getDataAnimalToFind(ans);
        String name = ansMap.get("name");
        TypeAnimal type = userMenuServiceInterface.numberToTypeAnimal(ansMap.get("type"));
        animalServiceInterface.findAnimal(name, type);
    }
}
