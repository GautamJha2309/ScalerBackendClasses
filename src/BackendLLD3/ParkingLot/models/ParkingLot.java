package BackendLLD3.ParkingLot.models;

import BackendLLD3.ParkingLot.Strategies.SlotAssignmentStrategy;
import BackendLLD3.ParkingLot.Strategies.SlotAssignmentStrategyFactory;

import java.util.*;

public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private List<VehicleType> vehicleTypes;
    private SlotAssignmentStrategy slotAssignmentStrategy;

    public SlotAssignmentStrategy getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategyType type) {
        this.slotAssignmentStrategy = SlotAssignmentStrategyFactory.getSlotAssignmentStrategyByType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}


// id is going to be a common attribute
// created_at , modified_at