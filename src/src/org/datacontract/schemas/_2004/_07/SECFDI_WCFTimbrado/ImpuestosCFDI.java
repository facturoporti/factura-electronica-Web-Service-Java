/**
 * ImpuestosCFDI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class ImpuestosCFDI  implements java.io.Serializable {
    private java.lang.String base;

    private java.lang.String factor;

    private java.lang.String impuesto;

    private java.lang.String impuestoImporte;

    private java.lang.String tasa;

    private java.lang.String tipoImpuesto;

    public ImpuestosCFDI() {
    }

    public ImpuestosCFDI(
           java.lang.String base,
           java.lang.String factor,
           java.lang.String impuesto,
           java.lang.String impuestoImporte,
           java.lang.String tasa,
           java.lang.String tipoImpuesto) {
           this.base = base;
           this.factor = factor;
           this.impuesto = impuesto;
           this.impuestoImporte = impuestoImporte;
           this.tasa = tasa;
           this.tipoImpuesto = tipoImpuesto;
    }


    /**
     * Gets the base value for this ImpuestosCFDI.
     * 
     * @return base
     */
    public java.lang.String getBase() {
        return base;
    }


    /**
     * Sets the base value for this ImpuestosCFDI.
     * 
     * @param base
     */
    public void setBase(java.lang.String base) {
        this.base = base;
    }


    /**
     * Gets the factor value for this ImpuestosCFDI.
     * 
     * @return factor
     */
    public java.lang.String getFactor() {
        return factor;
    }


    /**
     * Sets the factor value for this ImpuestosCFDI.
     * 
     * @param factor
     */
    public void setFactor(java.lang.String factor) {
        this.factor = factor;
    }


    /**
     * Gets the impuesto value for this ImpuestosCFDI.
     * 
     * @return impuesto
     */
    public java.lang.String getImpuesto() {
        return impuesto;
    }


    /**
     * Sets the impuesto value for this ImpuestosCFDI.
     * 
     * @param impuesto
     */
    public void setImpuesto(java.lang.String impuesto) {
        this.impuesto = impuesto;
    }


    /**
     * Gets the impuestoImporte value for this ImpuestosCFDI.
     * 
     * @return impuestoImporte
     */
    public java.lang.String getImpuestoImporte() {
        return impuestoImporte;
    }


    /**
     * Sets the impuestoImporte value for this ImpuestosCFDI.
     * 
     * @param impuestoImporte
     */
    public void setImpuestoImporte(java.lang.String impuestoImporte) {
        this.impuestoImporte = impuestoImporte;
    }


    /**
     * Gets the tasa value for this ImpuestosCFDI.
     * 
     * @return tasa
     */
    public java.lang.String getTasa() {
        return tasa;
    }


    /**
     * Sets the tasa value for this ImpuestosCFDI.
     * 
     * @param tasa
     */
    public void setTasa(java.lang.String tasa) {
        this.tasa = tasa;
    }


    /**
     * Gets the tipoImpuesto value for this ImpuestosCFDI.
     * 
     * @return tipoImpuesto
     */
    public java.lang.String getTipoImpuesto() {
        return tipoImpuesto;
    }


    /**
     * Sets the tipoImpuesto value for this ImpuestosCFDI.
     * 
     * @param tipoImpuesto
     */
    public void setTipoImpuesto(java.lang.String tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImpuestosCFDI)) return false;
        ImpuestosCFDI other = (ImpuestosCFDI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.base==null && other.getBase()==null) || 
             (this.base!=null &&
              this.base.equals(other.getBase()))) &&
            ((this.factor==null && other.getFactor()==null) || 
             (this.factor!=null &&
              this.factor.equals(other.getFactor()))) &&
            ((this.impuesto==null && other.getImpuesto()==null) || 
             (this.impuesto!=null &&
              this.impuesto.equals(other.getImpuesto()))) &&
            ((this.impuestoImporte==null && other.getImpuestoImporte()==null) || 
             (this.impuestoImporte!=null &&
              this.impuestoImporte.equals(other.getImpuestoImporte()))) &&
            ((this.tasa==null && other.getTasa()==null) || 
             (this.tasa!=null &&
              this.tasa.equals(other.getTasa()))) &&
            ((this.tipoImpuesto==null && other.getTipoImpuesto()==null) || 
             (this.tipoImpuesto!=null &&
              this.tipoImpuesto.equals(other.getTipoImpuesto())));
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
        if (getBase() != null) {
            _hashCode += getBase().hashCode();
        }
        if (getFactor() != null) {
            _hashCode += getFactor().hashCode();
        }
        if (getImpuesto() != null) {
            _hashCode += getImpuesto().hashCode();
        }
        if (getImpuestoImporte() != null) {
            _hashCode += getImpuestoImporte().hashCode();
        }
        if (getTasa() != null) {
            _hashCode += getTasa().hashCode();
        }
        if (getTipoImpuesto() != null) {
            _hashCode += getTipoImpuesto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImpuestosCFDI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ImpuestosCFDI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impuesto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Impuesto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impuestoImporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ImpuestoImporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Tasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoImpuesto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TipoImpuesto"));
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
