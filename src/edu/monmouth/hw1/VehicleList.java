package edu.monmouth.hw1;

import edu.monmouth.vehicle.Vehicle;

public class VehicleList 
{
    private VehicleNode head;
    private VehicleNode tail;
    private int count;

    public VehicleList() 
    {
        head = null;
        tail = null;
        count = 0;
    }

    public void insert(Vehicle vehicle) 
    {
        VehicleNode node = new VehicleNode(vehicle, head);
        head = node;

        if (tail == null) 
        {
            tail = node;
        }

        count++;
    }

    public Vehicle first() 
    {
        if (head == null) {
            return null;
        }

        return head.getVehicle();
    }

    public Vehicle last() 
    {
        if (tail == null) 
        {
            return null;
        }

        return tail.getVehicle();
    }

    public Vehicle removeFirst() 
    {
        if (head == null) {
            return null;
        }

        Vehicle removed = head.getVehicle();
        head = head.getNext();
        count--;

        if (head == null) 
        {
            tail = null;
        }

        return removed;
    }

    public void insertEnd(Vehicle vehicle) 
    {
        VehicleNode node = new VehicleNode(vehicle);

        if (tail == null) 
        {
            head = node;
            tail = node;
        } else 
        {
            tail.setNext(node);
            tail = node;
        }

        count++;
    }

    public boolean isEmpty() 
    {
        return head == null;
    }

    public int size() 
    {
        return count;
    }

    @Override
    public String toString() 
    {
        StringBuilder result = new StringBuilder();
        VehicleNode current = head;

        while (current != null) 
        {
            result.append(current.getVehicle());
            current = current.getNext();

            if (current != null) 
            {
                result.append(System.lineSeparator());
            }
        }

        return result.toString();
    }
}