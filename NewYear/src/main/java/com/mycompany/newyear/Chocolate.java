
package com.mycompany.newyear;

import java.util.Random;

public class Chocolate extends Gift{
    
    final String[] chocolateNames = {"Dark Chocolate", "Milk Chocolate", "Waffer"};
    Random random = new Random();
    int index = random.nextInt(chocolateNames.length);
    
    Chocolate(int weight, int price){
        super(weight, price);
        
        setName();
    }
    


    @Override
    final void setName() {
        this.name = chocolateNames[index];
    }
    
}
