import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		
		Bill arr[] = new Bill[n];
		
		for(int i = 0;i<n;i++){
		    int a = sc.nextInt(); sc.nextLine();
		    String b = sc.nextLine();
		    String c = sc.nextLine();
		    double d = sc.nextDouble(); sc.nextLine();
		    boolean e = sc.nextBoolean(); sc.nextLine();
		    
		    arr[i] = new Bill(a,b,c,d,e);
		}
		boolean givenBool = sc.nextBoolean(); sc.nextLine();
		String givenTypeOfConnection = sc.nextLine();
		
		Bill ans = findBillWithMaxBillAmountBasedOnStatus(arr, givenBool);
		
		if(ans!=null){
		    System.out.print("#" + ans.getBillNo());
		    System.out.println(ans.getName());
		} else System.out.println("There are no bill with the given status");
            
        
        
        int ans2 = getCountWithTypeOfConnection(arr, givenTypeOfConnection);
        
        if(ans2>0){
            System.out.println(ans2);
        } else System.out.println("There are no bills with given type of connection");
        
	}
	
	public static Bill findBillWithMaxBillAmountBasedOnStatus(Bill arr[], boolean givenBool){
	    
	    double largest = 0;
	    for(int i = 0; i<arr.length;i++){
	        if(arr[i].getStatus() == (givenBool)){
	            if(arr[i].getBillAmount()>largest){
	                largest = arr[i].getBillAmount();
	            }
	        }
	    }
	    
	    for(int i = 0; i<arr.length;i++){
	        if(arr[i].getBillAmount() == largest){
	            return arr[i];
	        }
	    }
	    return null;

	}
	
	public static int getCountWithTypeOfConnection(Bill arr[], String givenTypeOfConnection){
	    int count=0;
	    
	    for(int i = 0; i<arr.length; i++){
	        if(arr[i].getTypeOfConnection().equalsIgnoreCase(givenTypeOfConnection)){
	            count++;
	        }
	    }
	    return count;
	}
	
	
	
	
	
    static class Bill{
	    
	    int billNo;
	    String name;
	    String typeOfConnection;
	    double billAmount;
	    boolean status;
	    
	    
	  public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status){
	      this.billNo = billNo;
	      this.name = name;
	      this.typeOfConnection = typeOfConnection;
	      this.billAmount = billAmount;
	      this.status = status;
	  }
	  
	 public int getBillNo(){
	     return billNo;
	 }
	 	 public String getName(){
	     return name;
	 }
	 	 public String getTypeOfConnection(){
	     return typeOfConnection;
	 }
	 	 public double getBillAmount(){
	     return billAmount;
	 }
	 	 public boolean getStatus(){
	     return status;
	 }
	}
}
