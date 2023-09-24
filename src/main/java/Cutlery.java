public class Cutlery {
    private int dirtiness;

    public Cutlery() {
        this.dirtiness = 0;
    }

    public void onUse(Eatable food) {
        dirtiness += food.getGreasiness();
    }

    public int getDirtiness() {
        return dirtiness;
    }

    public void setDirtiness(int dirtiness) {
        this.dirtiness = dirtiness;
    }

}