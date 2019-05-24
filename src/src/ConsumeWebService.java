
import org.tempuri.ICertificarProxy;
import java.rmi.RemoteException;
import org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.*; 

/*import org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion;
import org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIPeticion;
import org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta;
*/


import org.tempuri.CertificarLocator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class ConsumeWebService {

	private static final String MAIN_PATH = "C:\\Alejandro\\Pruebas\\Java\\src\\resources\\";
	  
	public static void main(String[] args)  throws Exception {
		
		ICertificarProxy proxy = new ICertificarProxy();
		AutenticarPeticion autenticar = new AutenticarPeticion();
		TimbrarCFDIPeticion peticion = new TimbrarCFDIPeticion();
		
		autenticar.setUsuario("PruebasTimbrado");		
		autenticar.setContrasenia("@Notiene1");
		
		File file = FileUtils.getFile(MAIN_PATH + "XEXX010101000_FAC_AC2_20190524.xml");

   	    // Se debe de actualizar la Fecha actual en el archivo ya que si no marcara error de timbrado
   	    String data = FileUtils.readFileToString(file, "UTF-8");
   	 
   	    //System.out.println("" + data);   
   	       	    
		peticion.setXMLEntrada(data);
				
		System.out.println("Inicia Timbrado");
        System.out.println("");
    	 
		TimbrarCFDIRespuesta timbradoMultiEmpresas = proxy.timbradoMultiEmpresas(autenticar, peticion);
		
		System.out.println("Timbre Generado" + timbradoMultiEmpresas.getTimbrado().getTimbreXML()); 
				
		// Método para cancelar un CFDI
		CancelarCFDI(timbradoMultiEmpresas.getTimbrado().getUUID());		
	}
	
	
	public static void CancelarCFDI(String UUID) throws Exception {
	
		ICertificarProxy proxy = new ICertificarProxy();
		AutenticarPeticion autenticar = new AutenticarPeticion();
		CancelarCFDIPACPeticion peticion = new CancelarCFDIPACPeticion();
		
		autenticar.setUsuario("PruebasTimbrado");		
		autenticar.setContrasenia("@Notiene1");
		
		peticion.setRFC("AAA010101AAA");
		peticion.setPassword("12345678a");
		
		File file = FileUtils.getFile(MAIN_PATH + "AAA010101AAA.pfx");

   	    // El certificado que recibe es en formato PFX     
		peticion.setPFX(FileUtils.readFileToByteArray(file));
				
		//Puedes colocar no hay limite 
		String[] listaUUIDs = {UUID};
		peticion.setUUID(listaUUIDs);
		
	   	System.out.println("");
		System.out.println("Inicia Cancelacion");
		System.out.println("");
		CancelarCFDIRespuesta respuesta =  proxy.cancelarCFDICualquierPAC(autenticar, peticion);
		
		for (int contador = 0; contador < respuesta.getFoliosRespuesta().length; contador++)
	    {
            if (respuesta.getFoliosRespuesta()[contador].getEstatus() != null)
            	System.out.println("Timbre Generado" + respuesta.getFoliosRespuesta()[contador].getEstatus().getDescripcion());             
	    }					         
	}
}
