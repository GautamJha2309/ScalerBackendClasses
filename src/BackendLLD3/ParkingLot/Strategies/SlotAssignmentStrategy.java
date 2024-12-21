package BackendLLD3.ParkingLot.Strategies;

import BackendLLD3.ParkingLot.models.ParkingLot;
import BackendLLD3.ParkingLot.models.ParkingSlot;
import BackendLLD3.ParkingLot.models.VehicleType;

public interface SlotAssignmentStrategy {
    ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
