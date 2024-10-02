public class Child {
    private String name;
    private int age;
    private double bedtime;
    private String sport;
    private String favColor;

    public Child(String name, int age, double bedtime, String sport, String favColor){
        this.name = name;
        this.age = age;
        this.bedtime = bedtime;
        this.sport = sport;
        this.favColor = favColor;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBedtime(double bedtime){
        this.bedtime = bedtime;
    }
    public double getBedtime() {
        return bedtime;
    }
    public void setSport(String sport){
        this.sport = sport;
    }
    public String getSport(){
        
        return sport;
    }
    public void setFavColor(String favColor){
        this.favColor = favColor;
    }
    public String getFavColor(){
        
        return favColor;
    }
   public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }

    public String playFetch(Dog dog) {
        int dogAge = dog.getAge();

        if (dogAge < 2 || dogAge > 12) {
            return "didn't fetch the ball";
        } else if (dogAge >= 2 && dogAge <= 5){
            return "got the ball but didn't bring it back";
        } else{
            return "fetched the ball";;
    }

    public static void main(String[] args) {
        Child roman = new Child("Roman", 8, 9.30, "baseball", "yellow");
        Dog buster = new Dog("Buster", 4, "Golden Retriever");
        System.out.println(roman.playFetch(buster)); //should print "got the ball but didn't bring it back"
    }

}
