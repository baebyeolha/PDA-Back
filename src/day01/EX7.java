public class EX7 {
    public static void main(String[] args) {

        Notebook samsong = new Notebook("삼성");
        Notebook lg = new Notebook("lg");

        System.out.println(samsong.brandname);
        class Notebook{
            //변수 (= 부품)
            String brandname;

            //생성자
            Notebook(String brandname){
                brandname = brandname;
            }

        }

    }
}
