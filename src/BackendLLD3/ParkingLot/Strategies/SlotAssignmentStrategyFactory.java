package BackendLLD3.ParkingLot.Strategies;

import BackendLLD3.ParkingLot.models.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategyByType(SlotAssignmentStrategyType type){
        if(type.equals(SlotAssignmentStrategyType.RANDOM)){
            return new RandomSlotAssignmentStrategy();
        }
        return null;
    }
}