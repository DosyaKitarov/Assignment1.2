class Cat extends Animal {
    private boolean isDomestic;

    public Cat(String food, String location, boolean isDomestic) {
        super(food, location);
        this.isDomestic = isDomestic;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating " + getFood());
    }
}