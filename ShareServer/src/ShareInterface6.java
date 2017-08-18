import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ShareInterface6 extends Remote {
	
	public int method11() throws RemoteException;
	public byte[] method12(String fileName , int n) throws RemoteException;

}
