public class LockerProblemBookReference {
    public static void main(String[] args) {
                /*
        ASHENAFI PROGRAM ENDS HERE
         */
///////////////////////////////////////////////////////////////////////////////////////////
        String[] lockers = new String[20];

        // Close all the lockers
        openAllLockers(lockers);

        // Invoke the stuentLockerChanges method
        studentLockerChanges(lockers);

        // Display all open lock numbers
        print(lockers);
    }

    /** isOpen returns true if l is the string "OPEN". False otherwise*/
    public static boolean isOpen(String l) {
        return l.equals("OPEN");
    }

    /** closeAllLockers fills the array with the string "CLOSED" */
    public static void openAllLockers(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            lockers[i] = "OPEN";
        }
    }

    /** studentLockerChanges changes the string in each
     *   element from "CLOSED" to "OPEN" or Vice versa */
    public static void studentLockerChanges(String[] lockers) {
        int start = 0; // Locker student begins with

        for (int s = 2; s < 3; s++) {
            for (int l = 1; l < lockers.length; l += s) {
                if (isOpen(lockers[l]))
                    lockers[l] = "CLOSED";
                else
                    lockers[l] = "OPEN";
            }
            start++;
        }
    }

    /** print displays all open locker numbers separated by exactly one space */
    public static void print(String[] lockers) {
        for (int i = 0; i < 20; i++) {
            if (isOpen(lockers[i])) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
        System.out.println();


    }
}
