/**
 * GetStaffInfoByFNameLName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStaffInfoByFNameLName  implements java.io.Serializable {
    private java.lang.String fName;

    private java.lang.String lName;

    public GetStaffInfoByFNameLName() {
    }

    public GetStaffInfoByFNameLName(
           java.lang.String fName,
           java.lang.String lName) {
           this.fName = fName;
           this.lName = lName;
    }


    /**
     * Gets the fName value for this GetStaffInfoByFNameLName.
     * 
     * @return fName
     */
    public java.lang.String getFName() {
        return fName;
    }


    /**
     * Sets the fName value for this GetStaffInfoByFNameLName.
     * 
     * @param fName
     */
    public void setFName(java.lang.String fName) {
        this.fName = fName;
    }


    /**
     * Gets the lName value for this GetStaffInfoByFNameLName.
     * 
     * @return lName
     */
    public java.lang.String getLName() {
        return lName;
    }


    /**
     * Sets the lName value for this GetStaffInfoByFNameLName.
     * 
     * @param lName
     */
    public void setLName(java.lang.String lName) {
        this.lName = lName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaffInfoByFNameLName)) return false;
        GetStaffInfoByFNameLName other = (GetStaffInfoByFNameLName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fName==null && other.getFName()==null) || 
             (this.fName!=null &&
              this.fName.equals(other.getFName()))) &&
            ((this.lName==null && other.getLName()==null) || 
             (this.lName!=null &&
              this.lName.equals(other.getLName())));
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
        if (getFName() != null) {
            _hashCode += getFName().hashCode();
        }
        if (getLName() != null) {
            _hashCode += getLName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaffInfoByFNameLName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStaffInfoByFNameLName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
