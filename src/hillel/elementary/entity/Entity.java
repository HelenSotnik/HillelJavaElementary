package hillel.elementary.entity;

public class Entity {
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
    private Role role;

    public Entity(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return firstName + "\n"
                + lastName + "\n"
                + age + "\n"
                + email + "\n"
                + password + "\n"
                + role + "\n";
    }
}
