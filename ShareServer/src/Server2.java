
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server2 {
 
	public static void main(String[] args) {
        try {
            Registry r2 = LocateRegistry.createRegistry(1092);
         
             ShareInterface2 s2 = new Implement2();
         
            r2.rebind("Server2", s2);
         
            System.out.println("Server 2 is started........");
         
         } catch (Exception e) {
             System.out.println(e.getMessage());
            }

	}

}
