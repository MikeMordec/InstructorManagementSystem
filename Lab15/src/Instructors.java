class Instructors {
	private String name;
	private int rank;
	private String location;
	private int knowledgeLevel;
	private int budget;
	
	public static String[] locations = {"East","West","North","South"}; 
	public static String[] locationsDetails = {
			"location occupancy for Spartans instructors",
			"location occupancy for Athenian instructors",
			"location for standard instructors",
			"location for standard instructors"}; 	
	public static String[] teachingMaterials = {"Texts","Computers","Software"}; 
	public static String[] knowledgeLevels = {"Begineer","Intermediate","Advanced"}; 
	public Instructors(String name, int rank, int knowledgeLevel, int budget, String location) {
		this.name = name;
		this.setRank(rank);
		this.knowledgeLevel = knowledgeLevel;
		this.budget = budget;

	}

	public Instructors() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String toString() {
		String str = "";
		str += "Type : Instructor\n";
		str += "Name : " + name + "\n";
		str += "Rank : " + rank + "\n";
		str += "Budget : " + budget + "\n";
		return str;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getKnowladgeLavel() {
		return knowledgeLevel;
	}

	public void setKnowledgeLevel(int knowledgeLevel) {
		this.knowledgeLevel = knowledgeLevel;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
}