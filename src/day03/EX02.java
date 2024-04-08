package day03;
public class EX02 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        parent1.method();

        Child child = new Child();
        child.method();

        Parent parent2 = new Child();
        parent2.method();

        Child child2 = (Child) parent2;

    }

    static class Parent{

        void method(){
            System.out.println("부모 메소드");
        }

    }

    static class Child extends Parent{
        @Override
        void method(){
            System.out.println("자식메소드");
        }
    }
}
