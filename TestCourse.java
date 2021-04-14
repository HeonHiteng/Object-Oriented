
public class TestCourse {

	public static void main(String[] args) {
		
		//Create course
		Course course1 = new Course("Programming II ");
		Course course2 = new Course("Database System ");
		Course course3 = new Course("Multimedia Technology");
	
		
		//Create student in course 1 
		course1.addStudent("Siti Aminah Muhammad");
		course1.addStudent("Halim Zainal Abidin");
		course1.addStudent("Jason Lim");
		course1.addStudent("Heon Hi Teng");
		course1.addStudent("Yu Jia Yi");
		course1.addStudent("Nurul Izzah");
		
		//Create student in course 2
		course2.addStudent("Fatimah Ahmad");
		course2.addStudent("Sarah Goh");
		course2.addStudent("Jason Tan");
		course2.addStudent("Emily Wong");
		course2.addStudent("Kelvin Yee");
		course2.addStudent("Chia Ting Wei");
		
		//Create student in course 3
		course3.addStudent("Nabilah");
		course3.addStudent("Aimah");
		course3.addStudent("Chong Jia Yi");
		course3.addStudent("Justin Wong");
		course3.addStudent("Ben Leong");
		course3.addStudent("Muhamad");
		course3.addStudent("Daphane");
		
		//Display Course 1 List
		System.out.println("Number of student in "+ course1.getName()+ "course : " + course1.getNumberOfStudents());
		String[] students= course1.getStudents();
		for(int i = 0 ; i< course1.getNumberOfStudents();i++) {
			System.out.println(i+1 +"." + students[i]);	
		}
		
		//Display Course 2 List
		System.out.println("\nNumber of student in "+ course2.getName()+ "course : " + course2.getNumberOfStudents());
		String[] students1= course2.getStudents();
		for(int i = 0 ; i< course2.getNumberOfStudents();i++) {
			System.out.println(i+1 +"." + students1[i]);
		}
		
		//Display Course 1 List
				System.out.println("\nNumber of student in "+ course3.getName()+ "course : " + course3.getNumberOfStudents());
				String[] student2= course3.getStudents();
				for(int i = 0 ; i< course3.getNumberOfStudents();i++) {
					System.out.println(i+1 +"." + student2[i]);	
				}
	}

}
