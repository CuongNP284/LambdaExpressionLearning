/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuongnp.lambda.main;

import com.cuongnp.lambda.core.Salutation;

/**
 *
 * @author phucu
 */
public class Main {
    public static void main(String[] args) {
        
        SalutionVN loiChao = new SalutionVN();
        loiChao.sayHello("Xin chào Việt Nam");

        
        Salutation hello日本語 = new Salutation() {
            @Override
            public void sayHello(String msg) {
                System.out.println(msg);
            }
        };
        hello日本語.sayHello("こにちわ　日本！！！");
       
        
        //Salutation helloDEU = (String msg) -> {System.out.println(msg);};
        
        //Sửa lại cho gọn hơn nữa
        //Salutation helloDEU = msg -> System.out.println(msg);
        Salutation helloDEU = msg -> {
                                       System.out.println(msg);
                                       System.out.println("Lambda Expression");
                                    };
        
        helloDEU.sayHello("Hallo Deutschland!!!");

    }
}
