/**
 * Estatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado;

public class Estatus  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.lang.String descripcion;

    private java.lang.Boolean detieneEjecucionProveedor;

    private java.lang.String fecha;

    private java.lang.String informacionTecnica;

    public Estatus() {
    }

    public Estatus(
           java.lang.String codigo,
           java.lang.String descripcion,
           java.lang.Boolean detieneEjecucionProveedor,
           java.lang.String fecha,
           java.lang.String informacionTecnica) {
           this.codigo = codigo;
           this.descripcion = descripcion;
           this.detieneEjecucionProveedor = detieneEjecucionProveedor;
           this.fecha = fecha;
           this.informacionTecnica = informacionTecnica;
    }


    /**
     * Gets the codigo value for this Estatus.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Estatus.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descripcion value for this Estatus.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Estatus.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the detieneEjecucionProveedor value for this Estatus.
     * 
     * @return detieneEjecucionProveedor
     */
    public java.lang.Boolean getDetieneEjecucionProveedor() {
        return detieneEjecucionProveedor;
    }


    /**
     * Sets the detieneEjecucionProveedor value for this Estatus.
     * 
     * @param detieneEjecucionProveedor
     */
    public void setDetieneEjecucionProveedor(java.lang.Boolean detieneEjecucionProveedor) {
        this.detieneEjecucionProveedor = detieneEjecucionProveedor;
    }


    /**
     * Gets the fecha value for this Estatus.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Estatus.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the informacionTecnica value for this Estatus.
     * 
     * @return informacionTecnica
     */
    public java.lang.String getInformacionTecnica() {
        return informacionTecnica;
    }


    /**
     * Sets the informacionTecnica value for this Estatus.
     * 
     * @param informacionTecnica
     */
    public void setInformacionTecnica(java.lang.String informacionTecnica) {
        this.informacionTecnica = informacionTecnica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Estatus)) return false;
        Estatus other = (Estatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.detieneEjecucionProveedor==null && other.getDetieneEjecucionProveedor()==null) || 
             (this.detieneEjecucionProveedor!=null &&
              this.detieneEjecucionProveedor.equals(other.getDetieneEjecucionProveedor()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.informacionTecnica==null && other.getInformacionTecnica()==null) || 
             (this.informacionTecnica!=null &&
              this.informacionTecnica.equals(other.getInformacionTecnica())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getDetieneEjecucionProveedor() != null) {
            _hashCode += getDetieneEjecucionProveedor().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getInformacionTecnica() != null) {
            _hashCode += getInformacionTecnica().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Estatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Estatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detieneEjecucionProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DetieneEjecucionProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informacionTecnica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "InformacionTecnica"));
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
