package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private double bearBucksBalance;
	
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;

	}

	public String getFullName() {
		return firstName + " " + lastName;	
	}

	public int getId() {
		return id;
	}

	public void depositBearBucks(double amount) {
		bearBucksBalance += amount;	
	}

	public double getBearBucksBalance() {
		return bearBucksBalance;
	}
}
