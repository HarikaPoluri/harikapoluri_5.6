package com.cabBooking.model;

public class Taxi {
    private int id;
    private int total_time;
    private Location taxiLocation = null;
    private Location cutomerLocation = null;
    private Location destinationLocation = null;
    private boolean booked;

    public Taxi(int id) {
        taxiLocation = new Location(0, 0);
        cutomerLocation = new Location(0, 0);
        destinationLocation = new Location(0, 0);
        this.id = id;
        booked = false;
        total_time = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal_time() {
        return total_time;
    }

    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }

    public Location getTaxiLocation() {
        return taxiLocation;
    }

    public void setTaxiLocation(Location taxiLocation) {
        this.taxiLocation = taxiLocation;
    }

    public Location getCutomerLocation() {
        return cutomerLocation;
    }

    public void setCutomerLocation(Location cutomerLocation) {
        this.cutomerLocation = cutomerLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(Location destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "Taxi:{" +
                "id:" + id +
                ", taxiLocation:{x:" + taxiLocation.getX() + ",y: " + taxiLocation.getY() + "} " +
                ", cutomerLocation: {x:" + cutomerLocation.getX() + ",y: " + cutomerLocation.getY() + "}" +
                ", destinationLocation: { x:" + destinationLocation.getX() + " , y:" + destinationLocation.getY() + "}" +
                ", booked:" + booked +
                ", bookedTime:" + total_time +
                '}';
    }
}
