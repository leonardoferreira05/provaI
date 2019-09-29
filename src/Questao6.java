
public class Questao6 {
    public static void main(String[] args) {
        int w=2*3+7;
        int z=w*w+5;
        
        while(w<(z+3)){
            w=w-1;
            z=w-3;
            z=z*z;
        }
        System.out.println(w);
    }
    
    
}
