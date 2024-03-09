public class TestClass {

	public static void main(String[] args) {
		Instructors i1 = new Instructors("Instructor 1", 003, 5, 2000, "305 ET Road ");
		Instructors i2 = new Spartans("Spartan 1", 021, 7, 4000, "Mahatma Gandhi Road");
		Instructors i3 = new Athenians("Athenian 1", 11, 4, 3000, "Front of Jubli hils");

		//System.out.println("Output:");
		//System.out.println(i1);
		//System.out.println(i2);
		//System.out.println(i3);
		
		double totalBudget = i1.getBudget()+i2.getBudget()+i3.getBudget();
		System.out.println("Total teaching budget allocation for each teacher $"+totalBudget);

		System.out.println();
		System.out.println("Location areas for instructors-");
		for(int i=0; i<Instructors.locations.length; i++)
		{
			System.out.println(Instructors.locations[i] + " " + Instructors.locationsDetails[i]);
		}
		
		System.out.println();
		System.out.println("Level of knowledge-");
		for(String level : Instructors.knowledgeLevels)
		{
			System.out.println(level);
		}
		
		System.out.println();
		System.out.println("Teaching materials needed-");
		for(String material : Instructors.teachingMaterials)
		{
			System.out.println(material);
		}
		
	}

}