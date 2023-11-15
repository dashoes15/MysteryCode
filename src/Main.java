public class Main {
    public static void main(String[] args) {

        //declare variables
        String original = "programming is easy";
        String updated = "";
        String capital;

        // adds a space between each letter
        for(int i = 0; i < original.length(); i++){
            if(!original.substring(i, i+1).equals(" ")){
                updated += original.substring(i, i + 1);
            }
        }

        original = updated;
        updated = "";

        // alternates between upper and lower case (every second letter upper)
        for (int i = 1; i <= original.length(); i++) {
            capital = original.substring(i - 1, i);
            if (i % 2 == 0) {
                capital = capital.toUpperCase();
            } else {
                capital = capital.toLowerCase();
            }
            updated += capital + " ";
        }

        original = updated;
        updated = "";

        System.out.println(original);



        //removes every second letter
        while (original.length() > 1) {
            for (int j = 0; j < original.length(); j+=2) {
                updated += original.substring(j, j + 1);
            }
            original = updated;
            updated = "";
            System.out.println(original);
        }
    }
}
