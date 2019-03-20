public class stringFormatting {

    // Inefficient way: bad!
    public static void main(String[] args) {
        String info = "";
        info += "Bob's you're uncle";
        info += " ";
        info += "And so am I.";

        System.out.println(info);

        // The right way; much more memory efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue."); // append method returns a refernce to the sb object
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder("");
        s.append("Go ")
                .append("get ")
                .append("that ")
                .append("bread!");

        System.out.println(s.toString());

        // Multi threaded version, commonly used
        //        StringBuffer...

        System.out.println("\t Here \t you \t go");

        // PRINT FORMATTING!
        System.out.printf("Total Cost: %-10d; Total Quantity: %10d\n", 5, 8);
        for(int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s", i, "Some text here\n");
        }

        // Floating point formatter
        System.out.printf("Total value: %.3f\n", 5.675647586);
        System.out.printf("Total value: %-6.1f\n", 5586.675647586);

        Object obj = new Object();


    }
}
