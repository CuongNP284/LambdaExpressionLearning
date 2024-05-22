
package com.cuongnp.lambda.core;

@FunctionalInterface //Là loại interface chỉ cso duy nhất 1 hàm abstract
public interface Salutation {//Vì chỉ có 1 hàm, sau này khi new()
                             //Vùng ram chỉ có 1 hàm, dẹp mẹ tên hàm khi xài
                             //Vì không có sự nhầm lẫn giữa hàm này và hàm kia
        
    public void sayHello(String msg);//Hàm không có code
    //public static/default void sayHello(){vẫn có code}
}
