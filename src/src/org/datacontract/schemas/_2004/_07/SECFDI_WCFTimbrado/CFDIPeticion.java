/**
 * CFDIPeticion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class CFDIPeticion  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DatosGeneralesCFDI datosGenerales;

    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.EncabezadoCFDI encabezado;

    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ConceptoCFDI[] conceptos;

    private org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ComplementoCFDI complemento;

    public CFDIPeticion() {
    }

    public CFDIPeticion(
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DatosGeneralesCFDI datosGenerales,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.EncabezadoCFDI encabezado,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ConceptoCFDI[] conceptos,
           org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ComplementoCFDI complemento) {
           this.datosGenerales = datosGenerales;
           this.encabezado = encabezado;
           this.conceptos = conceptos;
           this.complemento = complemento;
    }


    /**
     * Gets the datosGenerales value for this CFDIPeticion.
     * 
     * @return datosGenerales
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DatosGeneralesCFDI getDatosGenerales() {
        return datosGenerales;
    }


    /**
     * Sets the datosGenerales value for this CFDIPeticion.
     * 
     * @param datosGenerales
     */
    public void setDatosGenerales(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DatosGeneralesCFDI datosGenerales) {
        this.datosGenerales = datosGenerales;
    }


    /**
     * Gets the encabezado value for this CFDIPeticion.
     * 
     * @return encabezado
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.EncabezadoCFDI getEncabezado() {
        return encabezado;
    }


    /**
     * Sets the encabezado value for this CFDIPeticion.
     * 
     * @param encabezado
     */
    public void setEncabezado(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.EncabezadoCFDI encabezado) {
        this.encabezado = encabezado;
    }


    /**
     * Gets the conceptos value for this CFDIPeticion.
     * 
     * @return conceptos
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ConceptoCFDI[] getConceptos() {
        return conceptos;
    }


    /**
     * Sets the conceptos value for this CFDIPeticion.
     * 
     * @param conceptos
     */
    public void setConceptos(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ConceptoCFDI[] conceptos) {
        this.conceptos = conceptos;
    }


    /**
     * Gets the complemento value for this CFDIPeticion.
     * 
     * @return complemento
     */
    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ComplementoCFDI getComplemento() {
        return complemento;
    }


    /**
     * Sets the complemento value for this CFDIPeticion.
     * 
     * @param complemento
     */
    public void setComplemento(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ComplementoCFDI complemento) {
        this.complemento = complemento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CFDIPeticion)) return false;
        CFDIPeticion other = (CFDIPeticion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosGenerales==null && other.getDatosGenerales()==null) || 
             (this.datosGenerales!=null &&
              this.datosGenerales.equals(other.getDatosGenerales()))) &&
            ((this.encabezado==null && other.getEncabezado()==null) || 
             (this.encabezado!=null &&
              this.encabezado.equals(other.getEncabezado()))) &&
            ((this.conceptos==null && other.getConceptos()==null) || 
             (this.conceptos!=null &&
              java.util.Arrays.equals(this.conceptos, other.getConceptos()))) &&
            ((this.complemento==null && other.getComplemento()==null) || 
             (this.complemento!=null &&
              this.complemento.equals(other.getComplemento())));
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
        if (getDatosGenerales() != null) {
            _hashCode += getDatosGenerales().hashCode();
        }
        if (getEncabezado() != null) {
            _hashCode += getEncabezado().hashCode();
        }
        if (getConceptos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConceptos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConceptos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComplemento() != null) {
            _hashCode += getComplemento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CFDIPeticion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDIPeticion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosGenerales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DatosGenerales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DatosGeneralesCFDI"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encabezado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Encabezado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "EncabezadoCFDI"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Conceptos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ConceptoCFDI"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ConceptoCFDI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Complemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ComplementoCFDI"));
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
