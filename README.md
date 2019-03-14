## Flight Check In Application

This application is a integration layer of Flight 
Reservation Application.
It searches flight reservations & 
updates check in status using rest template by 
calling the services of flight reservations.

* Check flight reservations.
```
http://localhost:9090/flightcheckin/
startCheckIn?reservationId=1
```

* Update flight reservations.
```
http://localhost:9090/flightcheckin/
completeCheckIn?reservationId=1&numberOfBangs=7
```

