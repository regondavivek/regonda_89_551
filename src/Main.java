import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date d=new Date();
		
		Student[] stud=new Student[10];
		for(int i=0;i<stud.length;i++){
			stud[i]=new Student(i,"name",d,i+50);
		}

		StudentGroup sg=new StudentGroup(stud.length);
		sg.setStudents(stud);
		sg.addFirst(new Student(-1,"abdul",d,20));
		//sg.remove(5);
		//System.out.println(sg.getStudent(1).getId());
		sg.printStudents();


	}

}
