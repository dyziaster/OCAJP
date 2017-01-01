package Coding;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Track{
    
  
    
    int min =1000000000;
    int max =0;
    
    public void setMin(int x){
        if(x<min)
            min=x;
    }
    public void setMax(int x){
        if(x>max)
            max=x;
    }
    public int getSize(){
        return max-min +1;
    }
    
}
public class Ex3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        
        int lamps = n*m;
        
        Track track[] = new Track[n];
        
        int z[][] = new int[k][3];
        
        /*for(int i =0 ;i<k;i++){
            for(int y = 0; y<3;y++){
                z[i][y]= in.nextInt();
            }  
        }*/
        int index = 0;
        for(int i =0 ;i<k;i++){
            if(track[index=(in.nextInt()-1)]==null)
                track[index] = new Track();
            track[index].setMin(in.nextInt());
            track[index].setMax(in.nextInt());
        }
        
        for(int i = 0 ; i < n ; i++){
            if(track[i]!=null)
                lamps -= track[i].getSize();
            
        }
        
        System.out.print(lamps);
                
    }
}