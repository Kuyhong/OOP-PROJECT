package user;

public abstract class Account implements IAccount {
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	private int accountID;
	private static int accountCounter = 0;

	public Account (String name, String email, String password, String phoneNumber) {
		setName(name);
		setEmail(email);
		setPassword(password);
		setPhoneNumber(phoneNumber);
		this.accountID = ++accountCounter;
	}

	@Override
	public String toString() {
		return "Name: " + name + 
			   "\nEmail: " + email + 	
			   "\nPhone Number: " + phoneNumber;
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Account other = (Account) obj;
        return this.email.equals(other.email);
    }

	// Getters
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	protected String getPassword() {
		return password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	// Setters
	public void setName(String name){
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Name cannot be empty.");
		}
	}

	public void setEmail(String email) {
		if (email != null && !email.isEmpty() && email.contains("@")) {
			this.email = email;
		} else {
			System.out.println("Invalid email.");
		}
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber != null && (phoneNumber.length() == 9 || phoneNumber.length() == 10) && phoneNumber.matches("\\d+")) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Phone number must be 9 or 10 digits.");
		}
	}

	public void setPassword(String password) {
		if (password != null && password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$")) {
			this.password = password;
			System.out.println("Your Password is set successfully.");
		} else {
			System.out.println("Your Password must be at least 8 characters, including uppercase, lowercase and number.");
		}
	}

	// IAccount methods
	@Override
	public boolean login(Object user) {
		if (this.equals(user)) {
			System.out.println("Login successful!");
			return true;
		}

		if (isValidEmailFormat(email) && isValidPasswordFormat(password)) {
			System.out.println("Invalid email or password.");
		}
		return false;
	}

	private boolean isValidEmailFormat(String email) {
		return email != null && !email.isEmpty() && email.contains("@");
	}

	private boolean isValidPasswordFormat(String password) {
		return password != null && password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
	}

	@Override
	public void logout() {
		System.out.println("Logout successful!");
	}

	@Override
	public boolean register(String name, String email, String password, String phoneNumber) {
		if (name != null && !name.isEmpty() && 
			email != null && !email.isEmpty() && email.contains("@") && 
			password != null && password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$") && 
			phoneNumber != null && (phoneNumber.length() == 9 || phoneNumber.length() == 10) && phoneNumber.matches("\\d+")) {
			System.out.println("Registration successful!");
			return true;
		} else {
			System.out.println("Invalid registration details. Please try again.");
			return false;
		}
	}

	public abstract boolean can(String action);
}
