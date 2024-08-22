package org.afob.limit;

import org.afob.execution.ExecutionClient;
import org.afob.prices.PriceListener;

import java.math.BigDecimal;

public class LimitOrderAgent implements PriceListener {
           private ExceutionClient executionClient;
    public LimitOrderAgent(final ExecutionClient ec) {

        this.ex=executionClient;
    }


    @Override
    public void priceTick(String productId, BigDecimal price) {
       if("IBM".euqals(productId)&&price <100.00){

           executionClient.executeOrder(prodctId,1000);
       }
    }

}
