public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"play", "Amazing", "Talented", "passionate", "Rockstar", "school", "enjoying", "sports", "Pizza",
                "Movies"};
        String[] wordListTwo = {"RocketScience", "college", "Tv shows", "Religion", "soccer", "coding", "Food", "funny", "smart", "aspiring"};

        String[] wordListThree = {"Family", "Truth", "friends", "fun", "Athlete", "Genius", "Everyday", "candy", "work", "sleep"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        System.out.println(oneLength);
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        System.out.println(rand1);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("In life we need " + " " + phrase);


    }
}
