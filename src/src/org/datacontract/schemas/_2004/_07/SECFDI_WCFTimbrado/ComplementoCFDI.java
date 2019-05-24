/**
 * ComplementoCFDI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class ComplementoCFDI  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Donativos donativos;

    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Pagos[] pagos;

    public ComplementoCFDI() {
    }

    public ComplementoCFDI(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Donativos donativos,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Pagos[] pagos) {
           this.donativos = donativos;
           this.pagos = pagos;
    }


    /**
     * Gets the donativos value for this ComplementoCFDI.
     * 
     * @return donativos
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Donativos getDonativos() {
        return donativos;
    }


    /**
     * Sets the donativos value for this ComplementoCFDI.
     * 
     * @param donativos
     */
    public void setDonativos(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Donativos donativos) {
        this.donativos = donativos;
    }


    /**
     * Gets the pagos value for this ComplementoCFDI.
     * 
     * @return pagos
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Pagos[] getPagos() {
        return pagos;
    }


    /**
     * Sets the pagos value for this ComplementoCFDI.
     * 
     * @param pagos
     */
    public void setPagos(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Pagos[] pagos) {
        this.pagos = pagos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplementoCFDI)) return false;
        ComplementoCFDI other = (ComplementoCFDI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.donativos==null && other.getDonativos()==null) || 
             (this.donativos!=null &&
              this.donativos.equals(other.getDonativos()))) &&
            ((this.pagos==null && other.getPagos()==null) || 
             (this.pagos!=null &&
              java.util.Arrays.equals(this.pagos, other.getPagos())));
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
        if (getDonativos() != null) {
            _hashCode += getDonativos().hashCode();
        }
        if (getPagos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPagos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPagos(), i);
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
        new org.apache.axis.description.TypeDesc(ComplementoCFDI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ComplementoCFDI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donativos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Donativos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Donativos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pagos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pagos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pagos"));
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
