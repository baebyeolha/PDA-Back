package day02;

public class EX02 {
    public static void main(String[] args) {
        Coffee iceAmericano = new Coffee(4500, "ice","tall");
        iceAmericano.setPrice(6000);
        iceAmericano.getInfo();
        Barista chunsik = new Barista("춘식");
        chunsik.getCoffeeInfo(iceAmericano.getPrice());
    }

    static class Coffee{

        private int price;
        String temp;
        String size;

        Coffee(int price, String temp, String size){
            this.price = price;
            this.temp = temp;
            this.size = size;
        }

        void getInfo(){
            System.out.println(price + ", " + temp + ", " + size);
        }

        void setPrice(int price){
            if(price >= this.price){
                this.price = price;
            }
        }

        int getPrice(){
            return price;
        }

    }

    static class Barista{

        String name;

        Barista(String name){
            this.name = name;
        }

        void getCoffeeInfo(int price){
            System.out.println("이 커피는" + price +"원 입니다");
        }
        void makeCoffee(){
            System.out.println("커피 여기 있습니다~");
        }


    }

}
