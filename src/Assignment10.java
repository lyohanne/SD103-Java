public class Assignment10 {
    public static void main(String[] args) {
        float orderValue = 200.0f;
        boolean saturdayDelivery = true;         // true or false
        String destination = "Canada";              // "US", "Canada", "Mexico"


        /*orderValue = Utils.getNumber("Enter Cost of Order");
        saturdayDelivery = Utils.getNumber("Saturday Delivery? T/F").equals("T");
        destination = Utils.getInput("Where are you shipping it to? ");*/

        float deliveryCost;
        if (destination.equals("US")) {
            deliveryCost = 20.0f;
            if (orderValue > 100.0f) {
                deliveryCost -= 5.0f;
            }
            if (saturdayDelivery) {
                deliveryCost += 10.0f;
            }
        } else if (destination.equals("Mexico")) {
            deliveryCost = 32.0f;
            if (orderValue > 100.0f) {
                deliveryCost -= 7.0f;
            }
            if (saturdayDelivery) {
                deliveryCost += 20.0f;
            }
        } else {
            // Assume that the country is Canada
            deliveryCost = 25.0f;
            if (orderValue > 100.0f) {
                deliveryCost -= 7.0f;
            }
            if (saturdayDelivery) {
                deliveryCost += 12.0f;
            }
        }

        System.out.println("My order was " + orderValue + "shipping cost to " + destination + " will be " + deliveryCost);

        int num1 = Utils.getNumber("Enter #1 < 5 ", 5);
        if (num1 % 2 == 0) {
            System.out.println("This number " + num1 + " is even ");
        }

        if (num1 == 2 || num1 == 3 || num1 == 5) {
            System.out.println("This number " + num1 + " is prime ");
        }
        if (num1 == 1) {
            System.out.println("one is the loneliest number");
        }
        if (num1 == 1 || num1 == 4) {
            System.out.println("This number " + num1 + "is a square");
        }
        if (num1 == 0) {
            System.out.println("You are purposeful");

            int aNumber = 3;
            if (aNumber >= 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");

    }

    }




