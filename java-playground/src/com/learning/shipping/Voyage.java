package com.learning.shipping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Voyage {
    private static final String DATE_FORMAT = "dd/mm/yyyy";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    String id;
    String origin;
    String dest;
    Date departureTime;
    Date arrivalTime;

    public Voyage(String id, String origin, String dest, String departureTime, String arrivalTime) throws ParseException {
        this.id = id;
        this.origin = origin;
        this.dest = dest;
        this.departureTime = dateFormat.parse(departureTime);
        this.arrivalTime = dateFormat.parse(arrivalTime);
    }

    public boolean isValidOrder(Order order) {
        // dropOffDate BEFORE departureTime
        // targetDeliveryDate AFTER arrivalTime
        return this.origin.equals(order.origin) && this.dest.equals(order.dest)
                && order.dropoffDate.getTime() < this.departureTime.getTime()
                && order.targetDeliveryDate.getTime() > this.arrivalTime.getTime();
    }
}
