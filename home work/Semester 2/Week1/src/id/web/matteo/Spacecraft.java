package id.web.matteo;

import java.util.LinkedList;
import java.util.List;

class Spacecraft {
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	private String name;
    private String type;
    private double speed;
    private double capacity;

    public Spacecraft(String name, String type, double speed, double capacity) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void launch() {
        System.out.println("Spacecraft " + name + " is launching!");
    }
}
