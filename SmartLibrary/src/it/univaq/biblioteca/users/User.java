package it.univaq.biblioteca.users;


public class User {
	
	// Class properties
	static private long ID_source = 0;
	
	// User IDs
	private long ID; 
	private String type; // (“studente”, “docente”, “esterno”) TODO - change with enumeration

	// Personal Data
	private String name;
	private String surname;
	private String birthDate; // TODO - convert to Date Object
	private String taxCode;
	private boolean bioGender;
	private String gender;
	private String phoneNumber; // can be shared among family
	private String mobileNumber; // personal mobile number
	private String email;

	// Money
	private float budget;
	private short feePlan;
	private short creditScore; // can be the same in the same family
	
	// Registration
	private String registrationDate; // TODO - convert to Date object
	
	
	private void id_set() {
		this.ID = User.ID_source;
		User.ID_source+= 2;
	}
	
	private void data_set(String type, String name, String surname, String birthDate, String taxCode,
			boolean bioGender, String gender, String phoneNumber, String mobileNumber, String email, float budget,
			short feePlan, short creditScore) {
		this.id_set();
		this.type = type;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.taxCode = taxCode;
		this.bioGender = bioGender;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.budget = budget;
		this.feePlan = feePlan;
		this.creditScore = creditScore;
	}
	
	
	
	
	/**
	 * @param iD
	 * @param type
	 * @param name
	 * @param surname
	 * @param birthDate
	 * @param taxCode
	 * @param bioGender
	 * @param gender
	 * @param phoneNumber
	 * @param mobileNumber
	 * @param email
	 * @param budget
	 * @param feePlan
	 * @param creditScore
	 */
	@Deprecated
	public User(long iD, String type, String name, String surname, String birthDate, String taxCode, boolean bioGender,
			String gender, String phoneNumber, String mobileNumber, String email, float budget, short feePlan,
			short creditScore) {
		super();
		this.data_set(type, name, surname, birthDate, taxCode, bioGender, gender, phoneNumber, mobileNumber, email, budget, feePlan, creditScore);
	}




	/**
	 * @param iD
	 * @param type
	 * @param name
	 * @param surname
	 * @param birthDate
	 * @param taxCode
	 * @param bioGender
	 * @param gender
	 * @param phoneNumber
	 * @param mobileNumber
	 * @param email
	 * @param budget
	 * @param feePlan
	 * @param creditScore
	 */	
	public User(String type, String name, String surname, String birthDate, String taxCode,
			boolean bioGender, String gender, String phoneNumber, String mobileNumber, String email, float budget,
			short feePlan, short creditScore) {
		super();
		this.data_set(type, name, surname, birthDate, taxCode, bioGender, gender, phoneNumber, mobileNumber, email, budget, feePlan, creditScore);
	}
	/**
	 * This is used for registering a member of the same family of another registered user
	 * 
	 * @param type
	 * @param name
	 * @param birthDate
	 * @param taxCode
	 * @param bioGender
	 * @param gender
	 * @param mobileNumber
	 * @param email
	 * @param budget
	 * @param feePlan
	 * @param user
	 */
	public User(String type, String name, String birthDate, String taxCode, boolean bioGender, String gender,
			String mobileNumber, String email, float budget, short feePlan, User user) {
		super();
		this.id_set();
		this.type = type;
		this.name = name;
		this.birthDate = birthDate;
		this.taxCode = taxCode;
		this.bioGender = bioGender;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.budget = budget;
		this.feePlan = feePlan;
		// given by another member of the family
		this.surname = user.surname;
		this.phoneNumber = user.phoneNumber;
		this.creditScore = user.creditScore;
	}
	/**
	 * @return the iD
	 */
	public long getID() {
		return ID;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}
	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	/**
	 * @return the bioGender
	 */
	public boolean isBioGender() {
		return bioGender;
	}
	/**
	 * @param bioGender the bioGender to set
	 */
	public void setBioGender(boolean bioGender) {
		this.bioGender = bioGender;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the budget
	 */
	public float getBudget() {
		return budget;
	}
	/**
	 * @param budget the budget to set
	 */
	public void setBudget(float budget) {
		this.budget = budget;
	}
	/**
	 * @return the feePlan
	 */
	public short getFeePlan() {
		return feePlan;
	}
	/**
	 * @param feePlan the feePlan to set
	 */
	public void setFeePlan(short feePlan) {
		this.feePlan = feePlan;
	}
	/**
	 * @return the creditScore
	 */
	public short getCreditScore() {
		return creditScore;
	}
	/**
	 * @param creditScore the creditScore to set
	 */
	public void setCreditScore(short creditScore) {
		this.creditScore = creditScore;
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", type=" + type + ", name=" + name + ", surname=" + surname + ", birthDate="
				+ birthDate + ", taxCode=" + taxCode + ", bioGender=" + bioGender + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + ", budget="
				+ budget + ", feePlan=" + feePlan + ", creditScore=" + creditScore + "]";
	}
	
	
	
	
	
}