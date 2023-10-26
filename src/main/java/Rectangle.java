public final class Rectangle extends Shape {
    
    private int size1, size2;

    public Rectangle(int size1, int size2){
        this.size1 = size1;
        this.size2 = size2;
    }
    
    @Override 
    String draw(){
        String str = "";
        for  (int i = 0; i < size2; i++){
            for (int j = 0; j < size1; j++){
                if ((j == 0) || (j == size1-1) || (i == 0) || (i == size2-1)){
                    str+="*";
                } else {
                    str+=" ";
                }
            }    
            str += "\n";
        }
        return str;
    }
}