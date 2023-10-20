public class Main {
    public static void main(String[] args) {
      User user =  new User();
      PersonName name = new PersonName();

      name.first = "Thiago";
      name.last = "Fernandes";
      user.setName(name);

      System.out.println(user.getFullName());
      printSquareNumbers();
    }

    private static void printSquareNumbers() {
        MethodOverLoading x = new MethodOverLoading();
        System.out.println(x.getSquare(3));
        System.out.println(x.getSquare(34.5f));
    }

}

