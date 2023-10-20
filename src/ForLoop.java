public class ForLoop {
    public static void main(String[] args) {
        String[] characters = { "pyke", "blitzcrank", "nautilus" };

        for(int i = 0; i < characters.length; i++)
            System.out.println(characters[i]);


        /* For-Each Loop */
        for(String character : characters)
            System.out.println(character);

        /* it throws 'infinite loop' as output
        for (;;)
            System.out.println("infinitive loop");
        */
    }
}
