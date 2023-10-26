public class AwesomeNumber{
    private Integer num;

    public AwesomeNumber(Integer num){
        this.num = num;
    }

    public static Integer add(AwesomeNumber n1, AwesomeNumber n2){
        Integer result = n1.num + n2.num;
        return result;
    }

    public static Integer subtract(AwesomeNumber n1, AwesomeNumber n2){
        Integer result = n1.num - n2.num;
        return result;
    }
}
