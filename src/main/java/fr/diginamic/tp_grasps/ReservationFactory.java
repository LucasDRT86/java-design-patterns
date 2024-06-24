package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

public class ReservationFactory {

	public static Reservation getInstance(LocalDateTime dateRes, int nbPlace, Client client ) {
		Reservation res = new Reservation(dateRes);
		res.setDate(dateRes);
		res.setClient(client);
		return res;
	};
}
