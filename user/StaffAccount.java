package user;

public abstract class StaffAccount extends Account {

    private float salary;
    private String position;

    public StaffAccount(String name, String email, String password, String phoneNumber, float salary, String position) {
        super(name, email, password, phoneNumber);
        setSalaryInternal(salary);
        this.position = position;
    }

    public StaffAccount(Account staffAccount, float salary, String position) {
        super(staffAccount.getName(), staffAccount.getEmail(), staffAccount.getPassword(), staffAccount.getPhoneNumber());
        setSalaryInternal(salary);
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    private void setSalaryInternal(float salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public void updateSalary(float salary, Account requester) {
        if (requester instanceof StaffAccount && ((StaffAccount) requester).getPosition().equalsIgnoreCase("Manager")) {
            setSalaryInternal(salary);
        } else {
            System.out.println("Only manager can change salary.");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract boolean can(String action);
}
