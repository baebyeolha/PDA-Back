package day02;

public class Submit {
    // 쏘니와 베컴(사람) 핸드폰 구매 (쏘니는 삼성, 베컴은 애플)
    // SamsungPhone, ApplePhone 클래스 분리 + 오버라이드(덮어쓰기) + 부모(Phone) 상속
    // 쏘니가 " 야 내 핸드폰 켜볼게"
    // 쏘니 핸드폰 전원 켜지는 소리 "삐비빅"
    // 베컴 핸드폰 전원 켜지는 소리 "turn on" "bbeep"

    public static void main(String[] args) {

        Person son = new Person("쏘니");
        Person b = new Person("베컴");

        SamsungPhone samp = new SamsungPhone();
        ApplePhone applep = new ApplePhone();

        //Store store = new Store(son, samp);
        //store.sellPhone();
        son.turnonPhone("야 내 핸드폰 켜볼게", samp);
        b.turnonPhone("turn on", applep);


    }

    // 상점 객체
    static class Store{
        Person person;
        Phone phone;

        Store(Person person, Phone phone){
            this.person = person;
            this.phone = phone;
        }

//        void sellPhone(){
//            System.out.println(person.name+"님, 이 핸드폰의 가격은"+phone.price+"원입니다");
//        }

    }

    //person 객체
    static class Person{

        String name;  //멤버 변수 == 필드

        Person(String name){
            this.name = name;
        }

        void turnonPhone(String action, Phone phone){
            System.out.println(action);
            phone.Sound();
        }
    }


    // 핸드폰 객체 (부모)
    static class Phone{
        //private String sound;
        //private int price;

        Phone(){

        // this.price = price;
        }

        void Sound(){
            System.out.println("삑");
        }

    }

    //자식1. 삼성폰
    static class SamsungPhone extends Phone{

        SamsungPhone() {
            super();
        }

        void Sound(){
            System.out.println("삐비빅");
        }
    }

    //자식2. 애플폰
    static class ApplePhone extends Phone{
        ApplePhone(){

        }

        void Sound(){
            System.out.println("bbeep");
        }
    }


}
