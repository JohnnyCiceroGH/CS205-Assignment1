package edu.monmouth.vehicle;

public class Car implements Vehicle 
{
    private PowerTypes powerType;
    private int engineSize;

    public Car(PowerTypes powerType, int engineSize) throws CarException 
    {
        setPowerType(powerType);
        setEngineSize(engineSize);
    }

    @Override
    public PowerTypes getPowerType() 
    {
        return powerType;
    }

    @Override
    public void setPowerType(PowerTypes powerType) 
    {
        this.powerType = powerType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) throws CarException 
    {
        if (engineSize < VehicleConstants.MIN_ENGINE_SIZE
                || engineSize > VehicleConstants.MAX_ENGINE_SIZE) 
        {
            throw new CarException(
                "Invalid engine size: " + engineSize
                + ". Engine size must be between "
                + VehicleConstants.MIN_ENGINE_SIZE + " and "
                + VehicleConstants.MAX_ENGINE_SIZE + "."
            );
        }

        this.engineSize = engineSize;
    }

    @Override
    public String toString() 
    {
        return "Car [powerType=" + powerType
                + ", engineSize=" + engineSize + "]";
    }
}