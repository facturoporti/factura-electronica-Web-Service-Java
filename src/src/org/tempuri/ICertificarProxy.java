package org.tempuri;

public class ICertificarProxy implements org.tempuri.ICertificar {
  private String _endpoint = null;
  private org.tempuri.ICertificar iCertificar = null;
  
  public ICertificarProxy() {
    _initICertificarProxy();
  }
  
  public ICertificarProxy(String endpoint) {
    _endpoint = endpoint;
    _initICertificarProxy();
  }
  
  private void _initICertificarProxy() {
    try {
      iCertificar = (new org.tempuri.CertificarLocator()).getSoap();
      if (iCertificar != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCertificar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCertificar)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCertificar != null)
      ((javax.xml.rpc.Stub)iCertificar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ICertificar getICertificar() {
    if (iCertificar == null)
      _initICertificarProxy();
    return iCertificar;
  }
  
  public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta autenticar(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametro) throws java.rmi.RemoteException{
    if (iCertificar == null)
      _initICertificarProxy();
    return iCertificar.autenticar(parametro);
  }
  
  public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta cancelarCFDICualquierPAC(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametroSeguridad, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIPACPeticion parametro) throws java.rmi.RemoteException{
    if (iCertificar == null)
      _initICertificarProxy();
    return iCertificar.cancelarCFDICualquierPAC(parametroSeguridad, parametro);
  }
  
  public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta timbradoMultiEmpresas(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametroSeguridad, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIPeticion parametro) throws java.rmi.RemoteException{
    if (iCertificar == null)
      _initICertificarProxy();
    return iCertificar.timbradoMultiEmpresas(parametroSeguridad, parametro);
  }
  
  public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta apiTimbrarCFDI(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDIPeticion cfdi) throws java.rmi.RemoteException{
    if (iCertificar == null)
      _initICertificarProxy();
    return iCertificar.apiTimbrarCFDI(cfdi);
  }
  
  public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta apiCancelarCFDI(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarApiCFDIPeticion cfdi) throws java.rmi.RemoteException{
    if (iCertificar == null)
      _initICertificarProxy();
    return iCertificar.apiCancelarCFDI(cfdi);
  }
  
  
}