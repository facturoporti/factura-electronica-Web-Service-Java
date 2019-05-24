/**
 * SoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SoapStub extends org.apache.axis.client.Stub implements org.tempuri.ICertificar {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Autenticar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "AutenticarPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "AutenticarRespuesta"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "AutenticarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelarCFDICualquierPAC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "parametroSeguridad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "AutenticarPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIPACPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIPACPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIRespuesta"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "CancelarCFDICualquierPACResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TimbradoMultiEmpresas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "parametroSeguridad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "AutenticarPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "parametro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TimbrarCFDIPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TimbrarCFDIRespuesta"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TimbradoMultiEmpresasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApiTimbrarCFDI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "cfdi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDIPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDIPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "GeneraCFDIApiRespuesta"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ApiTimbrarCFDIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApiCancelarCFDI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "cfdi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarApiCFDIPeticion"), org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarApiCFDIPeticion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIRespuesta"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ApiCancelarCFDIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public SoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ArrayOfConceptoCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ConceptoCFDI[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ConceptoCFDI");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ConceptoCFDI");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ArrayOfDireccionCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DireccionCFDI[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DireccionCFDI");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DireccionCFDI");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ArrayOfDocumentoRelacionadosPagos");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DocumentoRelacionadosPagos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DocumentoRelacionadosPagos");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DocumentoRelacionadosPagos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ArrayOfFoliosRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.FoliosRespuesta[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FoliosRespuesta");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FoliosRespuesta");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ArrayOfImpuestosCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ImpuestosCFDI[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ImpuestosCFDI");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ImpuestosCFDI");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ArrayOfPagos");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Pagos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pagos");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pagos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "AutenticarPeticion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "AutenticarRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarApiCFDIPeticion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarApiCFDIPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIPACPeticion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIPACPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CancelarCFDIRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDIPeticion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDIPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDITimbradoRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbradoRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "CFDITimbreRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDITimbreRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ComplementoCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ComplementoCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ConceptoCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ConceptoCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DatosGeneralesCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DatosGeneralesCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DireccionCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DireccionCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "DocumentoRelacionadosPagos");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.DocumentoRelacionadosPagos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Donativos");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Donativos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "EmisorCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.EmisorCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "EncabezadoCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.EncabezadoCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Estatus");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Estatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "FoliosRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.FoliosRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "GeneraCFDIApiRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ImpuestosCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ImpuestosCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Pagos");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Pagos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "ReceptorCFDI");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.ReceptorCFDI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TimbrarCFDIPeticion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "TimbrarCFDIRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "Timbre");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.Timbre.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SECFDI.WCFTimbrado", "WCFRespuesta");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.WCFRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta autenticar(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ICertificar/Autenticar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Autenticar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarRespuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta cancelarCFDICualquierPAC(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametroSeguridad, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIPACPeticion parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ICertificar/CancelarCFDICualquierPAC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "CancelarCFDICualquierPAC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametroSeguridad, parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta timbradoMultiEmpresas(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.AutenticarPeticion parametroSeguridad, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIPeticion parametro) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ICertificar/TimbradoMultiEmpresas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TimbradoMultiEmpresas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parametroSeguridad, parametro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.TimbrarCFDIRespuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta apiTimbrarCFDI(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CFDIPeticion cfdi) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ICertificar/ApiTimbrarCFDI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ApiTimbrarCFDI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cfdi});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.GeneraCFDIApiRespuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta apiCancelarCFDI(org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarApiCFDIPeticion cfdi) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ICertificar/ApiCancelarCFDI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ApiCancelarCFDI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cfdi});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.SECFDI_WCFTimbrado.CancelarCFDIRespuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
