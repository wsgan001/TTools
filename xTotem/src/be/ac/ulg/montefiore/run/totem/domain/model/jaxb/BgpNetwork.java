//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.29 at 02:59:16 CET 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb;


/**
 * Java content class for bgpNetwork complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/monfort/Projects/run-totem/src/resources/domain/Domain-v1_3.xsd line 450)
 * <p>
 * <pre>
 * &lt;complexType name="bgpNetwork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="prefix" type="{}IPAddressMask" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BgpNetwork {


    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getPrefix();

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setPrefix(java.lang.String value);

    boolean isSetPrefix();

    void unsetPrefix();

}
