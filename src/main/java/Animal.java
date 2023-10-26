public abstract class Animal extends Person{
    private byte age;
    public Animal(){
        this.age = getAge();
    }


    @Override
    public byte getAge(){
        return age;
    }

    class Dog {
        
    }
    class Cat {
        
    }
}
