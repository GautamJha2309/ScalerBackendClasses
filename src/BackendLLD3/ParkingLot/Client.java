package BackendLLD3.ParkingLot;

import BackendLLD3.ParkingLot.Controller.TicketController;
import BackendLLD3.ParkingLot.DTOs.IssueTicketRequestDTO;
import BackendLLD3.ParkingLot.DTOs.IssueTicketResponseDTO;
import BackendLLD3.ParkingLot.DTOs.ResponseStatus;
import BackendLLD3.ParkingLot.Repositories.GateRepository;
import BackendLLD3.ParkingLot.Repositories.TicketRepository;
import BackendLLD3.ParkingLot.Repositories.VehicleRepository;
import BackendLLD3.ParkingLot.Services.TicketService;
import BackendLLD3.ParkingLot.models.VehicleType;

import java.util.Scanner;

public class Client {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        all of this is managed by frameworks
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setVehicleType(VehicleType.THREE_WHEELER);
        request.setGateId(1);
        request.setVehicleNumber("DL 1VC 0324");
        request.setOwnerName("Mohit Sharma");

        IssueTicketResponseDTO response = ticketController.issueTicket(request);
        if(response.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println(response.getTicketId());
        } else {
            System.out.println(response.getFailureMessage());
        }


    }
}
