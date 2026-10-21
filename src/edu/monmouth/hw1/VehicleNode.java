package edu.monmouth.hw1;

import edu.monmouth.vehicle.Vehicle;

public class VehicleNode 
{
    private Vehicle vehicle;
    private VehicleNode next;

    public VehicleNode(Vehicle vehicle) 
    {
        this(vehicle, null);
    }

    public VehicleNode(Vehicle vehicle, VehicleNode next) 
    {
        this.vehicle = vehicle;
        this.next = next;
    }

    public Vehicle getVehicle() 
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) 
    {
        this.vehicle = vehicle;
    }

    public VehicleNode getNext() 
    {
        return next;
    }

    public void setNext(VehicleNode next) 
    {
        this.next = next;
    }
}
