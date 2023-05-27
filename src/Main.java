import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<RepairType> repairList = new ArrayList<>();
		ArrayList<Parts> partsList = new ArrayList<>();
		ArrayList<Appointment> appointmentsList = new ArrayList<>();
		
		//ergasies episkeuwn
		RepairType ergasiaEpiskeuhs1 = new RepairType("Αλλαγή λαδιών", 20);
		RepairType ergasiaEpiskeuhs2 = new RepairType("Αλλαγή φίλτρου καμπίνας", 5);
		RepairType ergasiaEpiskeuhs3 = new RepairType("Συντήρηση φρένων", 30);
		
		repairList.add(ergasiaEpiskeuhs1);
		repairList.add(ergasiaEpiskeuhs2);
		repairList.add(ergasiaEpiskeuhs3);
		
		//antallaktika
		Parts typosAntallaktikou1 = new Parts("Συσκευασία λαδιών 4lt", 30);
		Parts typosAntallaktikou2 = new Parts("Φίλτρο λαδιού", 20);
		Parts typosAntallaktikou3 = new Parts("Φίλτρο καμπίνας", 30);
		Parts typosAntallaktikou4 = new Parts("Τακάκι φρένων εμπρός τροχού", 5);
		Parts typosAntallaktikou5 = new Parts("Τακάκι φρένων πίσω τροχού", 5);
		Parts typosAntallaktikou6 = new Parts("Υγρό φρένων", 10);
		
		partsList.add(typosAntallaktikou1);
		partsList.add(typosAntallaktikou2);
		partsList.add(typosAntallaktikou3);
		partsList.add(typosAntallaktikou4);
		partsList.add(typosAntallaktikou5);
		partsList.add(typosAntallaktikou6);
		
		//Episkeues
		Appointment episkeuh1 = new Appointment(1);
		episkeuh1.addRepair(ergasiaEpiskeuhs2);
		episkeuh1.addParts(typosAntallaktikou1, 1);
		episkeuh1.addParts(typosAntallaktikou2, 1);
		episkeuh1.addParts(typosAntallaktikou3, 1);
		
		Appointment episkeuh2 = new Appointment(2);
		episkeuh2.addRepair(ergasiaEpiskeuhs3);
		episkeuh2.addParts(typosAntallaktikou4, 4);
		episkeuh2.addParts(typosAntallaktikou5, 4);
		episkeuh2.addParts(typosAntallaktikou6, 1);
		
		appointmentsList.add(episkeuh1);
		appointmentsList.add(episkeuh2);
		
		System.out.println("Λίστα Εργασιών Επισκευής");
		for(RepairType repair: repairList) {
			repair.printData();
		}
		
		System.out.println("\nΛίστα Ανταλλακτικών");
		for(Parts part: partsList) {
			part.printData();
		}
		
		System.out.println("\nΛίστα Επισκευών");
		for(Appointment appointment: appointmentsList) {
			appointment.printData();
		}
		
	}

}
