package id.web.matteo;


class Astronaut {
    private String name;
    private String rank;
    private String specialization;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Astronaut(String name, String rank, String specialization) {
        this.name = name;
        this.rank = rank;
        this.specialization = specialization;
    }

    public void performEVA() {
        System.out.println("Astronaut " + name + " is performing an EVA.");
    }
}
