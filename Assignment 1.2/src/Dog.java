class Dog extends Animal {
    private String breed;

    Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + getFood());
    }
}
