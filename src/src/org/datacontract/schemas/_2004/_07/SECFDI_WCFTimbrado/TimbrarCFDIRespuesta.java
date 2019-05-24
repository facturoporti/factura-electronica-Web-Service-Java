/**
 * TimbrarCFDIRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class TimbrarCFDIRespuesta  extends org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.WCFRespuesta  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Timbre timbrado;

    public TimbrarCFDIRespuesta() {
    }

    public TimbrarCFDIRespuesta(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Estatus estatus,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Timbre timbrado) {
        super(
            estatus);
        this.timbrado = timbrado;
    }


    /**
     * Gets the timbrado value for this TimbrarCFDIRespuesta.
     * 
     * @return timbrado
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Timbre getTimbrado() {
        return timbrado;
    }


    /**
     * Sets the timbrado value for this TimbrarCFDIRespuesta.
     * 
     * @param timbrado
     */
    public void setTimbrado(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Timbre timbrado) {
        this.timbrado = timbrado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimbrarCFDIRespuesta)) return false;
        TimbrarCFDIRespuesta other = (TimbrarCFDIRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timbrado==null && other.getTimbrado()==null) || 
             (this.timbrado!=null &&
              this.timbrado.equals(other.getTimbrado())));
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
        if (getTimbrado() != null) {
            _hashCode += getTimbrado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimbrarCFDIRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TimbrarCFDIRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timbrado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Timbrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Timbre"));
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
