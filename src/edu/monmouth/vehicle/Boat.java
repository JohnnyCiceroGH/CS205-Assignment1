package edu.monmouth.vehicle;

public class Boat implements Vehicle {
    private PowerTypes powerType;
    private int boatLength;

    public Boat(PowerTypes powerType, int boatLength)
            throws BoatException {
        setPowerType(powerType);
        setBoatLength(boatLength);
    }

    @Override
    public PowerTypes getPowerType() {
        return powerType;
    }

    @Override
    public void setPowerType(PowerTypes powerType) {
        this.powerType = powerType;
    }

    public int getBoatLength() {
        return boatLength;
    }

    public void setBoatLength(int boatLength) throws BoatException {
        if (boatLength < VehicleConstants.MIN_BOAT_LENGTH
                || boatLength > VehicleConstants.MAX_BOAT_LENGTH) {
            throw new BoatException(
                "Invalid boat length: " + boatLength
                + ". Boat length must be between "
                + VehicleConstants.MIN_BOAT_LENGTH + " and "
                + VehicleConstants.MAX_BOAT_LENGTH + "."
            );
        }

        this.boatLength = boatLength;
    }

    @Override
    public String toString() {
        return "Boat [powerType=" + powerType
                + ", boatLength=" + boatLength + "]";
    }
}