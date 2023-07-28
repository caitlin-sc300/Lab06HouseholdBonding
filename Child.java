public class Child {
    //PASTE YOUR WORK FROM LAB05 HERE

    /**
     * For this method, our child will take an instance of a dog to play fetch with.
     * The age of the dog will determine the resulting string as follows:
     * If the dog is younger than 2 or older than 12, return "didn't fetch the ball"
     * If the dog is 2-5 (inclusive), return "got the ball but didn't bring it back"
     * For any other age, return "fetched the ball"
     *
     * @param dog
     * @return string with appropriate phrase
     */
    public String playFetch(Dog dog) {
        return "";
    }

    public static void main(String[] args) {
        Child roman = new Child("Roman", 8, 9.30, "baseball", "yellow");
        Dog buster = new Dog("Buster", 4, "Golden Retriever");
        System.out.println(roman.playFetch(buster)); //should print "got the ball but didn't bring it back"
    }
}
