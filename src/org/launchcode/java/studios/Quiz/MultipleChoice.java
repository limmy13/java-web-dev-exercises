package org.launchcode.java.studios.Quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void displayAnswers () {
        for (String possibleAnswer : possibleAnswers) {
            System.out.println(possibleAnswer);
        }
    }

    public boolean isCorrectAnswer (int possibleAnswer) {
        return possibleAnswer == correctAnswer;
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return getPointValue();
        }
        else {
            return 0;
        }
    }

}