/**
 * Timbre.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class Timbre  implements java.io.Serializable {
    private java.lang.String idVersionTimbrado;

    private java.lang.String UUID;

    private java.lang.String cadenaOriginal;

    private java.lang.String selloCFD;

    private java.lang.String selloSAT;

    private java.lang.String noCertificado;

    private java.lang.String fecha;

    private java.lang.String rfcProvCertif;

    private java.lang.String leyenda;

    private java.lang.String timbreXML;

    public Timbre() {
    }

    public Timbre(
           java.lang.String idVersionTimbrado,
           java.lang.String UUID,
           java.lang.String cadenaOriginal,
           java.lang.String selloCFD,
           java.lang.String selloSAT,
           java.lang.String noCertificado,
           java.lang.String fecha,
           java.lang.String rfcProvCertif,
           java.lang.String leyenda,
           java.lang.String timbreXML) {
           this.idVersionTimbrado = idVersionTimbrado;
           this.UUID = UUID;
           this.cadenaOriginal = cadenaOriginal;
           this.selloCFD = selloCFD;
           this.selloSAT = selloSAT;
           this.noCertificado = noCertificado;
           this.fecha = fecha;
           this.rfcProvCertif = rfcProvCertif;
           this.leyenda = leyenda;
           this.timbreXML = timbreXML;
    }


    /**
     * Gets the idVersionTimbrado value for this Timbre.
     * 
     * @return idVersionTimbrado
     */
    public java.lang.String getIdVersionTimbrado() {
        return idVersionTimbrado;
    }


    /**
     * Sets the idVersionTimbrado value for this Timbre.
     * 
     * @param idVersionTimbrado
     */
    public void setIdVersionTimbrado(java.lang.String idVersionTimbrado) {
        this.idVersionTimbrado = idVersionTimbrado;
    }


    /**
     * Gets the UUID value for this Timbre.
     * 
     * @return UUID
     */
    public java.lang.String getUUID() {
        return UUID;
    }


    /**
     * Sets the UUID value for this Timbre.
     * 
     * @param UUID
     */
    public void setUUID(java.lang.String UUID) {
        this.UUID = UUID;
    }


    /**
     * Gets the cadenaOriginal value for this Timbre.
     * 
     * @return cadenaOriginal
     */
    public java.lang.String getCadenaOriginal() {
        return cadenaOriginal;
    }


    /**
     * Sets the cadenaOriginal value for this Timbre.
     * 
     * @param cadenaOriginal
     */
    public void setCadenaOriginal(java.lang.String cadenaOriginal) {
        this.cadenaOriginal = cadenaOriginal;
    }


    /**
     * Gets the selloCFD value for this Timbre.
     * 
     * @return selloCFD
     */
    public java.lang.String getSelloCFD() {
        return selloCFD;
    }


    /**
     * Sets the selloCFD value for this Timbre.
     * 
     * @param selloCFD
     */
    public void setSelloCFD(java.lang.String selloCFD) {
        this.selloCFD = selloCFD;
    }


    /**
     * Gets the selloSAT value for this Timbre.
     * 
     * @return selloSAT
     */
    public java.lang.String getSelloSAT() {
        return selloSAT;
    }


    /**
     * Sets the selloSAT value for this Timbre.
     * 
     * @param selloSAT
     */
    public void setSelloSAT(java.lang.String selloSAT) {
        this.selloSAT = selloSAT;
    }


    /**
     * Gets the noCertificado value for this Timbre.
     * 
     * @return noCertificado
     */
    public java.lang.String getNoCertificado() {
        return noCertificado;
    }


    /**
     * Sets the noCertificado value for this Timbre.
     * 
     * @param noCertificado
     */
    public void setNoCertificado(java.lang.String noCertificado) {
        this.noCertificado = noCertificado;
    }


    /**
     * Gets the fecha value for this Timbre.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Timbre.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the rfcProvCertif value for this Timbre.
     * 
     * @return rfcProvCertif
     */
    public java.lang.String getRfcProvCertif() {
        return rfcProvCertif;
    }


    /**
     * Sets the rfcProvCertif value for this Timbre.
     * 
     * @param rfcProvCertif
     */
    public void setRfcProvCertif(java.lang.String rfcProvCertif) {
        this.rfcProvCertif = rfcProvCertif;
    }


    /**
     * Gets the leyenda value for this Timbre.
     * 
     * @return leyenda
     */
    public java.lang.String getLeyenda() {
        return leyenda;
    }


    /**
     * Sets the leyenda value for this Timbre.
     * 
     * @param leyenda
     */
    public void setLeyenda(java.lang.String leyenda) {
        this.leyenda = leyenda;
    }


    /**
     * Gets the timbreXML value for this Timbre.
     * 
     * @return timbreXML
     */
    public java.lang.String getTimbreXML() {
        return timbreXML;
    }


    /**
     * Sets the timbreXML value for this Timbre.
     * 
     * @param timbreXML
     */
    public void setTimbreXML(java.lang.String timbreXML) {
        this.timbreXML = timbreXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Timbre)) return false;
        Timbre other = (Timbre) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idVersionTimbrado==null && other.getIdVersionTimbrado()==null) || 
             (this.idVersionTimbrado!=null &&
              this.idVersionTimbrado.equals(other.getIdVersionTimbrado()))) &&
            ((this.UUID==null && other.getUUID()==null) || 
             (this.UUID!=null &&
              this.UUID.equals(other.getUUID()))) &&
            ((this.cadenaOriginal==null && other.getCadenaOriginal()==null) || 
             (this.cadenaOriginal!=null &&
              this.cadenaOriginal.equals(other.getCadenaOriginal()))) &&
            ((this.selloCFD==null && other.getSelloCFD()==null) || 
             (this.selloCFD!=null &&
              this.selloCFD.equals(other.getSelloCFD()))) &&
            ((this.selloSAT==null && other.getSelloSAT()==null) || 
             (this.selloSAT!=null &&
              this.selloSAT.equals(other.getSelloSAT()))) &&
            ((this.noCertificado==null && other.getNoCertificado()==null) || 
             (this.noCertificado!=null &&
              this.noCertificado.equals(other.getNoCertificado()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.rfcProvCertif==null && other.getRfcProvCertif()==null) || 
             (this.rfcProvCertif!=null &&
              this.rfcProvCertif.equals(other.getRfcProvCertif()))) &&
            ((this.leyenda==null && other.getLeyenda()==null) || 
             (this.leyenda!=null &&
              this.leyenda.equals(other.getLeyenda()))) &&
            ((this.timbreXML==null && other.getTimbreXML()==null) || 
             (this.timbreXML!=null &&
              this.timbreXML.equals(other.getTimbreXML())));
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
        if (getIdVersionTimbrado() != null) {
            _hashCode += getIdVersionTimbrado().hashCode();
        }
        if (getUUID() != null) {
            _hashCode += getUUID().hashCode();
        }
        if (getCadenaOriginal() != null) {
            _hashCode += getCadenaOriginal().hashCode();
        }
        if (getSelloCFD() != null) {
            _hashCode += getSelloCFD().hashCode();
        }
        if (getSelloSAT() != null) {
            _hashCode += getSelloSAT().hashCode();
        }
        if (getNoCertificado() != null) {
            _hashCode += getNoCertificado().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getRfcProvCertif() != null) {
            _hashCode += getRfcProvCertif().hashCode();
        }
        if (getLeyenda() != null) {
            _hashCode += getLeyenda().hashCode();
        }
        if (getTimbreXML() != null) {
            _hashCode += getTimbreXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Timbre.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Timbre"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idVersionTimbrado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "IdVersionTimbrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "UUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cadenaOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CadenaOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selloCFD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "SelloCFD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selloSAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "SelloSAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "NoCertificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfcProvCertif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "RfcProvCertif"));
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
        elemField.setFieldName("timbreXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TimbreXML"));
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
