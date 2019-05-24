/**
 * CancelarCFDIRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class CancelarCFDIRespuesta  extends org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.WCFRespuesta  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.FoliosRespuesta[] foliosRespuesta;

    public CancelarCFDIRespuesta() {
    }

    public CancelarCFDIRespuesta(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Estatus estatus,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.FoliosRespuesta[] foliosRespuesta) {
        super(
            estatus);
        this.foliosRespuesta = foliosRespuesta;
    }


    /**
     * Gets the foliosRespuesta value for this CancelarCFDIRespuesta.
     * 
     * @return foliosRespuesta
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.FoliosRespuesta[] getFoliosRespuesta() {
        return foliosRespuesta;
    }


    /**
     * Sets the foliosRespuesta value for this CancelarCFDIRespuesta.
     * 
     * @param foliosRespuesta
     */
    public void setFoliosRespuesta(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.FoliosRespuesta[] foliosRespuesta) {
        this.foliosRespuesta = foliosRespuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelarCFDIRespuesta)) return false;
        CancelarCFDIRespuesta other = (CancelarCFDIRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.foliosRespuesta==null && other.getFoliosRespuesta()==null) || 
             (this.foliosRespuesta!=null &&
              java.util.Arrays.equals(this.foliosRespuesta, other.getFoliosRespuesta())));
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
        if (getFoliosRespuesta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFoliosRespuesta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFoliosRespuesta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelarCFDIRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foliosRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FoliosRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FoliosRespuesta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FoliosRespuesta"));
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
