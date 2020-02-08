
package com.mycompany.newyear;

import java.util.Random;

public class Sweet extends Gift{
    
    final String[] sweetNames = {"Laddu", "Kaju Katli", "Rasagulla"};
    Random random = new Random();
    int index = random.nextInt(sweetNames.length);
    
    Sweet(int weight, int price){
        super(weight, price);
        setName();
    }
  
    @Override
    final void setName() {
        this.name = sweetNames[index];
    }

}
