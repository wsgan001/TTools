//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.29 at 02:59:16 CET 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl;

public class NodeInterfaceImpl implements be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
{

    protected be.ac.ulg.montefiore.run.totem.domain.model.jaxb.StatusType _Status;
    protected be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.IpType _Ip;
    protected java.lang.String _Id;
    public final static java.lang.Class version = (be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.class);
    }

    public be.ac.ulg.montefiore.run.totem.domain.model.jaxb.StatusType getStatus() {
        return _Status;
    }

    public void setStatus(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.StatusType value) {
        _Status = value;
    }

    public boolean isSetStatus() {
        return (_Status!= null);
    }

    public void unsetStatus() {
        _Status = null;
    }

    public be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.IpType getIp() {
        return _Ip;
    }

    public void setIp(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.IpType value) {
        _Ip = value;
    }

    public boolean isSetIp() {
        return (_Ip!= null);
    }

    public void unsetIp() {
        _Ip = null;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public boolean isSetId() {
        return (_Id!= null);
    }

    public void unsetId() {
        _Id = null;
    }

    public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
        return new be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.NodeInterfaceImpl.Unmarshaller(context);
    }

    public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_Status!= null) {
            context.startElement("", "status");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((be.ac.ulg.montefiore.run.totem.domain.model.jaxb.StatusType) _Status).toString(), "Status");
            } catch (java.lang.Exception e) {
                be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        if (_Ip!= null) {
            context.startElement("", "ip");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Ip), "Ip");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Ip), "Ip");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Ip), "Ip");
            context.endElement();
        }
    }

    public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startAttribute("", "id");
        try {
            context.text(((java.lang.String) _Id), "Id");
        } catch (java.lang.Exception e) {
            be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
    }

    public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolea"
