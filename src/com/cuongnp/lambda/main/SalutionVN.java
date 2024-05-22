
package com.cuongnp.lambda.main;

import com.cuongnp.lambda.core.Salutation;

/**
 *
 * @author phucu
 */
public class SalutionVN implements Salutation{

    @Override
    public void sayHello(String msg) {
        System.out.println(msg);
    }
    
}
