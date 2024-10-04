import controllers.Controller;
import models.Animal;

import java.util.ArrayList;

public class main {
    public static void main(String args[]){
        ArrayList<Animal> Animals = new ArrayList<>();
        Controller controller = new Controller(Animals);
        controller.userMenuStart();
    }
}
