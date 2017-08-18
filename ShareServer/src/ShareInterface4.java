import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ShareInterface4 extends Remote {
	
	public int method7() throws RemoteException;
	public byte[] method8(String fileName , int n) throws RemoteException;

}
