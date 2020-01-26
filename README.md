<div align="center">

![banner](img/GitHub.png)

# Código en Java del Servicio Web  para Timbrar y Cancelar

![Java badge](img/subtitulo-badge.png)

</div>

Este es el ejemplo de uso para consumir el **Servicio Web en Java  para generar Facturas, Notas, Recibos, Nómina, Carta Porte, Complemento de Pagos, etc)**.

Este servicio es ideal cuando ya generas el XML por medios propios y solo necesitas el timbrado. La integración es fácil y rápida en 10 minutos estarás emitiendo en nuestro ambiente de pruebas los CFDI la puesta en producción en menos de 1 hora.

Además el Servicio Web permitirá **cancelar uno o varios CFDI**

## Requerimientos

Se recomienda usar cualquier IDE de desarrollo como Eclipse, NetBeans, etc. 

Java SE-1.8 en adelante o usar la última versión de Java.

## Instalación

Obten la última versión de FacturoPorTi Java en:

    git clone https://github.com/facturoporti/factura-electronica-Web-Service-Java.git


## Timbrar

Descarga el repositorio que contiene lo necesarios para realizar el proceso de timbrado. Selecciona el archivo  el sistema realizará lo siguiente: 

```csharp
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
```

## XML Timbrado

Al término el sistema te indica el resultado del timbrado en la ventana de salida o comandos además te mostrará el timbre fiscal.


## Cancelar

Ingresa el folio fiscal (UUID) para realizar la cancelación: 

```csharp
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
```

## Probar Cancelación de CFDI

Antes de ejecutarel método de cancelación del código deberás de actualizar los valores con tus datos fiscales; al término de la ejecución obtendrás la respuesta, en la ventana de salida o comandos.

**Nota: El certificado digital que se debe de enviar es de tipo PFX si no se manda el correcto mandará error la cancelación**

## Documentación Adicional

Si deseas mas información del servicio web descarga la guía de integración,   contiene todos los atributos y su descripción además de los valores que son permitidos http://software.facturoporti.com.mx/WebService/Manual-Integracion-Web-Service.pdf



## Contribuir

1. Fork el repositorio 

2. Clona el repositorio

    git clone git@github.com:yourUserName/factura-electronica-Web-Service-Java.git


3. Crea una rama 
```
    git checkout desarrollo
    git pull al original desarrollo
    # Podrás escoger el nombre de tu rama
    git checkout -b <feature/my_branch>
```
4. Haz los cambios necesarios y commit para carga los
```
    git add .
    git commit -m "mis cambios"
```
5. Envía los cambios a GitHub
```
    git push origin <feature/my_branch>
```

***-

## License

Desarrollado en México por [FacturoPorTi](https://www.FacturoPorTi.com.mx). Licencia de uso [Ver mas](https://github.com/facturoporti/factura-electronica-Web-Service-Java/blob/master/Licencia).
****


