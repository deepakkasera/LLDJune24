package org.example.parkinglot.controlllers;

import org.example.parkinglot.dtos.IssueTicketRequestDto;
import org.example.parkinglot.dtos.IssueTicketResponseDto;
import org.example.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        return null;
    }
}
