package day03;

public class EX04 {
    public static void main(String[] args) {
        //레시피 - 슈퍼: getInfo 이 레시피는 00의 레시피
        // 파스타 레시피 - 자식: makeSource
        // 스테이크 레시피 - 자식: grill

    }
    static abstract class recipe {

        String name;
        recipe(String name){
            this.name = name;
        }

        void getInfo(){
            System.out.println("이 레시피는"+name+"의 레시피");
        }

        abstract void makeSource();
        abstract void grill();
    }

    static abstract class pastaRecipe extends recipe{

        pastaRecipe(String name){
            //super: 부모클래스의 생성자
            super(name);

        }

        void makeSource(){
            System.out.println("토마토 소스");
        }


    }

    static abstract class steakRecipe extends recipe{

        steakRecipe(String name) {
            super(name);
        }

        void grill(){
            System.out.println("미디움");
        }
    }

}
