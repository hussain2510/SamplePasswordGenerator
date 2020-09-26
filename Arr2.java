import java.util.Scanner;
import java.lang.*;
class Arr2
{   
  
  public static int[] initialize(int n){
	 
	int arr[]=new int[n];
	return arr;
}	
   public static void insert(int arr[]){
	
	int n=arr.length;
  	for(int i =0;i<n;i++){
	arr[i] = sc.nextInt();}
}

  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0,n;
	Arr2 myObj = new Arr2();
        while(true)
        {
            System.out.println("1.Initialize");
            System.out.println("2.Insert");
            System.out.println("3.Remove");
            System.out.println("4.Display");
            System.out.println("5.Quit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
		    
		    n=sc.nextInt();
		    int arr1[]=myObj.initialize(n);

		    System.out.println("Array initialized");
                    break;
                case 2:
		    myObj.insert(arr1);
                  
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.exit(0);
                
            
                default:
                    break;
            }

        }
 
   }
}