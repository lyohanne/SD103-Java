public class MyArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        int countdown;
         for (countdown = 10; countdown >= 1; countdown = countdown -1)
             System.out.println(countdown + "\n");
        System.out.println("Blastoff");

        int number;
        for(number = 0; number <=16; number = number +2)
            System.out.println("The current number is: " + number);

        int i;
        int square;
        for (i = 1; i <= 10; i++ ) {
            square = i * i;
            System.out.println("i is equal to " + i +
                    ", and i squared is equal to: " + square);

            int a =4;
            if (a == 4){
                a= a + 5;
                System.out.println("a was equal to 4, now it is equal to " + a);
            }
        }
    }
}