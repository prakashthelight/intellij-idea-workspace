package com.learning.shipping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {
    private static final String DATE_FORMAT = "dd/mm/YYYY";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    String origin;
    String dest;
    Date dropoffDate;
    Date targetDeliveryDate;

    public Order(String origin, String dest, String dropoffDate, String targetDeliveryDate) throws ParseException {
        this.origin = origin;
        this.dest = dest;
        this.dropoffDate = dateFormat.parse(dropoffDate);
        this.targetDeliveryDate = dateFormat.parse(targetDeliveryDate);
    }

    public Voyage book(List<Voyage> voyages) {
        for (Voyage voyage : voyages) {
            if (voyage.isValidOrder(this)) {
                return voyage;
            }
        }

        return null;
    }
}
