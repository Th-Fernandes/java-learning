public class User {
    PersonName name = new PersonName();
    public String getFullName() {
        return String.join(" ", name.first, name.last);
    }
    public void setName(PersonName name) {
        throwEmptyInputsError(name);

        this.name.first = name.first;
        this.name.last = name.last;
    }

    private void throwEmptyInputsError(PersonName name) {
        boolean hasEmptyInputs = name.first.isEmpty() || name.last.isEmpty();
        if (hasEmptyInputs)
            throw new IllegalArgumentException("Inputs must not be empty");
    }
}

class PersonName {
    public String first = "", last = "";

}
