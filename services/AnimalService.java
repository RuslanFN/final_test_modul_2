package services;

import models.*;

import java.util.*;

public class AnimalService implements AnimalServiceInterface{
    private ArrayList<Animal> animals;
    private Animal chooseAnimal;

    public AnimalService(ArrayList<Animal> animals) {
        this.animals = animals;
        this.chooseAnimal = null;
    }

    public AnimalService() {
        this.animals = new ArrayList<>();
        this.chooseAnimal = null;
    }

    @Override
    public void createAnimal(int yearBirth, int monthBirth, String Name, TypeAnimal type) {
        Calendar calendar = new GregorianCalendar(yearBirth, monthBirth, 0);
        Date date = calendar.getTime();
        switch (type){
            case CAT:
                this.animals.add(new Cat(date, Name));
                break;
            case DOG:
                this.animals.add(new Dog(date, Name));
                break;
            case HUMSTER:
                this.animals.add(new Humster(date, Name));
                break;
            case HOURSE:
                this.animals.add(new Hourse(date, Name));
                break;
            case DONKEY:
                this.animals.add(new Donkey(date, Name));
                break;
            case CAMEL:
                this.animals.add(new Camel(date, Name));
                break;
        }
    }

    @Override
    public Animal removeAnimal(Animal animal) {
        if (animal != null){
            this.animals.remove(animal);
            this.chooseAnimal = null;
        }
        return animal;
    }
    public void removeChooseAnimal(){
        if (this.chooseAnimal != null){
            removeAnimal(this.chooseAnimal);
        }else{
            System.out.println("No choose animal");
        }
    }

    @Override
    public Animal getChooseAnimal() {
        return chooseAnimal;
    }

    @Override
    public Animal findAnimal(String name, TypeAnimal type) {
        for (Animal animal:this.animals) {
            if (animal.getName().equals(name) && animal.getClass().toString().equals(type.getTitle())){
                this.chooseAnimal = animal;
                return animal;
            }
        }
        return null;
    }

    @Override
    public void learnCommand(String command, String execute) {
        if (chooseAnimal != null){
            chooseAnimal.learnCommand(command, execute);
        }else{
            System.out.println("No choose animal");
        }
    }

    @Override
    public ArrayList<Animal> getListAnimals() {
        return this.animals;
    }

    @Override
    public void executeCommand(String command) {
        if (chooseAnimal != null){
            chooseAnimal.executeCommand(command);
        }else{
            System.out.println("No choose animal");
        }
    }
}
