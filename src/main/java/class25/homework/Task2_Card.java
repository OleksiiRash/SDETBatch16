package class25.homework;

import java.util.Arrays;
import java.util.LinkedList;

public class Task2_Card {

    private double interestRate;
    private String cardType;

    public Task2_Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }
}

class CardTester {

    public static void main(String[] args) {

        LinkedList<Task2_Card> cards = new LinkedList<>();
        cards.addAll(Arrays.asList(new Task2_Card(1.5, "card1"), new Task2_Card(2.5, "card2"), new Task2_Card(3.5, "card3")));
        for (Task2_Card c : cards) {
            System.out.println(c.getCardType() + " " + c.getInterestRate());
        }


    }
}
