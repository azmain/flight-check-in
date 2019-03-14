package io.azmain.flightcheckin.controller;

import io.azmain.flightcheckin.integration.ReservationRestClient;
import io.azmain.flightcheckin.integration.dto.Reservation;
import io.azmain.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckInController {


    @Autowired
    ReservationRestClient restClient;


    @RequestMapping("/startCheckIn")
    public Reservation startCheckIn(@RequestParam("reservationId") Long reservationId){
        Reservation reservation = restClient.findReservation(reservationId);

        return  reservation;
    }

    @RequestMapping("/completeCheckIn")
    public Reservation completeCheckIn(@RequestParam("reservationId") Long reservationId,
                                       @RequestParam("numberOfBags") int numberOfBags){

        ReservationUpdateRequest updateReservation = new ReservationUpdateRequest();
        updateReservation.setId(reservationId);
        updateReservation.setCheckedIn(true);
        updateReservation.setNumberOfBags(numberOfBags);
        Reservation reservation = restClient.updateReservation(updateReservation);

        return reservation;

    }

}
