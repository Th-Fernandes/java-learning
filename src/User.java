public class User {
    private String firstName, lastName;

    public String getFullName() {
        return String.join(" ", firstName, lastName);
    }
    public void setName(String firstName, String lastName) {
        throwEmptyInputsError(firstName, lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    private void throwEmptyInputsError(String firstName, String lastName) {
        boolean hasEmptyInputs = firstName.isEmpty() || lastName.isEmpty();
        if (hasEmptyInputs) throw new IllegalArgumentException("Inputs must not be empty");
    }
}
