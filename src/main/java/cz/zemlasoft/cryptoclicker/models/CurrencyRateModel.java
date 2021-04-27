package cz.zemlasoft.cryptoclicker.models;

import java.time.LocalTime;
import java.util.Date;

public class CurrencyRateModel {
   int[][] prices;

   public int[][] getPrices() {
      return prices;
   }

   public void setPrices(int[][] prices) {
      this.prices = prices;
   }
}
