public class TableAndChairs {
    public static void main(String[] args) {
     
        for (int i = 0; i < 2; i++) {
            System.out.println("X                                X");
        }

        System.out.println("X       XXXXXXXXXXXXXXXXXX       X");

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("XXXXXX  X                X   XXXXX");
            } else {
                System.out.println("X    X  X                X   X   X");
            }
        }
    }
}
