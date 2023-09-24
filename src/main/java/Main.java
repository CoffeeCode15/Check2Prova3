import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Cutlery fork = new Cutlery();
        Cutlery knife = new Cutlery();
        Cutlery spoon = new Cutlery();

        HashMap<String, Eatable> menu = new HashMap<String, Eatable>();

        menu.put("first_course", new Pasta(1));
        menu.put("fruit", new Apple(1));
        menu.put("snack", new Cake(1));

        person.eat(menu.get("first_course"), fork);
        menu.remove("first_course");

        person.eat(menu.get("fruit"), knife);
        menu.remove("fruit");

        person.eat(menu.get("snack"), spoon);
        menu.remove("snack");
    }
}