import java.util.UUID;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    int fibonacciNumberFinder(int n){
        if (n <= 1)
            return n;
        return fibonacciNumberFinder(n - 1) + fibonacciNumberFinder(n - 2);
    }


    String intToBinaryNumber(int n){
        String answer = Integer.toBinaryString(n);
        return answer;
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        //making change
        String uniqueID = UUID.randomUUID().toString();
        return n + uniqueID;
    }


}
