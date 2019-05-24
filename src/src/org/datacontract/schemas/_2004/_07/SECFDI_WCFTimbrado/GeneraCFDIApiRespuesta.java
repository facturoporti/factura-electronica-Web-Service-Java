/**
 * GeneraCFDIApiRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class GeneraCFDIApiRespuesta  extends org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.WCFRespuesta  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbradoRespuesta CFDITimbrado;

    public GeneraCFDIApiRespuesta() {
    }

    public GeneraCFDIApiRespuesta(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Estatus estatus,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbradoRespuesta CFDITimbrado) {
        super(
            estatus);
        this.CFDITimbrado = CFDITimbrado;
    }


    /**
     * Gets the CFDITimbrado value for this GeneraCFDIApiRespuesta.
     * 
     * @return CFDITimbrado
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbradoRespuesta getCFDITimbrado() {
        return CFDITimbrado;
    }


    /**
     * Sets the CFDITimbrado value for this GeneraCFDIApiRespuesta.
     * 
     * @param CFDITimbrado
     */
    public void setCFDITimbrado(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbradoRespuesta CFDITimbrado) {
        this.CFDITimbrado = CFDITimbrado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneraCFDIApiRespuesta)) return false;
        GeneraCFDIApiRespuesta other = (GeneraCFDIApiRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.CFDITimbrado==null && other.getCFDITimbrado()==null) || 
             (this.CFDITimbrado!=null &&
              this.CFDITimbrado.equals(other.getCFDITimbrado())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCFDITimbrado() != null) {
            _hashCode += getCFDITimbrado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneraCFDIApiRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "GeneraCFDIApiRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFDITimbrado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDITimbrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDITimbradoRespuesta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
