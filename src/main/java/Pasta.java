public class Pasta implements Eatable {
    private int quantity;
    private int satiety;
    private int greasiness;

    public Pasta(int quantity) {
        this.quantity = quantity;
        this.satiety = quantity * 2;
        this.greasiness = quantity * 3;
    }

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public int getGreasiness() {
        return greasiness;
    }

    /**
     * @return int return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @param satiety the satiety to set
     */
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    /**
     * @param greasiness the greasiness to set
     */
    public void setGreasiness(int greasiness) {
        this.greasiness = greasiness;
    }

}