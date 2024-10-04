package models;

import java.util.IllformedLocaleException;

public enum TypeAnimal {
    CAT (Cat.class.toString()),
    DOG (Dog.class.toString()),
    HUMSTER (Humster.class.toString()),
    HOURSE (Hourse.class.toString()),
    DONKEY (Donkey.class.toString()),
    CAMEL (Camel.class.toString());

    private String title;

    public String getTitle() {
        return title;
    }
    public static TypeAnimal getType(String className){
        if (className.equals(CAT.getTitle())) {return CAT;}
        else if (className.equals(DOG.getTitle())) {return DOG;}
        else if (className.equals(HUMSTER.getTitle())) {return HUMSTER;}
        else if (className.equals(HOURSE.getTitle())) {return HOURSE;}
        else if (className.equals(DONKEY.getTitle())) {return DONKEY;}
        else if (className.equals(CAMEL.getTitle())) {return CAMEL;}
        else throw new IllformedLocaleException("Такого типа нет");
    }
    TypeAnimal(String title) {
        this.title = title;
    }
}

