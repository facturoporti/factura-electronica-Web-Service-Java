/**
 * CancelarApiCFDIPeticion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class CancelarApiCFDIPeticion  implements java.io.Serializable {
    private java.lang.String PFX;

    private java.lang.String PFXPassword;

    private java.lang.String password;

    private java.lang.String RFC;

    private java.lang.String[] UUIDs;

    private java.lang.String usuario;

    public CancelarApiCFDIPeticion() {
    }

    public CancelarApiCFDIPeticion(
           java.lang.String PFX,
           java.lang.String PFXPassword,
           java.lang.String password,
           java.lang.String RFC,
           java.lang.String[] UUIDs,
           java.lang.String usuario) {
           this.PFX = PFX;
           this.PFXPassword = PFXPassword;
           this.password = password;
           this.RFC = RFC;
           this.UUIDs = UUIDs;
           this.usuario = usuario;
    }


    /**
     * Gets the PFX value for this CancelarApiCFDIPeticion.
     * 
     * @return PFX
     */
    public java.lang.String getPFX() {
        return PFX;
    }


    /**
     * Sets the PFX value for this CancelarApiCFDIPeticion.
     * 
     * @param PFX
     */
    public void setPFX(java.lang.String PFX) {
        this.PFX = PFX;
    }


    /**
     * Gets the PFXPassword value for this CancelarApiCFDIPeticion.
     * 
     * @return PFXPassword
     */
    public java.lang.String getPFXPassword() {
        return PFXPassword;
    }


    /**
     * Sets the PFXPassword value for this CancelarApiCFDIPeticion.
     * 
     * @param PFXPassword
     */
    public void setPFXPassword(java.lang.String PFXPassword) {
        this.PFXPassword = PFXPassword;
    }


    /**
     * Gets the password value for this CancelarApiCFDIPeticion.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CancelarApiCFDIPeticion.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the RFC value for this CancelarApiCFDIPeticion.
     * 
     * @return RFC
     */
    public java.lang.String getRFC() {
        return RFC;
    }


    /**
     * Sets the RFC value for this CancelarApiCFDIPeticion.
     * 
     * @param RFC
     */
    public void setRFC(java.lang.String RFC) {
        this.RFC = RFC;
    }


    /**
     * Gets the UUIDs value for this CancelarApiCFDIPeticion.
     * 
     * @return UUIDs
     */
    public java.lang.String[] getUUIDs() {
        return UUIDs;
    }


    /**
     * Sets the UUIDs value for this CancelarApiCFDIPeticion.
     * 
     * @param UUIDs
     */
    public void setUUIDs(java.lang.String[] UUIDs) {
        this.UUIDs = UUIDs;
    }


    /**
     * Gets the usuario value for this CancelarApiCFDIPeticion.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this CancelarApiCFDIPeticion.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelarApiCFDIPeticion)) return false;
        CancelarApiCFDIPeticion other = (CancelarApiCFDIPeticion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PFX==null && other.getPFX()==null) || 
             (this.PFX!=null &&
              this.PFX.equals(other.getPFX()))) &&
            ((this.PFXPassword==null && other.getPFXPassword()==null) || 
             (this.PFXPassword!=null &&
              this.PFXPassword.equals(other.getPFXPassword()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.RFC==null && other.getRFC()==null) || 
             (this.RFC!=null &&
              this.RFC.equals(other.getRFC()))) &&
            ((this.UUIDs==null && other.getUUIDs()==null) || 
             (this.UUIDs!=null &&
              java.util.Arrays.equals(this.UUIDs, other.getUUIDs()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getPFX() != null) {
            _hashCode += getPFX().hashCode();
        }
        if (getPFXPassword() != null) {
            _hashCode += getPFXPassword().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRFC() != null) {
            _hashCode += getRFC().hashCode();
        }
        if (getUUIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUUIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUUIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelarApiCFDIPeticion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarApiCFDIPeticion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "PFX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PFXPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "PFXPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UUIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "UUIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Usuario"));
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
