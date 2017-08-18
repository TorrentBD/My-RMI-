
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

 
public class Implement5 extends UnicastRemoteObject implements ShareInterface5{

    public Implement5() throws RemoteException{
    }

    @Override
    public int method9() throws RemoteException {
      return 0;  
    }

    @Override
    public byte[] method10(String fileName, int n) throws RemoteException {
         try {
            File file = new File(fileName);
            byte buffer[] = new byte[(int) file.length()/n];
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileName));
            input.read(buffer,0, buffer.length);
            input.close();
            return (buffer);
        } catch (Exception e) {
            System.out.println("FileImpl: " + e.getMessage());
            //e.printStackTrace();
            return (null);
        }
    } 
    
}
