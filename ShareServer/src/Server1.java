import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server1 {
 
	public static void main(String[] args) {
        try {
             Registry r1 = LocateRegistry.createRegistry(1091);
         
             ShareInterface1 s1 = new Implement1();
         
             r1.rebind("Server1", s1);
         
             System.out.println("Server 1 is started........");
         
         } catch (Exception e) {
             System.out.println(e.getMessage());
             
             //e.printStackTrace();
            }

	}

}
