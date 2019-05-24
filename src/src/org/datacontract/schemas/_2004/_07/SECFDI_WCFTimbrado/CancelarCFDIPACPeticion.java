/**
 * CancelarCFDIPACPeticion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class CancelarCFDIPACPeticion  implements java.io.Serializable {
    private java.lang.String[] UUID;

    private byte[] PFX;

    private java.lang.String password;

    private java.lang.String RFC;

    public CancelarCFDIPACPeticion() {
    }

    public CancelarCFDIPACPeticion(
           java.lang.String[] UUID,
           byte[] PFX,
           java.lang.String password,
           java.lang.String RFC) {
           this.UUID = UUID;
           this.PFX = PFX;
           this.password = password;
           this.RFC = RFC;
    }


    /**
     * Gets the UUID value for this CancelarCFDIPACPeticion.
     * 
     * @return UUID
     */
    public java.lang.String[] getUUID() {
        return UUID;
    }


    /**
     * Sets the UUID value for this CancelarCFDIPACPeticion.
     * 
     * @param UUID
     */
    public void setUUID(java.lang.String[] UUID) {
        this.UUID = UUID;
    }


    /**
     * Gets the PFX value for this CancelarCFDIPACPeticion.
     * 
     * @return PFX
     */
    public byte[] getPFX() {
        return PFX;
    }


    /**
     * Sets the PFX value for this CancelarCFDIPACPeticion.
     * 
     * @param PFX
     */
    public void setPFX(byte[] PFX) {
        this.PFX = PFX;
    }


    /**
     * Gets the password value for this CancelarCFDIPACPeticion.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CancelarCFDIPACPeticion.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the RFC value for this CancelarCFDIPACPeticion.
     * 
     * @return RFC
     */
    public java.lang.String getRFC() {
        return RFC;
    }


    /**
     * Sets the RFC value for this CancelarCFDIPACPeticion.
     * 
     * @param RFC
     */
    public void setRFC(java.lang.String RFC) {
        this.RFC = RFC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelarCFDIPACPeticion)) return false;
        CancelarCFDIPACPeticion other = (CancelarCFDIPACPeticion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UUID==null && other.getUUID()==null) || 
             (this.UUID!=null &&
              java.util.Arrays.equals(this.UUID, other.getUUID()))) &&
            ((this.PFX==null && other.getPFX()==null) || 
             (this.PFX!=null &&
              java.util.Arrays.equals(this.PFX, other.getPFX()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.RFC==null && other.getRFC()==null) || 
             (this.RFC!=null &&
              this.RFC.equals(other.getRFC())));
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
        if (getUUID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUUID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUUID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPFX() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPFX());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPFX(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRFC() != null) {
            _hashCode += getRFC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelarCFDIPACPeticion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIPACPeticion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "UUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "PFX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RFC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "RFC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
