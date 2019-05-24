/**
 * ReceptorCFDI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class ReceptorCFDI  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DireccionCFDI direccion;

    private java.lang.String nombreRazonSocial;

    private java.lang.String RFC;

    private java.lang.String usoCFDI;

    public ReceptorCFDI() {
    }

    public ReceptorCFDI(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DireccionCFDI direccion,
           java.lang.String nombreRazonSocial,
           java.lang.String RFC,
           java.lang.String usoCFDI) {
           this.direccion = direccion;
           this.nombreRazonSocial = nombreRazonSocial;
           this.RFC = RFC;
           this.usoCFDI = usoCFDI;
    }


    /**
     * Gets the direccion value for this ReceptorCFDI.
     * 
     * @return direccion
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DireccionCFDI getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this ReceptorCFDI.
     * 
     * @param direccion
     */
    public void setDireccion(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DireccionCFDI direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the nombreRazonSocial value for this ReceptorCFDI.
     * 
     * @return nombreRazonSocial
     */
    public java.lang.String getNombreRazonSocial() {
        return nombreRazonSocial;
    }


    /**
     * Sets the nombreRazonSocial value for this ReceptorCFDI.
     * 
     * @param nombreRazonSocial
     */
    public void setNombreRazonSocial(java.lang.String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }


    /**
     * Gets the RFC value for this ReceptorCFDI.
     * 
     * @return RFC
     */
    public java.lang.String getRFC() {
        return RFC;
    }


    /**
     * Sets the RFC value for this ReceptorCFDI.
     * 
     * @param RFC
     */
    public void setRFC(java.lang.String RFC) {
        this.RFC = RFC;
    }


    /**
     * Gets the usoCFDI value for this ReceptorCFDI.
     * 
     * @return usoCFDI
     */
    public java.lang.String getUsoCFDI() {
        return usoCFDI;
    }


    /**
     * Sets the usoCFDI value for this ReceptorCFDI.
     * 
     * @param usoCFDI
     */
    public void setUsoCFDI(java.lang.String usoCFDI) {
        this.usoCFDI = usoCFDI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceptorCFDI)) return false;
        ReceptorCFDI other = (ReceptorCFDI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.nombreRazonSocial==null && other.getNombreRazonSocial()==null) || 
             (this.nombreRazonSocial!=null &&
              this.nombreRazonSocial.equals(other.getNombreRazonSocial()))) &&
            ((this.RFC==null && other.getRFC()==null) || 
             (this.RFC!=null &&
              this.RFC.equals(other.getRFC()))) &&
            ((this.usoCFDI==null && other.getUsoCFDI()==null) || 
             (this.usoCFDI!=null &&
              this.usoCFDI.equals(other.getUsoCFDI())));
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
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getNombreRazonSocial() != null) {
            _hashCode += getNombreRazonSocial().hashCode();
        }
        if (getRFC() != null) {
            _hashCode += getRFC().hashCode();
        }
        if (getUsoCFDI() != null) {
            _hashCode += getUsoCFDI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceptorCFDI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ReceptorCFDI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DireccionCFDI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreRazonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "NombreRazonSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "RFC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usoCFDI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "UsoCFDI"));
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
