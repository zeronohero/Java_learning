package id.web.matteo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SpaceMission {
    private String missionName;
    private int durationInDays;
    private Spacecraft assignedSpacecraft;
    private List<Astronaut> crew;

    public SpaceMission(String missionName, int durationInDays) {
        this.missionName = missionName;
        this.durationInDays = durationInDays;
        this.crew = new LinkedList<>();
    }

    public void addAstronaut(Astronaut astronaut) {
        if (!crew.contains(astronaut)) {
            crew.add(astronaut);
            System.out.println(astronaut.getName() + " added to Mission " + missionName);
        } else {
            System.out.println(astronaut.getName() + " is already part of the crew.");
        }
    }

    public void removeAstronautByName(String astronautName) {
        crew.removeIf(astronaut -> astronaut.getName().equals(astronautName));
        System.out.println(astronautName + " removed from Mission " + missionName);
    }

    public void assignSpacecraft(Spacecraft spacecraft) {
        if (spacecraft.getCapacity() >= crew.size()) {
            assignedSpacecraft = spacecraft;
            System.out.println("Spacecraft " + spacecraft.getName() + " assigned to Mission " + missionName);
        } else {
            System.out.println("Spacecraft capacity is insufficient for the crew size.");
        }
    }

    public void planMission() {
        System.out.println("Mission " + missionName + " is being planned.");
        // Implement mission planning logic here
    }

    public void assignCrew() {
        System.out.println("Assigning crew to Mission " + missionName);
        // Implement crew assignment logic here
    }

    public void executeMission() {
        System.out.println("Executing Mission " + missionName);
        // Implement mission execution logic here
    }

    public void communicate() {
        System.out.println("Communicating during Mission " + missionName);
        // Implement communication logic here
    }

    public void land() {
        System.out.println("Spacecraft " + assignedSpacecraft.getName() + " is landing.");
        // Implement landing logic here
    }
}