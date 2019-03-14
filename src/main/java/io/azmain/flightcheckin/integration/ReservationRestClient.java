package io.azmain.flightcheckin.integration;

import io.azmain.flightcheckin.integration.dto.Reservation;
import io.azmain.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

    public Reservation findReservation(Long id);

    public Reservation updateReservation(ReservationUpdateRequest request);
}
