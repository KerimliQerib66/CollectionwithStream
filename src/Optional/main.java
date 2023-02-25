package Optional;

import java.util.Optional;

public class main {

	public static void main(String[] args) {
		Optional<String> email=Optional.of("qeribkerimli99@gmail.com");
		Optional<String> phone=Optional.of("50-870-44-99");
      Student s1=new Student(1,"Qerib",email,phone);
      
      
      Optional<String> email2=Optional.empty();
		Optional<String> phone2=Optional.empty();
      Student s2=new Student(2,"Serxan",email2,phone2);
      
      ispresent(s1);
      
      ispresent(s2);
      
   

}
	public static void ispresent(Student student) {
      
      if(student.getEmail().isPresent()) {
    	  System.out.println(student.getEmail().orElse("bosdu"));
      }
      else {
    	  System.out.println("deyer yoxdur");
      }
	}
}
