package day03;

import java.util.concurrent.TimeUnit;

public class EX05 {
    public static void main(String[] args) {

        Netflix netflix = new Netflix();
        Tving Tving = new Tving();

        netflix.play();
        netflix.finish();
        // OTT : Netflix, Tving
        // printOpeningLogo() : sout "넷플" "티빙"
        // netflix.play() -> printOpen... "영상시작"
        // netflix.finish() : sout
    }

    static abstract class OTT{
        OTT(){
        }

        abstract void printOpeningLogo();
        void play(){
            printOpeningLogo();
            System.out.println("영상시작");
        }

        void finish(){
            System.out.println("시청종료");
        }

    }

    static class Netflix extends  OTT{
        Netflix(){

        }

        @Override
        void printOpeningLogo(){
            System.out.println("넷플릭스");
        }

        void play(){
            printOpeningLogo();
            System.out.println("영상시작");
        }

        void finish(){
            System.out.println("시청종료");
        }

    }

    static class Tving extends OTT{
        Tving(){

        }

        @Override
        void printOpeningLogo(){
            System.out.println("티빙");
        }

        void play(){
            printOpeningLogo();
            System.out.println("영상시작");
        }

        void finish(){
            System.out.println("시청종료");
        }
    }
}
