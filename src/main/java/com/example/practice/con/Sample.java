package com.example.practice.con;

import jakarta.persistence.Temporal;
import org.junit.jupiter.api.Test;

public class Sample {

    /**
     * フィールド
     */
    private String name;

    /**
     * コンストラクタ
     */
    public Sample(){
        System.out.println("コンストラクタ: Super");

        this.name = "Sample";
    }



    public String MyGirlFriend(){
        return this.name;
    }

    public int MyGirlFriend(int i){
        return i;
    }

    public void MyGirlFriend(String s){
        System.out.println("Aさん");
    }




    /**
     * メソッド
     */
    public void method(){

    }

    /**
     * メソッド
     */
    public int method2(){
        return 10;
    }


    @Test
    public void innerMethod(){
        Sample sample = new Sample();

        sample.MyGirlFriend();
        sample.MyGirlFriend(1);
        sample.MyGirlFriend("Aさん");
        
    }
    
    private class OveredClass extends Sample{
        public OveredClass(){
            super();
        }

        @Override
        public void MyGirlFriend(String s){
            System.out.println("Bさん");
        }
    }
}
