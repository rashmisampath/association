package associations;

public class results {
	int RegNo;
	String Name;
	int TotMarks;
    Marks m;
    
	public void display(int RegNo,String Name,int TotMarks,Marks m) {
		System.out.println("REGNO       : "+RegNo);
		System.out.println("Name        : "+Name);
		System.out.println("TOTAL MARKS : "+TotMarks);
		System.out.println("MARKS       : "+m.physics+ " " +m.chemistry+ " " +m.maths);
	}

}
