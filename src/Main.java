class Animal{
    String food;
    String location;
    String name;

    Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){}
    public void eat(){}
    public void sleep(){}
}
class Dog extends Animal{
    String breed;

    Dog(String name, String food, String location, String breed){
        super(name, food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Собока " + name + " говорит гав-гав");
    }
    @Override
    public void eat(){
        System.out.println("Собака " + name + " ест корм");
    }
    @Override
    public void sleep(){
        System.out.println("Собака " + name + " спит");
    }
}
class Cat extends Animal{
    String color;

    Cat(String name, String food, String location, String color) {
        super(name, food, location);
        this.color = color;
    }

    @Override
    public void makeNoise(){
        System.out.println("Кот " + name + " говорит мяу-мяу");
    }
    @Override
    public void eat(){
        System.out.println("Кот " + name + " ест рыбу");
    }
    @Override
    public void sleep(){
        System.out.println("Кот " + name + " спит");
    }
}
class Horse extends Animal{
    int speed;
    Horse(String name, String food, String location, int speed) {
        super(name, food, location);
        this.speed =speed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Лошадь " + name + " говорит игого");
    }
    @Override
    public void eat(){
        System.out.println("Лошадь " + name + " ест сено");
    }
    @Override
    public void sleep(){
        System.out.println("Лошадь " + name + " спит");
    }
}
class Vet{
    String name;

    Vet(String name){
        this.name = name;
    }

    public void treatAnimal(Animal animal){
        System.out.println("Ветеринар " + name + " лечит животное " + animal.name + ", которое ест " + animal.food + " и живёт в " + animal.location);
    }
}
public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Барсик", "Рыба", "Дом", "Рыжий");
        animals[1] = new Dog("Бобик", "Корм", "Будка", "Овчарка");
        animals[2] = new Horse("Рысак", "Сено", "Конюшня", 40);

        Vet vet = new Vet("Кузнецов И.И.");

        animals[0].makeNoise();
        animals[1].eat();
        animals[2].sleep();

        vet.treatAnimal(animals[0]);
    }
}