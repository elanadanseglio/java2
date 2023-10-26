public final class Square extends Shape {

    private int size;
    public Square(int size){
        this.size = size;
    }
    
    @Override 
    String draw(){
        String str = "";
        for  (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if ((j == 0) || (j == size-1) || (i == 0) || (i == size-1)){
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
