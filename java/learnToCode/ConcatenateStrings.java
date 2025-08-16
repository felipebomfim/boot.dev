package learnToCode;
public class ConcatenateStrings {
    public static void main(String[] args) {
        String sentenceStart = "You have ";
        String sentenceEnd = " health";

        String player1Health = "1200";
        String player2Health = "1100";

        System.out.println(sentenceStart+player1Health+sentenceEnd);
        System.out.println(sentenceStart+player2Health+sentenceEnd);
    }
}
