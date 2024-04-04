package day02;

public class EX01 {

    public static void main(String[] args) {
        Animal dog = new Animal("초롱이", "멍멍");
        Animal cow = new Animal("누렁이", "음메");
        System.out.println(dog.name);
        dog.cry();

    }

    static class Animal{
        String name;
        String sound;
        Animal(String name, String sound){
            this.name = name;
            this.sound= sound;
        }

        //메소드
        void cry(){
            System.out.println(sound);
        }

    }
}
