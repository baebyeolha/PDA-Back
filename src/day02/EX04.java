package day02;

// 상속
public class EX04 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        bus.ride();
        bus.ring();
        bus.getWheelNum();
        taxi.ride();

    }

    //부모 클래스는 자식 클래스의 공통된 특징
    // 자식부터 설계하고 부모 설계 쉽다
    static class Car{
        int wheels= 4;
        Car(){

        }

        void ride() {
            System.out.println("부아앙");
        }

        void getWheelNum(){
            System.out.println(wheels);
        }


    }

    //bus
    static class Bus extends Car{
        //int wheels = 4;
        Bus(){
            //super(); 자식클래스에 숨겨져있는 것, 부모 생성자 호출
            new Car();
        }

        void ride() {
            System.out.println("부릉부릉");
        }

        void ring(){
            System.out.println("삐--");
        }


//        void getWheelNum(){
//            System.out.println(wheels);
//        }


    }

    //taxi
    static class Taxi extends Car{
        //int wheels = 4;
        Taxi(){

        }

        void ride() {
            System.out.println("빵빵");
        }
//
//        void getWheelNum(){
//            System.out.println(wheels);
//        }
    }
//
}
