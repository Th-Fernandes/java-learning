public class Main {
    public static void main(String[] args) {
      User user =  new User();
      user.setName("Joseph", "Brown");
      System.out.println(user.getFullName());
    }
}
 class User {
    private String firstName;
    private String lastName;

     public String getFullName() {
         return String.join(" ", firstName, lastName);
     }
    public void setName(String firstName, String lastName) {
         throwEmptyInputsError(firstName, lastName);

         this.firstName = firstName;
         this.lastName = lastName;
    }

    private void throwEmptyInputsError(String firstName, String lastName) {
         boolean hasEmptyInputs = firstName.length() <= 0 || lastName.length() <= 0;
         if (hasEmptyInputs) throw new IllegalArgumentException("Inputs must not be empty");
    }
}

