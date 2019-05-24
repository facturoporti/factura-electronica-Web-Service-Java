/**
 * ICertificar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ICertificar extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta autenticar(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta cancelarCFDICualquierPAC(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametroSeguridad, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIPACPeticion parametro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta timbradoMultiEmpresas(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametroSeguridad, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIPeticion parametro) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta apiTimbrarCFDI(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDIPeticion cfdi) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta apiCancelarCFDI(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarApiCFDIPeticion cfdi) throws java.rmi.RemoteException;
}
