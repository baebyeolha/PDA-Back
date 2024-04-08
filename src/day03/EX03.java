package day03;

public class EX03 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Garden garden = new Garden();
        Garden garden1 = new Garden();

        garden.getSound(cat);
        garden.getSound(dog);;



    }

     static class Garden{

        Garden(){

        }

        void getSound(Pet pet){
            pet.cry();

        }

    }

    static abstract class Pet{
        Pet(){

        }

        abstract void cry();  //추상메소드
    }

    static class Dog extends  Pet{
        Dog(){

        }

        void cry(){
            System.out.println("멍멍");
        }
    }

    static class Cat extends Pet{
        Cat(){

        }

        void cry(){
            System.out.println("야옹");
        }

    }
}
