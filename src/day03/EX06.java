package day03;

public class EX06 {
    public static void main(String[] args) {
        Person son = new Person();
        ApplePhone iphone16 = new ApplePhone();
        SamsungPhone galaxy2223 = new SamsungPhone();
        son.buyPhone(iphone16);
        son.buyPhone(galaxy2223);

        //AppltPhpne: 배터리 용량(정수) 100
        //charge() +10충전
        // useKakaotalk() -5 사용
        //useYoutube() -10
        //배터리 용량 확인
        //turnOn
        //turnOff

    }

    static class Person{

        Phone phone;

        Person(){

        }
        //buyPhone()
        void buyPhone(Phone phone){
            this.phone = phone;
        }
        //charge()
        void chargePhone(){
            phone.charge();
        }

        //useKakaotalk()
        void useKakaotalk(){
            phone.operateKakaotalk();
        }
    }

    public interface Phone {

        //1. 구현체가 어떤 게 오든 받아줄 수 있게 타입형태로 제시하기 위함 => implements Phone
        //    추상클래스 extends 공통 기능 상속, 규약 구현(추상메소드) / 인터페이스는 implements 공통 규약, 구현
        //2. 구현체(객체)를 필요 = 구현체 사용 = 메소드를 호출
        // 메소드 선언(이름, 매개변수) 통일 (인터페이스는 implements 공통 규약, 구현/ 추상클래스)

        int BATTERY_CAPACITY = 100;

        void charge();

        void operateKakaotalk();

        void useYoutube();

        void checkBattery();

        void turnOn();

        void turnOff();
    }

    static class ApplePhone implements Phone{
        int battery=70;
        final int BATTERY_CAPACITY = 100;
        boolean isOn = true;

        ApplePhone(){

        }

        @Override
        public void charge(){
            if(battery == 100){
                System.out.println("100%");
            }else if(battery <=90){
                battery +=10;
                System.out.println(battery+"%");
            }else{
                battery += (BATTERY_CAPACITY-battery);
                System.out.println(battery+"%");
            }
        }

        @Override
        public void operateKakaotalk(){
            if(battery>5){
                battery-=5;
            } else {
                battery =0;
                turnOff();
            }
        }

        @Override
        public void useYoutube(){
            if(battery>10){
                battery-=10;
            } else {
                battery =0;
                turnOff();
            }
        }


        @Override
        public void checkBattery(){
            System.out.println(battery);
        }

        public void turnOn(){
            isOn = true;
        }

        public void turnOff(){
            isOn = false;
        }
    }


    static class SamsungPhone implements Phone{
        int battery=70;
        final int BATTERY_CAPACITY = 100;
        boolean isOn = true;

        SamsungPhone(){

        }

        @Override
        public void charge(){
            if(battery == 100){
                System.out.println("100%");
            }else if(battery <=90){
                battery +=10;
                System.out.println(battery+"%");
            }else{
                battery += (BATTERY_CAPACITY-battery);
                System.out.println(battery+"%");
            }
        }

        @Override
        public void operateKakaotalk(){
            if(battery>5){
                battery-=5;
            } else {
                battery =0;
                turnOff();
            }
        }

        @Override
        public void useYoutube(){
            if(battery>10){
                battery-=10;
            } else {
                battery =0;
                turnOff();
            }
        }


        @Override
        public void checkBattery(){
            System.out.println(battery);
        }

        public void turnOn(){
            isOn = true;
        }

        public void turnOff(){
            isOn = false;
        }
    }
}
