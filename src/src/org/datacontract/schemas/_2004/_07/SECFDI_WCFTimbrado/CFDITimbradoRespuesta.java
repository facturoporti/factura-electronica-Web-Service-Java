/**
 * CFDITimbradoRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class CFDITimbradoRespuesta  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbreRespuesta respuesta;

    public CFDITimbradoRespuesta() {
    }

    public CFDITimbradoRespuesta(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbreRespuesta respuesta) {
           this.respuesta = respuesta;
    }


    /**
     * Gets the respuesta value for this CFDITimbradoRespuesta.
     * 
     * @return respuesta
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbreRespuesta getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this CFDITimbradoRespuesta.
     * 
     * @param respuesta
     */
    public void setRespuesta(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbreRespuesta respuesta) {
        this.respuesta = respuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFDITimbradoRespuesta)) return false;
        CFDITimbradoRespuesta other = (CFDITimbradoRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              this.respuesta.equals(other.getRespuesta())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRespuesta() != null) {
            _hashCode += getRespuesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFDITimbradoRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDITimbradoRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDITimbreRespuesta"));
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
