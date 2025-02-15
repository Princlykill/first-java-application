package Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import Swing.FormEvent;
import model.AgeCategory;
import model.Database;
import model.EmploymentCategory;
import model.Gender;
import model.Person;

public class Controller {
	Database db = new Database();
	
	public List<Person> getPeople() {
		return db.getPeople();
	}
	
	public void addPerson(FormEvent ev) {
		String name = ev.getName();
		String occupation = ev.getOccupation();
		int ageCatId = ev.getAgeCategory();
		String empCat = ev.getEmploymentCategory();
		boolean NigerianCitizen = ev.isNigerianCitizen();
		String taxID = ev.getTaxID();
		String gender = ev.getGender();
		
		AgeCategory ageCategory = null;
		
		switch(ageCatId) {
		case 0:
		ageCategory = AgeCategory.child;
		break;
		
		case 1:
		ageCategory = AgeCategory.adult;
		break;
		
		case 2:
		ageCategory = AgeCategory.senior;
		break;
		}
		
		EmploymentCategory empCategory;
		
		if(empCat.equals("employed")) {
			empCategory = EmploymentCategory.employed;
		}
		else if(empCat.equals("self-employed")) {
			empCategory = EmploymentCategory.selfEmployed;
		}
		else if(empCat.equals("unemployed")) {
			empCategory = EmploymentCategory.unemployed;
		}
		else {
			empCategory = EmploymentCategory.other;
			System.err.println(empCat);
		}
		
		Gender genderCat;
		
		if(gender.equals("male")) {
			genderCat = Gender.male;
		}
		else {
			genderCat = Gender.female;
		}
		
		Person person = new Person(name, occupation, ageCategory, empCategory, taxID, NigerianCitizen, genderCat);
		
		db.addPerson(person);
	}
	
	public void saveToFile(File file) throws IOException {
		db.saveToFile(file);
	}
	
	public void loadFromFile(File file) throws IOException {
		db.loadFromFile(file);
	}
}
