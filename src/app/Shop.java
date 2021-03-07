package app;

import com.company.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author LeeN
 * @version  1.0
 *
 */

public class Shop {
    public static void main(String[] args) {

        ProductManager pm = new ProductManager();

        Product p1 = pm.createProduct("1012","Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
        Product p2 = pm.createProduct("DFSKJ23K", "Coffee", BigDecimal.valueOf(300), Rating.FOUR_STAR);
        Product p3 = pm.createProduct("30383088", "Bread", BigDecimal.valueOf(50),Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = pm.createProduct("104", "Chocolate", BigDecimal.valueOf(45), Rating.FIVE_STAR);
        Product p5 = pm.createProduct("104", "Chocolate", BigDecimal.valueOf(45), Rating.FOUR_STAR, LocalDate.now().plusDays(8));

//        if (p3 instanceof Food){
//            LocalDate bestBefore = ((Food)p3).getBestBefore();
//        }
//        Product p5 = p2.applyRating(Rating.FOUR_STAR);
        //p3.getBestBefore();


//        System.out.println(" Product ID: " + p1.getId() + " - Product Name: " + p1.getName() + " - Price: " + p1.getPrice() + " - Discount: " + p1.getDiscountRate() + " - Rating: " + p1.getRating().getStars());
//        System.out.println(" Product ID: " + p2.getId() + " - Product Name: " + p2.getName() + " - Price: " + p2.getPrice() + " - Discount: " + p2.getDiscountRate() + " - Rating: " + p2.getRating().getStars());
//        System.out.println(" Product ID: " + p3.getId() + " - Product Name: " + p3.getName() + " - Price: " + p3.getPrice() + " - Discount: " + p3.getDiscountRate() + " - Rating: " + p3.getRating().getStars() + " - Best Before: " );
//      //  System.out.println(" Product ID: " + p2.getId() + " Product Name: " + p2.getName() + " Price: " + p2.getPrice() + " Discount: " + p2.getDiscountRate() + " Rating: " + p2.getRating().getStars());
//        System.out.println(" Product ID: " + p5.getId() + " - Product Name: " + p5.getName() + " - Price: " + p5.getPrice() + " - Discount: " + p5.getDiscountRate() + " - Rating: " + p5.getRating().getStars());
//

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
