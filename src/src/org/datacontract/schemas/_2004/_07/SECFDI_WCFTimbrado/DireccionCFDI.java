/**
 * DireccionCFDI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class DireccionCFDI  implements java.io.Serializable {
    private java.lang.String calle;

    private java.lang.String clavePais;

    private java.lang.String codigoPostal;

    private java.lang.String colonia;

    private java.lang.String estado;

    private java.lang.String localidad;

    private java.lang.String municipio;

    private java.lang.String numeroExterior;

    private java.lang.String numeroInterior;

    private java.lang.String pais;

    private java.lang.String referencias;

    public DireccionCFDI() {
    }

    public DireccionCFDI(
           java.lang.String calle,
           java.lang.String clavePais,
           java.lang.String codigoPostal,
           java.lang.String colonia,
           java.lang.String estado,
           java.lang.String localidad,
           java.lang.String municipio,
           java.lang.String numeroExterior,
           java.lang.String numeroInterior,
           java.lang.String pais,
           java.lang.String referencias) {
           this.calle = calle;
           this.clavePais = clavePais;
           this.codigoPostal = codigoPostal;
           this.colonia = colonia;
           this.estado = estado;
           this.localidad = localidad;
           this.municipio = municipio;
           this.numeroExterior = numeroExterior;
           this.numeroInterior = numeroInterior;
           this.pais = pais;
           this.referencias = referencias;
    }


    /**
     * Gets the calle value for this DireccionCFDI.
     * 
     * @return calle
     */
    public java.lang.String getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this DireccionCFDI.
     * 
     * @param calle
     */
    public void setCalle(java.lang.String calle) {
        this.calle = calle;
    }


    /**
     * Gets the clavePais value for this DireccionCFDI.
     * 
     * @return clavePais
     */
    public java.lang.String getClavePais() {
        return clavePais;
    }


    /**
     * Sets the clavePais value for this DireccionCFDI.
     * 
     * @param clavePais
     */
    public void setClavePais(java.lang.String clavePais) {
        this.clavePais = clavePais;
    }


    /**
     * Gets the codigoPostal value for this DireccionCFDI.
     * 
     * @return codigoPostal
     */
    public java.lang.String getCodigoPostal() {
        return codigoPostal;
    }


    /**
     * Sets the codigoPostal value for this DireccionCFDI.
     * 
     * @param codigoPostal
     */
    public void setCodigoPostal(java.lang.String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    /**
     * Gets the colonia value for this DireccionCFDI.
     * 
     * @return colonia
     */
    public java.lang.String getColonia() {
        return colonia;
    }


    /**
     * Sets the colonia value for this DireccionCFDI.
     * 
     * @param colonia
     */
    public void setColonia(java.lang.String colonia) {
        this.colonia = colonia;
    }


    /**
     * Gets the estado value for this DireccionCFDI.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this DireccionCFDI.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the localidad value for this DireccionCFDI.
     * 
     * @return localidad
     */
    public java.lang.String getLocalidad() {
        return localidad;
    }


    /**
     * Sets the localidad value for this DireccionCFDI.
     * 
     * @param localidad
     */
    public void setLocalidad(java.lang.String localidad) {
        this.localidad = localidad;
    }


    /**
     * Gets the municipio value for this DireccionCFDI.
     * 
     * @return municipio
     */
    public java.lang.String getMunicipio() {
        return municipio;
    }


    /**
     * Sets the municipio value for this DireccionCFDI.
     * 
     * @param municipio
     */
    public void setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
    }


    /**
     * Gets the numeroExterior value for this DireccionCFDI.
     * 
     * @return numeroExterior
     */
    public java.lang.String getNumeroExterior() {
        return numeroExterior;
    }


    /**
     * Sets the numeroExterior value for this DireccionCFDI.
     * 
     * @param numeroExterior
     */
    public void setNumeroExterior(java.lang.String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }


    /**
     * Gets the numeroInterior value for this DireccionCFDI.
     * 
     * @return numeroInterior
     */
    public java.lang.String getNumeroInterior() {
        return numeroInterior;
    }


    /**
     * Sets the numeroInterior value for this DireccionCFDI.
     * 
     * @param numeroInterior
     */
    public void setNumeroInterior(java.lang.String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }


    /**
     * Gets the pais value for this DireccionCFDI.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this DireccionCFDI.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the referencias value for this DireccionCFDI.
     * 
     * @return referencias
     */
    public java.lang.String getReferencias() {
        return referencias;
    }


    /**
     * Sets the referencias value for this DireccionCFDI.
     * 
     * @param referencias
     */
    public void setReferencias(java.lang.String referencias) {
        this.referencias = referencias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DireccionCFDI)) return false;
        DireccionCFDI other = (DireccionCFDI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle()))) &&
            ((this.clavePais==null && other.getClavePais()==null) || 
             (this.clavePais!=null &&
              this.clavePais.equals(other.getClavePais()))) &&
            ((this.codigoPostal==null && other.getCodigoPostal()==null) || 
             (this.codigoPostal!=null &&
              this.codigoPostal.equals(other.getCodigoPostal()))) &&
            ((this.colonia==null && other.getColonia()==null) || 
             (this.colonia!=null &&
              this.colonia.equals(other.getColonia()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.localidad==null && other.getLocalidad()==null) || 
             (this.localidad!=null &&
              this.localidad.equals(other.getLocalidad()))) &&
            ((this.municipio==null && other.getMunicipio()==null) || 
             (this.municipio!=null &&
              this.municipio.equals(other.getMunicipio()))) &&
            ((this.numeroExterior==null && other.getNumeroExterior()==null) || 
             (this.numeroExterior!=null &&
              this.numeroExterior.equals(other.getNumeroExterior()))) &&
            ((this.numeroInterior==null && other.getNumeroInterior()==null) || 
             (this.numeroInterior!=null &&
              this.numeroInterior.equals(other.getNumeroInterior()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.referencias==null && other.getReferencias()==null) || 
             (this.referencias!=null &&
              this.referencias.equals(other.getReferencias())));
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
        if (getCalle() != null) {
            _hashCode += getCalle().hashCode();
        }
        if (getClavePais() != null) {
            _hashCode += getClavePais().hashCode();
        }
        if (getCodigoPostal() != null) {
            _hashCode += getCodigoPostal().hashCode();
        }
        if (getColonia() != null) {
            _hashCode += getColonia().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getLocalidad() != null) {
            _hashCode += getLocalidad().hashCode();
        }
        if (getMunicipio() != null) {
            _hashCode += getMunicipio().hashCode();
        }
        if (getNumeroExterior() != null) {
            _hashCode += getNumeroExterior().hashCode();
        }
        if (getNumeroInterior() != null) {
            _hashCode += getNumeroInterior().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getReferencias() != null) {
            _hashCode += getReferencias().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DireccionCFDI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DireccionCFDI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clavePais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ClavePais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CodigoPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colonia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Colonia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Localidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Municipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroExterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "NumeroExterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroInterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "NumeroInterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Referencias"));
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
