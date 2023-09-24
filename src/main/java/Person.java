public class Person {
    int hunger;

    public Person() {
        this.hunger = 10;
    }

    public void eat(Eatable food, Cutlery cutlery) {
        if (cutlery.getDirtiness() > 0) {
            throw new RuntimeException("cannot eat");
        }
        if (hunger - food.getSatiety() >= 0) {
            hunger -= food.getSatiety();
        } else {
            System.out.println("cannot eat");
        }

        cutlery.onUse(food);
    }
}