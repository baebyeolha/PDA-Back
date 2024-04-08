package day03;

import java.awt.*;

public class EX01 {

    public static void main(String[] args) {
        //cow,chicken : cry() - "음메", "꼬끼오"
        // Farm: getSound() - cow, chicken .cry 호출
        // Animal: 상속 - 오버라이딩

        Chicken chicken = new Chicken();
        Cow cow = new Cow();

        Farm farm = new Farm(cow, chicken);
        farm.getSound();
    }

    static class Farm{
        Cow cow;
        Chicken chicken;


        Farm(Cow cow, Chicken chicken){
            this.cow = cow;
            this.chicken = chicken;
        }

        void getSound(){
            cow.cry();
            chicken.cry();
        }

//        void food(){
//            cow.eat();
//            chicken.eat();
//        }
    }

    static class Animal{

        Animal(){

        }

        void cry(){

        }
    }

    static class Cow extends Animal{

        Cow(){
        }

        @Override
        void cry(){
            System.out.println("음메");
        }
    }

    static class Chicken extends Animal{

        Chicken(){
        }

        void cry(){
            System.out.println("꼬끼오");
        }
    }
}
