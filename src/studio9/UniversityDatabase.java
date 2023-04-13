package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import assignment7.Student;

public class UniversityDatabase {
	private Map<String, Student> theDatabase;
	
	public UniversityDatabase() {
		theDatabase = new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		theDatabase.put(accountName, student);
		
	}

	public int getStudentCount() {
		return theDatabase.size();
	}

	public String lookupFullName(String accountName) {
		if (theDatabase.containsKey(accountName)) {
			return theDatabase.get(accountName).getFullName();
		}
		else {
			return null;
		}
	}

	public double getTotalBearBucks() {
		double bearBucksCount = 0;
		for (String s : theDatabase.keySet()) {
			bearBucksCount += theDatabase.get(s).getBearBucksBalance();
		}
		return bearBucksCount;
	}
}
