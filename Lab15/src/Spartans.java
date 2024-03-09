class Spartans extends Instructors {
	public Spartans() {
	}

	public Spartans(String name, int rank, int knowledgeLevel, int budget, String location) {
		super(name, rank, knowledgeLevel, budget, location);
	}

	public String toString() {
		String str = "";
		str += "Type : Spartan\n";
		str += "Name : " + getName() + "\n";
		str += "Rank : " + getRank() + "\n";
		str += "Budget : " + getBudget() + "\n";
		return str;
	}
}