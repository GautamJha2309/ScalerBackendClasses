package BackendLLD3.ParkingLot.Controller;

import BackendLLD3.ParkingLot.DTOs.IssueTicketRequestDTO;
import BackendLLD3.ParkingLot.DTOs.IssueTicketResponseDTO;
import BackendLLD3.ParkingLot.DTOs.ResponseStatus;
import BackendLLD3.ParkingLot.Services.TicketService;
import BackendLLD3.ParkingLot.models.Ticket;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        try {
            Ticket ticket = ticketService.issueTicket(
                    request.getGateId(),
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType()
            );
            response.setTicketId(ticket.getId());
            response.setSlotNumber(ticket.getParkingSlot().getSlotNumber());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }

        return response;
    }
}

// controller => service

// client -> request -> contain some data
// response

// Response
// DTO : Data transfer Object
// ticketId
// slotNumber
// responseStatus : SUCCESS / FALIURE
// failureMessage

