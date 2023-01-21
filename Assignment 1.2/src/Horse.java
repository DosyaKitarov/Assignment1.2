class Horse extends Animal {
    private int age;

    public Horse(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh neigh!");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating " + getFood());
    }
}