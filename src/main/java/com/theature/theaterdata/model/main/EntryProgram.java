package com.theature.theaterdata.model.main;

import java.util.List;
import java.util.Scanner;

import com.theature.theaterdata.model.PartyRequest;
import com.theature.theaterdata.model.TheaterLayout;
import com.theature.theaterdata.model.algo.TheaterSeatingSearch;

public class EntryProgram {

	public static void main(String[] args) throws Exception {

		String line;
		StringBuilder layout = new StringBuilder();
		StringBuilder ticketRequests = new StringBuilder();
		boolean isLayoutFinished = false;

		System.out.println("Please enter TheaterLayout and TicketRequests and then enter 'end'.\n");

		Scanner input = new Scanner(System.in);

		while ((line = input.nextLine()) != null && !line.equals("end")) {
			if (line.length() == 0) {
				isLayoutFinished = true;
				continue;

			}

			if (!isLayoutFinished) {

				layout.append(line + System.lineSeparator());

			} else {

				ticketRequests.append(line + System.lineSeparator());

			}

		}

		input.close();

		TheaterSeatingSearch seatingService = new TheaterSeatingSearch();

		try {

			TheaterLayout theaterLayout = seatingService.getTheaterLayout(layout.toString());

			List<PartyRequest> requests = seatingService.getTicketRequests(ticketRequests.toString());

			seatingService.processTicketRequests(theaterLayout, requests);

		} catch (NumberFormatException nfe) {

			System.out.println(nfe.getMessage());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
