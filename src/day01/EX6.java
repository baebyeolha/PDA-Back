public class EX6 {
    public static void main(String[] args) {

        Person kelly = new Person("켈리");
        Person json = new Person("제이슨");

        System.out.println(kelly.name);
        class Person{
            //변수 (= 부품)
            String name;

            // 생성자 = 클래스로 객체를 만들 수 있는 방법
            Person(String name){
                name = name;
            }

        }

    }
}
