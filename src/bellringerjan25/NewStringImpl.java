/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bellringerjan25;
import java.util.*;


public class NewStringImpl implements NewString {
   private final String input;
    private String[] msg;
    private String [] output;
    private String end ="";
    Random rand= new Random();
  private int random= rand.nextInt(msg.length);
   
   public NewStringImpl(String input){
       this.input=input;
        msg= input.split("");
        output= new String[msg.length];
   }
   
   @Override
    public String flipped() {
        for(int i=0; i<msg.length; i++){
            output[i] =msg[msg.length- (i+1)];
        }
        for(int i= 0; i<output.length; i++){
        end+=output[i];
    }
        
        return end;
    }
    

    public String randomize(String imput) {
        for (int i=0; i<msg.length; i++){
            
        }
        return end;
    }

    @Override
    public int length() {
        return msg.length;
    }

   /* @Override
    public String everyOtherCap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
