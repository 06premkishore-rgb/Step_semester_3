package week_3.assigment_problems;

public class P1_VotingEligibilityChecker {
    public static void checkVotingEligibility(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkVotingEligibility(20);
        checkVotingEligibility(16);
        checkVotingEligibility(-2);
    }
}