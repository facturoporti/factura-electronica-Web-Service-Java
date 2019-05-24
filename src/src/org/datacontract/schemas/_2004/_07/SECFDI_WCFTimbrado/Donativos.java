/**
 * Donativos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class Donativos  implements java.io.Serializable {
    private java.lang.String fechaAutorizacion;

    private java.lang.String leyenda;

    private java.lang.String numeroAutorizacion;

    public Donativos() {
    }

    public Donativos(
           java.lang.String fechaAutorizacion,
           java.lang.String leyenda,
           java.lang.String numeroAutorizacion) {
           this.fechaAutorizacion = fechaAutorizacion;
           this.leyenda = leyenda;
           this.numeroAutorizacion = numeroAutorizacion;
    }


    /**
     * Gets the fechaAutorizacion value for this Donativos.
     * 
     * @return fechaAutorizacion
     */
    public java.lang.String getFechaAutorizacion() {
        return fechaAutorizacion;
    }


    /**
     * Sets the fechaAutorizacion value for this Donativos.
     * 
     * @param fechaAutorizacion
     */
    public void setFechaAutorizacion(java.lang.String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }


    /**
     * Gets the leyenda value for this Donativos.
     * 
     * @return leyenda
     */
    public java.lang.String getLeyenda() {
        return leyenda;
    }


    /**
     * Sets the leyenda value for this Donativos.
     * 
     * @param leyenda
     */
    public void setLeyenda(java.lang.String leyenda) {
        this.leyenda = leyenda;
    }


    /**
     * Gets the numeroAutorizacion value for this Donativos.
     * 
     * @return numeroAutorizacion
     */
    public java.lang.String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }


    /**
     * Sets the numeroAutorizacion value for this Donativos.
     * 
     * @param numeroAutorizacion
     */
    public void setNumeroAutorizacion(java.lang.String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Donativos)) return false;
        Donativos other = (Donativos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaAutorizacion==null && other.getFechaAutorizacion()==null) || 
             (this.fechaAutorizacion!=null &&
              this.fechaAutorizacion.equals(other.getFechaAutorizacion()))) &&
            ((this.leyenda==null && other.getLeyenda()==null) || 
             (this.leyenda!=null &&
              this.leyenda.equals(other.getLeyenda()))) &&
            ((this.numeroAutorizacion==null && other.getNumeroAutorizacion()==null) || 
             (this.numeroAutorizacion!=null &&
              this.numeroAutorizacion.equals(other.getNumeroAutorizacion())));
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
        if (getFechaAutorizacion() != null) {
            _hashCode += getFechaAutorizacion().hashCode();
        }
        if (getLeyenda() != null) {
            _hashCode += getLeyenda().hashCode();
        }
        if (getNumeroAutorizacion() != null) {
            _hashCode += getNumeroAutorizacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Donativos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Donativos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAutorizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FechaAutorizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leyenda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Leyenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAutorizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "NumeroAutorizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
