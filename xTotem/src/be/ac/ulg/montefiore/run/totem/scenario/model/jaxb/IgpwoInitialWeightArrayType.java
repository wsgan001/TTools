//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.28 at 12:33:07 CET 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for igpwoInitialWeightArrayType.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *   &lt;enumeration value="CURRENT"/>
 *   &lt;enumeration value="RANDOM"/>
 * &lt;/restriction>
 * </pre>
 * 
 */
public class IgpwoInitialWeightArrayType {

    private final static java.util.Map valueMap = new java.util.HashMap();
    public final static java.lang.String _CURRENT = com.sun.xml.bind.DatatypeConverterImpl.installHook("CURRENT");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType CURRENT = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType(_CURRENT);
    public final static java.lang.String _RANDOM = com.sun.xml.bind.DatatypeConverterImpl.installHook("RANDOM");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType RANDOM = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType(_RANDOM);
    private final java.lang.String lexicalValue;
    private final java.lang.String value;

    protected IgpwoInitialWeightArrayType(java.lang.String v) {
        value = v;
        lexicalValue = v;
        valueMap.put(v, this);
    }

    public java.lang.String toString() {
        return lexicalValue;
    }

    public java.lang.String getValue() {
        return value;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(java.lang.Object o) {
        return super.equals(o);
    }

    public static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType fromValue(java.lang.String value) {
        be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType t = ((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType) valueMap.get(value));
        if (t == null) {
            throw new java.lang.IllegalArgumentException();
        } else {
            return t;
        }
    }

    public static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.IgpwoInitialWeightArrayType fromString(java.lang.String str) {
        return fromValue(str);
    }

}
