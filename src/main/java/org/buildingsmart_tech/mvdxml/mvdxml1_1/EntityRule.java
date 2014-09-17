//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.13 at 04:20:51 PM CET 
//


package org.buildingsmart_tech.mvdxml.mvdxml1_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://buildingsmart-tech.org/mvdXML/mvdXML1-1}AbstractRule">
 *       &lt;sequence>
 *         &lt;element name="AttributeRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvdXML/mvdXML1-1}AttributeRule"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EntityRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element ref="{http://buildingsmart-tech.org/mvdXML/mvdXML1-1}EntityRule"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="Constraint">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="EntityName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Cardinality" type="{http://buildingsmart-tech.org/mvdXML/mvdXML1-1}Cardinality" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityRule", propOrder = {
    "attributeRules",
    "entityRules",
    "constraints"
})
public class EntityRule
    extends AbstractRule
{

    @XmlElement(name = "AttributeRules")
    protected EntityRule.AttributeRules attributeRules;
    @XmlElement(name = "EntityRules")
    protected EntityRule.EntityRules entityRules;
    @XmlElement(name = "Constraints")
    protected EntityRule.Constraints constraints;
    @XmlAttribute(name = "EntityName", required = true)
    protected String entityName;
    @XmlAttribute(name = "Cardinality")
    protected String cardinality;

    /**
     * Gets the value of the attributeRules property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.AttributeRules }
     *     
     */
    public EntityRule.AttributeRules getAttributeRules() {
        return attributeRules;
    }

    /**
     * Sets the value of the attributeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.AttributeRules }
     *     
     */
    public void setAttributeRules(EntityRule.AttributeRules value) {
        this.attributeRules = value;
    }

    /**
     * Gets the value of the entityRules property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.EntityRules }
     *     
     */
    public EntityRule.EntityRules getEntityRules() {
        return entityRules;
    }

    /**
     * Sets the value of the entityRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.EntityRules }
     *     
     */
    public void setEntityRules(EntityRule.EntityRules value) {
        this.entityRules = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRule.Constraints }
     *     
     */
    public EntityRule.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRule.Constraints }
     *     
     */
    public void setConstraints(EntityRule.Constraints value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element ref="{http://buildingsmart-tech.org/mvdXML/mvdXML1-1}AttributeRule"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attributeRule"
    })
    public static class AttributeRules {

        @XmlElement(name = "AttributeRule", required = true, nillable = true)
        protected List<AttributeRule> attributeRule;

        /**
         * Gets the value of the attributeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeRule }
         * 
         * 
         */
        public List<AttributeRule> getAttributeRule() {
            if (attributeRule == null) {
                attributeRule = new ArrayList<AttributeRule>();
            }
            return this.attributeRule;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="Constraint">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "constraint"
    })
    public static class Constraints {

        @XmlElement(name = "Constraint", required = true)
        protected List<EntityRule.Constraints.Constraint> constraint;

        /**
         * Gets the value of the constraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityRule.Constraints.Constraint }
         * 
         * 
         */
        public List<EntityRule.Constraints.Constraint> getConstraint() {
            if (constraint == null) {
                constraint = new ArrayList<EntityRule.Constraints.Constraint>();
            }
            return this.constraint;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Expression" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Constraint {

            @XmlAttribute(name = "Expression", required = true)
            protected String expression;

            /**
             * Gets the value of the expression property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpression() {
                return expression;
            }

            /**
             * Sets the value of the expression property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpression(String value) {
                this.expression = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element ref="{http://buildingsmart-tech.org/mvdXML/mvdXML1-1}EntityRule"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entityRule"
    })
    public static class EntityRules {

        @XmlElement(name = "EntityRule", required = true)
        protected List<EntityRule> entityRule;

        /**
         * Gets the value of the entityRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entityRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntityRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntityRule }
         * 
         * 
         */
        public List<EntityRule> getEntityRule() {
            if (entityRule == null) {
                entityRule = new ArrayList<EntityRule>();
            }
            return this.entityRule;
        }

    }

}
