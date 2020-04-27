/************************************************************************
 * Write a program to simulate the following experiment. You have 100   *
 * closed lockers. Start with the first locker and for every locker     *
 * open it. Now, starting with the second locker, for this locker       *
 * and every second locker after that, if the locker is open,           *
 * close it; if it is closed, open it. Then, starting with the          *
 * third locker, for this locker and every third locker after that,     *
 * if the locker is open, close it; if it is closed, open it.           *
 * Continue with the nth locker changing the “position” of every        *
 * nth locker until n = 100. Print out the locker numbers that          *
 * remain open. What do you notice about the lockers                    *
 * that remain open?                                                    *
 ************************************************************************
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * *    PSEUDOCODE   * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *  Start
 *  declare array of lockers with length of hundred
 *  declare and initialize integer variable n to store length of the array
 *  // close all lockers (step number = 0)
 * 	    FOR LOOP (index from zero to less than hundred)
 * 		    assign each looker to store the string "CLOSED"
 * 	    END LOOP
 *  // open all lockers (step number = 1)
 * 	    FOR LOOP (index from zero to less than hundred)
 * 		    assign each looker to store the string "OPEN"
 * 	    END LOOP
 *  // from step number 2 to less than hundred
 * 	    FOR LOOP1 (index from two up to hundred)
 * 		    FOR LOOP2 (index from one less than the outer for loop till the array length)
 * 			    IF (locker of current array is "OPEN")
 * 				    swap locker to "CLOSE"
 * 			    ELSE
 * 				    assign locker to "OPEN"
 * 			    END IF
 * 		    END FOR LOOP2
 * 	    END FOR LOOP1
 * // OUTPUT
 * 	    FOR LOOP (for index from zero to one less than length of the array)
 * 		    IF (lockers of the current index equals to "OPEN"
 * 			    print "L" concatenated (index plus one)
 * 		    END IF
 * 	    END FOR LOOP
 * end
 *
 * * * * * * * * * * * * *    OUTPUT   * * * * * * * * * * * * * * *
 *
 *  L1 L4 L9 L16 L25 L36 L49 L64 L81 L100
 *
 * * * * * * * * * * * * *    OBSERVATION   * * * * * * * * * * * *
 *
 *  The locker numbers are noticed to be squares of {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.
 *
 *  Thank You!
 *
 * */
public class LockerProblem100 {

    // start main() method
    public static void main(String[] args) {

        // INPUT
        // declare lockers[] array
        String[] lockers = new String[100];
        int n = lockers.length;

        // PROCESS

        // initially all lockers were closed
        for (int i = 0; i < n; i++) {
            lockers[i] = "CLOSED";
        }

        // open all lockers strating from the first
        for (int i = 0; i < n; i++) {
            lockers[i] = "OPEN";
        }

        // calculate in a general processing formula
        for (int i = 2; i <= n; i++) {
            for (int j = i - 1; j < n; j += i) {
                if (lockers[j].equals("OPEN")) {
                    lockers[j] = "CLOSE";
                } else {
                    lockers[j] = "OPEN";
                }
            }
        }

        // OUTPUT
        for (int i = 0; i < n; i++) {
            if (lockers[i].equals("OPEN")) {
                System.out.printf("L%d ", (i + 1));
            }
        }
    }   // end of main()
}   // end of class