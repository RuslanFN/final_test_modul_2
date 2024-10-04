package models;

import java.util.Date;

public class PackAnimal extends Animal{

    public PackAnimal(Date birthDate, String Name) {
        super(birthDate, Name);
    }

    @Override
    public String toString() {
        return "models.PackAnimal{} " + super.toString();
    }
}
