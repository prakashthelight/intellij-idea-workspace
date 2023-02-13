package com.learning.shipping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;

public class ShippingTests {
    @Test
    public void ShippingTest () throws ParseException {
        var voyages = new ArrayList<Voyage>();
        voyages.add(new Voyage("V0","Shanghai", "New York", "01/10/2022", "01/30/2022"));
        voyages.add(new Voyage("V1","Shanghai", "New York", "02/10/2022", "02/30/2023"));
        voyages.add(new Voyage("V2","Shanghai", "New York", "03/10/2022", "03/01/2022"));
        voyages.add(new Voyage("V3","Shanghai", "New York", "04/10/2022", "04/01/2022"));
        voyages.add(new Voyage("V4","Shanghai", "Chicago", "01/01/2022", "01/20/2022"));
        voyages.add(new Voyage("V5","Chicago", "Los Angeles", "01/01/2022", "01/20/2022"));
        voyages.add(new Voyage("V6","Hong Kong", "Los Angeles", "01/01/2022", "01/20/2022"));
        voyages.sort(new Comparator<Voyage>() {
            @Override
            public int compare(Voyage o1, Voyage o2) {
                if (o1.departureTime.getTime() < o2.departureTime.getTime()) {
                    return 1;
                } else if (o1.departureTime.getTime() > o2.departureTime.getTime()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        // book_order(Order("Shanghai", "New York", "01/01/2022", "01/31/2023")) -> V1
        var order = new Order("Shanghai", "New York", "01/01/2022", "01/31/2023");
        var voyage = order.book(voyages);

        System.out.println(voyage.id);
        Assertions.assertNotNull(voyage);
    }
}
