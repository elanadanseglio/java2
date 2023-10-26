
public class Person {
    private String fullName;
    private byte age;
    private int social;
    private static int count;
    private String voice = "";

    public Person(){
        this.fullName = "N/A";
        count++;
    }

    public Person(String firstName, String lastName){
        this.fullName = firstName + " " + lastName;
        count++;
    }

    public Person(String firstName, String lastName, byte age, int social){
        this.fullName = firstName + " " + lastName;
        this.age = age;
        this.social = social % 10000;
        count++;
    }

    public String speak(){
        if (this.fullName.equals("N/A")){
            this.voice = "I don't have a name.";
        } else {
            if (this.age > 0){
                this.voice = "My name is " + fullName + " and I am " + age + " years old.";
            } else {
                this.voice = "My name is " + fullName + ".";
            }
        }
        return this.voice;
    }

    public static int getPersonCount(){
        return count;
    }

    public String getName(){
        return fullName;
    }

    public byte getAge(){
        return age;
    }

    public int getSocial(){
        return social;
    }

    public String toString(){
        if (social > 0){
            return fullName + " " + social;
        }
        return fullName;
    }
    
}
