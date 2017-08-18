import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ShareInterface3 extends Remote {
	
	public int method5() throws RemoteException;
	public byte[] method6(String fileName , int n) throws RemoteException;

}
