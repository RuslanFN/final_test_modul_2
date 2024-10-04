package models;

import java.util.Date;

public class Camel extends PackAnimal{
    @Override
    public String toString() {
        return "Camel{} " + super.toString();
    }

    public Camel(Date birthDate, String Name) {
        super(birthDate, Name);
    }
}
