import java.util.ArrayList;

public class Appointment {

	private int days;
	// private String date;
	// private String time;
	// private Vehicle vehicle;
	// private Customer customer; // οι παραπάνω ιδιότητες χρησιμοποιήθηκαν στο
	// class diagram για την διαμόρφωση μιας κλάσης ραντεβού στην οποία θα εμφάνιζε
	// περισσότερες λεπτομέρειες με την χρήση gui
	ArrayList<RepairType> repairs = new ArrayList<>();
	ArrayList<Parts> usedParts = new ArrayList<>();

	public Appointment(int day) {
		super();
		this.days = day;
	}

	public void addRepair(RepairType aRepair) {
		repairs.add(aRepair);
	}

	public void addParts(Parts aPart, int num) {

		for (int i = 0; i < num; i++) {
			usedParts.add(aPart);
		}
	}

	public void printData() {

		System.out.println("Μέρες επισκευής: " + days + getTotalCost() + "€");

	}

	public double getTotalCost() {

		double sum = 0;

		for (RepairType repair : repairs) {
			sum += repair.getPrice();
		}

		for (Parts part : usedParts) {
			sum += part.getPrice();
		}

		return sum;
	}

}