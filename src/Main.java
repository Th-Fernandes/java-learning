public class Main {
    public static void main(String[] args) {
      printSamples();
    }

    private static void printSamples() {
        printUserFullName();
        printSquareNumbers();
    }

    private static void printUserFullName() {
        User user =  new User();
        user.setName(getUserFullName());

        System.out.println(user.getFullName());
    }

    private static PersonName getUserFullName() {
        PersonName name = new PersonName();

        name.first = "Thiago";
        name.last = "Fernandes";

        return name;
    }
    private static void printSquareNumbers() {
        MethodOverLoading x = new MethodOverLoading();
        System.out.println(x.getSquare(3));
        System.out.println(x.getSquare(34.5f));
    }

}

