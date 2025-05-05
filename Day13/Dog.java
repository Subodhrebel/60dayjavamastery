class Animal {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Species: " + getSpecies());
        System.out.println("Age: " + getAge());
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + getBreed());
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 5, "Golden Retriever");
        dog.setSpecies("Dog");
        dog.setAge(6);
        dog.setBreed("Labrador");
        dog.displayInfo();
    }
}
