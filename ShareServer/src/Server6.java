
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server6 {
 
	public static void main(String[] args) {
        try {
            Registry r6 = LocateRegistry.createRegistry(1096);
         
             ShareInterface6 s6 = new Implement6();
         
            r6.rebind("Server6", s6);
         
            System.out.println("Server 6 is started........");
         
         } catch (Exception e) {
             System.out.println(e.getMessage());
            }

	}

}
