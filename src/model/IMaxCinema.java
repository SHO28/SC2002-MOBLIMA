package src.model;

import java.util.ArrayList;
import src.model.enums.*;
import src.database.*;

/**
 * The Class inherited from the Superclass {@link Cinema} that handles the data
 * of IMAX Cinema
 * 
 * @author Lee Juin
 * @version 1.0
 */
public class IMaxCinema extends Cinema {

    /**
     * The price weight of the cinema class
     */
    private double cinemaPrice;

    /**
     * Constructor for IMaxCinema class
     * 
     * @param UUID            is the unique ID in the database
     * @param seats           is all the {@link Seat} instances in the cinema
     * @param numOfRows       is the total number of rows in the cinema
     * @param totalNumOfSeats is the total number of seats in the cinema
     */
    public IMaxCinema(String UUID, ArrayList<Seat> seats, int numOfRows, int totalNumOfSeats) {
        super(UUID, seats, numOfRows, totalNumOfSeats);
        super.setCinemaClass(CinemaClass.IMAX);
        this.setCinemaPrice(Database.PRICES.getDefaultIMaxCinemaPrice());
    }

    /**
     * Sets the price weight of the cinema
     * 
     * @param cinemaPrice is the price weight of the cinema
     */
    public void setCinemaPrice(double cinemaPrice) {
        this.cinemaPrice = cinemaPrice;
    }

    /**
     * Gets the price weight of the cinema
     * 
     * @return The price weight of the cinema
     */
    public double getCinemaPrice() {
        return this.cinemaPrice;
    }
}