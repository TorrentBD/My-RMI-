
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server3 {
 
	public static void main(String[] args) {
        try {
            Registry r3 = LocateRegistry.createRegistry(1093);
         
             ShareInterface3 s3 = new Implement3();
         
            r3.rebind("Server3", s3);
         
            System.out.println("Server 3 is started........");
         
         } catch (Exception e) {
             System.out.println(e.getMessage());
            }

	}

}
