import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time....");
        System.out.println("Type in a random word & press enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time");
    }

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double total = listedMealPrice + tip + tax;
//        System.out.println("Your total meal price is " + total);
        return total;
    }

    public static double calculateEmployeeYearSalary(double hoursPerWeek, double amountPerHour, double vacationDays){
        double dailyHours = hoursPerWeek / 7;
        double dailyAmount = amountPerHour * dailyHours;
        double vacationAmount = dailyAmount * vacationDays;
        double yearlyAmount = (dailyAmount * 365) - vacationAmount;
        return yearlyAmount;
    }



    public static void main(String[] args) {
//        System.out.println("Hello world from the IntelliJ IDE!");
        int studentAge = 20;
        double studentGPA = 3.45;
//        char studentFirstInitial = 'A';
//        char studentLastInitial = 'K';
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Alain";
        String studentLastName = "Kubwayo";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);



        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        // Concatenating strings
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
//        System.out.println("What do you want to update it to?");
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);


        // Control Flow: The Fortune Teller Program
//        System.out.println("Pick a number between 1 and 10");
//        Scanner scanner = new Scanner(System.in);
//        int inputtedNum = scanner.nextInt();
//        if(inputtedNum < 5){
//            System.out.println("Enjoy the good luck a friend brings you");
//        }else{
//            System.out.println("Your shoe selection will make you very happy today");
//        }

        // While Loop: "SONG ON REPEAT"
//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while(isOnRepeat){
//            System.out.println("Playing the current song");
//            System.out.println("Would you like to take the current song off of repeat? if so, answer yes");
//            String userInput = input.next();
//            if(userInput.equals("yes")){
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("Playing the next song");

        // CHALLENGE: MULTIPLE CHOICE
        String question = "What's the largest continent in the world?";
        String choiceOne = "America";
        String choiceTwo = "Asia";
        String choiceThree = "Europe";
        String correctAnswer = choiceTwo;
        Scanner userInput = new Scanner(System.in);
//        System.out.println(question);
//        System.out.println(choiceOne);
//        System.out.println(choiceTwo);
//        System.out.println(choiceThree);
//        String userChoice = userInput.next();
//        while(!userChoice.equals(correctAnswer)){
//            System.out.println("Incorrect, try again!");
//            System.out.println(question);
//            userChoice = userInput.next();
//        }
//        System.out.println("Congrats!");

        // Calling functions
//        announceDeveloperTeaTime();
//        calculateTotalMealPrice(15, .2, .08);
        double groupTotalMealPrice = calculateTotalMealPrice(23, .14, .08);
        double individualTotalMealPrice = groupTotalMealPrice / 5;
        System.out.println(groupTotalMealPrice);
        System.out.println(individualTotalMealPrice);

        double result = Math.pow(2,5);
        System.out.println(result);

        double salary = calculateEmployeeYearSalary(40, 15, 8);
        System.out.println(salary);


        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);

        StudentProfile studentOne = new StudentProfile("Alain", "Kubwayo", 2020, 3.01, "Computer Engineering");
        StudentProfile studentTwo = new StudentProfile("Reece", "James", 2010, 3.75, "Physical Education");

        studentTwo.incrementExpectedGraduationYear();
        System.out.println(studentTwo.expectedGraduationYear);

    }
}
