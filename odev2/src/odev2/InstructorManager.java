package odev2;

public class InstructorManager extends UserManager{
	  public void Add(Instructor instructor) {
		  System.out.println("Instructor i�in i� kodlar� �al��t� : " + instructor.getName());
		  super.Add(instructor);
	  }
	  public void Remove(Instructor instructor) {
		  System.out.println("Instructor i�in i� kodlar� �al��t� : " + instructor.getName());
		  super.Remove(instructor);
	  }
}
