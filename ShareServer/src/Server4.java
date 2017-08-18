
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server4 {
 
	public static void main(String[] args) {
        try {
            Registry r4 = LocateRegistry.createRegistry(1094);
         
             ShareInterface4 s4 = new Implement4();
         
            r4.rebind("Server4", s4);
         
            System.out.println("Server 4 is started........");
         
         } catch (Exception e) {
             System.out.println(e.getMessage());
            }

	}

}
