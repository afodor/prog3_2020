public class hello {
	
	private static class PatientHolder {
		String firstName;
		String lastName;
	}
	
	public static void main(String[] args){
		PatientHolder ph1 = new PatientHolder();
		
		ph1.lastName = "Brandon";
		ph1.firstName = "Turner";
		
		System.out.println("Hello world it is 1:37!");
		
	}
}
