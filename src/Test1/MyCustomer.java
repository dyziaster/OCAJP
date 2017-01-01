package Test1;

public class MyCustomer {
	  protected String nameCustomer;
	  private String addressCustomer;
	  private String condCustomer;
	    
	    private String get_name(){return nameCustomer;}
	    private String get_address(){return addressCustomer;}
	   private String get_condtn(){return condCustomer;}
	     
	    protected String []customer;
	    private String combine (String name,String address,String condition){
	    return  name+" "+ address+""+condition;
	     
	    
	    }
	     
	     
	    public void tipe (String fill) throws IllegalAccessException {
	       int ok = 0;
	        for (int i = 0; i < customer.length; i++) {
	            if (fill.equals(customer[i]))ok = 1;
	        }
	        {
	        if (ok==1) addressCustomer = fill; 
	        else throw new IllegalAccessException("Wrong !!");
	      }
	        
	      }
	    public String get_fullname(){
	        return combine (get_name(),get_address(),get_condtn());
	    }
	}
	    class name extends MyCustomer{
	        public name (){
	            customer = new String[]{"Woompy Jhonson"};
	        }
	    }
	 
	   class address extends MyCustomer {
	       public address (){
	           customer = new String[]{"New Yard","Californila"};
	            
	        
	       }
	   }
	    class condition extends MyCustomer {
	        public condition (){
	               customer = new String []{"Worse","Normal"};
	                
	           }
	    } 
	    
	    class executions {
	        public static void main(String[] args) {
	            try{
	           name NM = new name();
	           NM.tipe("Woompy Jhonson");
	                System.out.println("Customer Name :");
	                String fullname1 =NM.get_fullname();
	                System.out.println(fullname1);
	                 
	           address ADRS = new address();
	           ADRS.tipe("New Yard");
	                System.out.println("Address :");
	                String fullname2 = ADRS.get_fullname();
	                System.out.println(fullname2);
	                
	           condition CNDTN= new condition();
	           CNDTN.tipe ("Worse");
	                System.out.println("Customer Condition :");
	                String fullname3 = CNDTN.get_fullname();
	                System.out.println(fullname3);
	                   
	        }
	            catch (Exception e){
	                System.out.println("" +e );
	            }
	        }
	        
	}