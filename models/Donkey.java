package models;

import java.util.Date;

public class Donkey extends PackAnimal{
    @Override
    public String toString() {
        return "Donkey{} " + super.toString();
    }

    public Donkey(Date birthDate, String Name) {
        super(birthDate, Name);
    }
}