+"n\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.Dat"
+"aExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exc"
+"eptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000)c"
+"om.sun.msv.datatype.xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006values"
+"t\u0000\u000fLjava/util/Set;xr\u00009com.sun.msv.datatype.xsd.DataTypeWithV"
+"alueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.D"
+"ataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckF"
+"lagL\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000"
+"\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfa"
+"cetNamet\u0000\u0012Ljava/lang/String;xr\u0000\'com.sun.msv.datatype.xsd.XSD"
+"atatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001aL\u0000\btypeNameq\u0000~\u0000\u001aL\u0000"
+"\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;"
+"xpt\u0000\u0000t\u0000\nstatusTypesr\u00005com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.White"
+"SpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.St"
+"ringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype."
+"xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd"
+".ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001bt\u0000 http://www.w3.org/2001/XMLS"
+"chemat\u0000\u0006stringq\u0000~\u0000\"\u0001q\u0000~\u0000&t\u0000\u000benumerationsr\u0000\u0011java.util.HashSet"
+"\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0002t\u0000\u0004DOWNt\u0000\u0002UPxsr\u00000com.sun.msv.gram"
+"mar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.s"
+"un.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001aL\u0000\fnamespa"
+"ceURIq\u0000~\u0000\u001axpq\u0000~\u0000\u001fq\u0000~\u0000\u001esq\u0000~\u0000\u0007ppsr\u0000 com.sun.msv.grammar.Attrib"
+"uteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003q\u0000~\u0000\u000epsq\u0000"
+"~\u0000\u0010ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000$"
+"q\u0000~\u0000\'t\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcesso"
+"r$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000!q\u0000~\u0000/sq\u0000~\u00000q\u0000~\u00008q\u0000~\u0000\'sr\u0000#com.sun."
+"msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001aL\u0000\fna"
+"mespaceURIq\u0000~\u0000\u001axr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"pt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com."
+"sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\u0003sq\u0000~\u0000\r\u0001q\u0000~\u0000Bsq\u0000~\u0000<t\u0000\u0006statusq\u0000~\u0000\u001eq\u0000~\u0000Bsq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\u000ep\u0000s"
+"q\u0000~\u0000\u0000ppsq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003exp"
+"q\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsq\u0000~\u00003q\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Express"
+"ion$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000Cq\u0000~\u0000Psr\u0000 com.su"
+"n.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000=q\u0000~\u0000Bsq\u0000~\u0000<t\u0000Ebe."
+"ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface."
+"IpTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0007pp"
+"sq\u0000~\u00003q\u0000~\u0000\u000epq\u0000~\u00005q\u0000~\u0000>q\u0000~\u0000Bsq\u0000~\u0000<t\u0000\u0002ipq\u0000~\u0000\u001eq\u0000~\u0000Bsq\u0000~\u00003ppsq\u0000~"
+"\u0000\u0010ppsr\u0000\'com.sun.msv.datatype.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000"
+"\nfinalValuexr\u0000\u001ecom.sun.msv.datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bb"
+"aseTypeq\u0000~\u0000\u0018xq\u0000~\u0000\u001bq\u0000~\u0000\u001et\u0000\u000finterfaceIdTypeq\u0000~\u0000\"q\u0000~\u0000&\u0000\u0000\u0000\u0000q\u0000~\u0000/"
+"sq\u0000~\u00000q\u0000~\u0000(q\u0000~\u0000\u001esq\u0000~\u0000<t\u0000\u0002idq\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.Expr"
+"essionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expr"
+"essionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPo"
+"ol$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$"
+"Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\n\u0001pq\u0000~\u0000Fq\u0000~\u0000Mq\u0000~\u0000Hq"
+"\u0000~\u0000\bq\u0000~\u0000\u000fq\u0000~\u0000Jq\u0000~\u00002q\u0000~\u0000Vq\u0000~\u0000\u0005q\u0000~\u0000\u0006x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public static class IpTypeImpl implements be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.IpType, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
    {

        protected java.lang.String _Value;
        protected java.lang.String _Mask;
        public final static java.lang.Class version = (be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.JAXBVersion.class);
        private static com.sun.msv.grammar.Grammar schemaFragment;

        private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
            return (be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.IpType.class);
        }

        public java.lang.String getValue() {
            return _Value;
        }

        public void setValue(java.lang.String value) {
            _Value = value;
        }

        public boolean isSetValue() {
            return (_Value!= null);
        }

        public void unsetValue() {
            _Value = null;
        }

        public java.lang.String getMask() {
            return _Mask;
        }

        public void setMask(java.lang.String value) {
            _Mask = value;
        }

        public boolean isSetMask() {
            return (_Mask!= null);
        }

        public void unsetMask() {
            _Mask = null;
        }

        public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            return new be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.NodeInterfaceImpl.IpTypeImpl.Unmarshaller(context);
        }

        public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            try {
                context.text(((java.lang.String) _Value), "Value");
            } catch (java.lang.Exception e) {
                be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
            }
        }

        public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            context.startAttribute("", "mask");
            try {
                context.text(((java.lang.String) _Mask), "Mask");
            } catch (java.lang.Exception e) {
                be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }

        public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
        }

        public java.lang.Class getPrimaryInterface() {
            return (be.ac.ulg.montefiore.run.totem.domain.model.jaxb.NodeInterface.IpType.class);
        }

        public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
            if (schemaFragment == null) {
                schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000%com.sun.msv.da"
+"tatype.xsd.PatternFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001[\u0000\bpatternst\u0000\u0013[Ljava/lang/"
+"String;xr\u0000;com.sun.msv.datatype.xsd.DataTypeWithLexicalConst"
+"raintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWi"
+"thFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbas"
+"eTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcrete"
+"Typet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNamet\u0000"
+"\u0012Ljava/lang/String;xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeIm"
+"pl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u0010L\u0000\btypeNameq\u0000~\u0000\u0010L\u0000\nwhiteSpa"
+"cet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000\u0000t\u0000\tI"
+"PAddresssr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Pre"
+"serve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProce"
+"ssor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.Builti"
+"nAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0011t\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006st"
+"ringq\u0000~\u0000\u0018\u0001q\u0000~\u0000\u001ct\u0000\u0007patternur\u0000\u0013[Ljava.lang.String;\u00ad\u00d2V\u00e7\u00e9\u001d{G\u0002\u0000\u0000x"
+"p\u0000\u0000\u0000\u0001t\u0000\u0098((0|1[0-9]{0,2}|2[6-9]{0,1}|2[0-4][0-9]{0,1}|25[0-5]"
+"{0,1}|[3-9][0-9]{0,1}).){3}(0|1[0-9]{0,2}|2[6-9]{0,1}|2[0-4]"
+"[0-9]{0,1}|25[0-5]{0,1}|[3-9][0-9]{0,1})sr\u00000com.sun.msv.gram"
+"mar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.s"
+"un.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0010L\u0000\fnamespa"
+"ceURIq\u0000~\u0000\u0010xpq\u0000~\u0000\u0015q\u0000~\u0000\u0014sr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Name"
+"Class;xq\u0000~\u0000\u0003ppsq\u0000~\u0000\u0006ppsq\u0000~\u0000\nq\u0000~\u0000\u0014t\u0000\rIPAddressMaskq\u0000~\u0000\u0018\u0000\u0000q\u0000~\u0000"
+"\u001cq\u0000~\u0000\u001cq\u0000~\u0000\u001fuq\u0000~\u0000 \u0000\u0000\u0000\u0001t\u0000\u00be((0|1[0-9]{0,2}|2[6-9]{0,1}|2[0-4][0"
+"-9]{0,1}|25[0-5]{0,1}|[3-9][0-9]{0,1}).){3}(0|1[0-9]{0,2}|2["
+"6-9]{0,1}|2[0-4][0-9]{0,1}|25[0-5]{0,1}|[3-9][0-9]{0,1})/(0|"
+"[1-2][0-9]{0,1}|3[0-2]{0,1}|[4-9])q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000,q\u0000~\u0000\u0014sr\u0000#c"
+"om.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~"
+"\u0000\u0010L\u0000\fnamespaceURIq\u0000~\u0000\u0010xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004maskq\u0000~\u0000\u0014sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$C"
+"losedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHas"
+"h\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv"
+"/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0001\u0001pq\u0000~\u0000\u0005x"));
            }
            return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
        }

        public class Unmarshaller
            extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
        {


            public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
                super(context, "-----");
            }

            protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
                this(context);
                state = startState;
            }

            public java.lang.Object owner() {
                return be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.NodeInterfaceImpl.IpTypeImpl.this;
            }

            public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  0 :
                            attIdx = context.getAttribute("", "mask");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  4 :
                            revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                            return ;
                    }
                    super.enterElement(___uri, ___local, ___qname, __atts);
                    break;
                }
            }

            private void eatText1(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                try {
                    _Mask = value;
                } catch (java.lang.Exception e) {
                    handleParseConversionException(e);
                }
            }

            public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  0 :
                            attIdx = context.getAttribute("", "mask");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  4 :
                            revertToParentFromLeaveElement(___uri, ___local, ___qname);
                            return ;
                    }
                    super.leaveElement(___uri, ___local, ___qname);
                    break;
                }
            }

            public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  0 :
                            if (("mask" == ___local)&&("" == ___uri)) {
                                state = 1;
                                return ;
                            }
                            break;
                        case  4 :
                            revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.enterAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  0 :
                            attIdx = context.getAttribute("", "mask");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                        case  2 :
                            if (("mask" == ___local)&&("" == ___uri)) {
                                state = 3;
                                return ;
                            }
                            break;
                        case  4 :
                            revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.leaveAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void handleText(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    try {
                        switch (state) {
                            case  0 :
                                attIdx = context.getAttribute("", "mask");
                                if (attIdx >= 0) {
                                    final java.lang.String v = context.eatAttribute(attIdx);
                                    eatText1(v);
                                    state = 3;
                                    continue outer;
                                }
                                break;
                            case  3 :
                                eatText2(value);
                                state = 4;
                                return ;
                            case  1 :
                                eatText1(value);
                                state = 2;
                                return ;
                            case  4 :
                                revertToParentFromText(value);
                                return ;
                        }
                    } catch (java.lang.RuntimeException e) {
                        handleUnexpectedTextException(value, e);
                    }
                    break;
                }
            }

            private void eatText2(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                try {
                    _Value = value;
                } catch (java.lang.Exception e) {
                    handleParseConversionException(e);
                }
            }

        }

    }

    public class Unmarshaller
        extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.NodeInterfaceImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("status" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  6 :
                        if (("ip" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        state = 9;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "mask");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  5 :
                        if (("status" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "mask");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("ip" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        state = 6;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  7 :
                        if (("mask" == ___local)&&("" == ___uri)) {
                            _Ip = ((be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.NodeInterfaceImpl.IpTypeImpl) spawnChildFromEnterAttribute((be.ac.ulg.montefiore.run.totem.domain.model.jaxb.impl.NodeInterfaceImpl.IpTypeImpl.class), 8, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        state = 6;
                        continue outer;
                    case  6 :
                        state = 9;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "mask");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  9 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            state = 6;
                            continue outer;
                        case  4 :
                            eatText2(value);
                            state = 5;
                            return ;
                        case  6 :
                            state = 9;
                            continue outer;
                        case  7 :
                            attIdx = context.getAttribute("", "mask");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  9 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Status = be.ac.ulg.montefiore.run.totem.domain.model.jaxb.StatusType.fromString(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}