import java.util.Calendar;

public class FirstApp {
    public static void main(String[] args) {
        //let's see if I can print to my console
        System.out.println("Hello World!");
        //here I have added some math ot my output
        //System.out.println ("Hello")
        System.out.println("Mom look at me! I'm a programmer!");
        int numberOfMinutes;
        numberOfMinutes = 12;
        System.out.println(numberOfMinutes);
        System.out.println("She said:\n\"don't bother me\"");
        int age = 42;
        System.out.println(age);
        String fullName = "Liya\t Brown";
        System.out.println(fullName);
        float myBodyTemp = 98.6f;
        System.out.println(myBodyTemp);

        String myName = "Liya Brown";

        char ch = 'L';

        byte myByte = 100;
        short myShort = 10000;
        int myInt = 50000;
        long myLong = 1000000000;

        float myTemp = 98.6f;
        double myDouble = 10.000000000001;

        int thisisNotAChar = ch;
        System.out.println("thisisNotAChar = " + thisisNotAChar);
        System.out.println("this IS a char = " + ch + " <----");
//if you want a random number between 0 and 10 *10 will give you 0 to 9 almost 10. So to include 10, you would do *10+1.
        //to get 5 to 15, you would do *10+5...5 is the starting number and it will go 10 more than 5
        int rand = (int) (Math.random() * 10 + 5);
        System.out.println("rand = " + rand);

        boolean isItWorking = false;

        int somethingNew = myByte + myShort + myInt;
        System.out.println("byte: " + myByte + "\nthis is myShort: " + myShort + "\nmyTemp:" + myTemp);
        System.out.println("here is my byte" + myByte + myInt + myLong + myTemp + myDouble + isItWorking);
        System.out.println(myByte + myInt + myLong + myTemp + myDouble + "here is my byte");
        System.out.println("somethingNew = " + somethingNew);
        String scent = "atrocious";
        String room = "kitchen";
        String insects = "spider";
        String college = "Edge Tech";
        System.out.println("There's a " + scent + " smell coming from the " + room + " where " + insects + "s are dancing around the " + room);

        int[] junk = new int[10];
        String[] junkStr = new String[20];
        junkStr[19] = "Liya Brown";
        System.out.println("This is the end");
        String[] students = {"Lindsey the first", "Liya", "Peyton", "Michael", "Q"};
        System.out.println("students is this big = " + students.length);
        System.out.println("students[1] = " + students[1]);
        System.out.println("First Student = " + students[0]);
        System.out.println("Last Student = " + students[students.length - 1]);
//this prints out my family
        String[] myFamily = {"Tory", "Liya", "Rain", "Soleil", "Torin"};
        for (String f : myFamily) {
            System.out.println(f);
        }
        System.out.println();

        String[] student = new String[5];
        String[] myClass = {"Liya", "Lindsey", "Payton", "Michael", "Q"};
        for (String C : myClass) {
            System.out.println(C);
        }
        int[] Liya = new int[10];
        Liya[2] = 8;
        Liya[5] = 12;
        Liya[8] = 15;
        {
            System.out.println("my array holds 10 values= " + Liya[2]);
            System.out.println("my array holds 10 values= " + Liya[5]);
            System.out.println("my array holds 10 values= " + Liya[8]);
        }



//if you want a random number between 0 and 10 *10 will give you 0 to 9 almost 10. So to include 10, you would do *10+1.
        //to get 5 to 15, you would do *10+5...5 is the starting number and it will go 10 more than 5
        int myRandom = (int) (Math.random() * 105 + 5);
        System.out.println("rand = " + myRandom);



    }
}
