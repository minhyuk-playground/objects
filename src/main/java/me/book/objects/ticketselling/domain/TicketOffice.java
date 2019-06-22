package me.book.objects.ticketselling.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Minhyuk Yoon (ymh92730@gmail.com)
 * @since 2019-06-23
 */
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}