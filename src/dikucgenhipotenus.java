import java.util.Scanner;
public class dikucgenhipotenus {

	public static void main(String[] args) {
		
		
		
		
				
				int kenar1, kenar2, kenar3;
		        int u;		      
		        int alan;
		       
		        Scanner scan = new Scanner (System.in);
		        
		System.out.println("kenar1 giriniz:");
	    kenar1= scan.nextInt();
	    
	    System.out.println("kenar2 giriniz:");
	    kenar2= scan.nextInt();
	    			
	    System.out.print("kenar3 giriniz:");
        kenar3 = scan.nextInt();
        
        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        
        System.out.println("Ücgenin alanı = " + alan);
	}
	

}
