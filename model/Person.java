package model;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 5164063357702948133L;

	private static int count = 0;
	
	private int id;
	private String name;
	private String occupation;
	private AgeCategory ageCategory;
	private EmploymentCategory empCat;
	private String taxID;
	private boolean NigerianCitizen;
	private Gender gender;
	
	public Person(String name, String occupation, AgeCategory ageCategory, 
			EmploymentCategory empCat, String taxID, 
			boolean NigerianCitizen, Gender gender)  {
		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCategory;
		this.empCat = empCat;
		this.taxID = taxID;
		this.NigerianCitizen = NigerianCitizen;
		this.gender = gender;
		
		this.id = count;
		count++;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public AgeCategory getAgeCategory() {
		return ageCategory;
	}
	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}
	public EmploymentCategory getEmpCat() {
		return empCat;
	}
	public void setEmpCat(EmploymentCategory empCat) {
		this.empCat = empCat;
	}
	public String getTaxID() {
		return taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	public boolean isNigerianCitizen() {
		return NigerianCitizen;
	}
	public void setNigerianCitizen(boolean nigerianCitizen) {
		NigerianCitizen = nigerianCitizen;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
