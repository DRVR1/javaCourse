package basics.enumeratives;

enum CarBrand {
    bugatti(3000, 300), chevrolet(2000, 200);

    private int price;
    private int speed;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private CarBrand(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

}
