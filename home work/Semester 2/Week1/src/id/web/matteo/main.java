package id.web.matteo;

public class main {
	public class Main {
	    public static void main(String[] args) {
	        Spacecraft shuttle = new Spacecraft("Space Shuttle", "Orbiter", 25000, 2000);
	        Spacecraft satellite = new Spacecraft("Communication Satellite", "Satellite", 15000, 500);

	        Astronaut astronaut1 = new Astronaut("John Doe", "Commander", "Astrophysics");
	        Astronaut astronaut2 = new Astronaut("Jane Smith", "Engineer", "Mechanical Engineering");

	        Astronaut[] crew = {astronaut1, astronaut2};
	        SpaceMission mission = new SpaceMission("Operation Martian", 10);
	        
	        astronaut1.performEVA();
	        
	        mission.planMission();

	        mission.assignCrew();

	        mission.executeMission();

	        shuttle.launch();
	    }
	}
}