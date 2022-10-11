import javax.swing.*; 
import java.security.SecureRandom; 
import javax.crypto.Cipher; 
import javax.crypto.KeyGenerator; 
import javax.crypto.SecretKey; 
import javax.crypto.spec.SecretKeySpec; 
import java.util.Random ; 
class DES { 
byte[] skey = new byte[1000]; 
String skeyString; 
static byte[] raw; 
String inputMessage,encryptedData,decryptedMessage;
public DES() 
{ 
try 
{ 
generateSymmetricKey(); 
inputMessage=JOptionPane.showInputDialog(null,"Enter 
message to encrypt"); 
byte[] ibyte = inputMessage.getBytes(); 
byte[] ebyte=encrypt(raw, ibyte); 
String encryptedData = new String(ebyte); 
System.out.println("Encrypted message "+encryptedData); 
JOptionPane.showMessageDialog(null,"Encrypted Data 
"+"\n"+encryptedData); 
byte[] dbyte= decrypt(raw,ebyte); 
String decryptedMessage = new String(dbyte); 
System.out.println("Decrypted message 
"+decryptedMessage); 
JOptionPane.showMessageDialog(null,"Decrypted Data 
"+"\n"+decryptedMessage); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
