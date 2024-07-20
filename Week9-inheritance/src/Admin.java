
public class Admin extends Employee{
    private String name;
	public void setName(String str) {
		name=str;
		System.out.println("SetName child");
	}
	private String role;
	public Admin(String r) {
		this.role=r;
	}
	public String getrole() {return role;}
	public void print() {
		
		System.out.println("Name "+getName()+
				"\nGender "+getGender()+
				"\nRole "+getrole());
		System.out.println("this pointer "+this.toString());
		
	}
	
	public static void main(String arg[]) {
		Admin ad=new Admin("Accounts");
		ad.setName("Abdul Qadeer");
		ad.setGender('M');
		ad.print();
		System.out.println("my pointer "+ad.toString());

	}
}
