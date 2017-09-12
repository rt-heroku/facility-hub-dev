/*
 * Created on 2017-09-12 ( Time 13:14:27 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package com.wm.entities;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "facility__c"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="facility__c", schema="salesforce" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Facility.countAll", query="SELECT COUNT(x) FROM Facility x" )
} )
public class Facility implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddate")
    private Date       createddate  ;


    @Column(name="facility_type_numeric_code__c")
    private Double     facilityTypeNumericCodeCustom ;


    @Column(name="landfill_hazardous_service__c", length=4099)
    private String     landfillHazardousServiceCustom ;


    @Column(name="mailing_address_2__c", length=50)
    private String     mailingAddress2Custom ;


    @Column(name="landfill_email__c", length=80)
    private String     landfillEmailCustom ;


    @Column(name="actual_postal_code__c", length=50)
    private String     actualPostalCodeCustom ;


    @Column(name="actual_city__c", length=50)
    private String     actualCityCustom ;


    @Column(name="facility_type_alpha_code__c", length=1)
    private String     facilityTypeAlphaCodeCustom ;


    @Column(name="mailing_address_3__c", length=50)
    private String     mailingAddress3Custom ;


    @Column(name="operating_schedule__c", length=18)
    private String     operatingScheduleCustom ;


    @Column(name="sfid", length=18)
    private String     sfid         ;


    @Column(name="facility_sales_contact_info__c", length=18)
    private String     facilitySalesContactInfoCustom ;


    @Column(name="landfill_operating_schedule__c", length=255)
    private String     landfillOperatingScheduleCustom ;


    @Column(name="mailing_postal_code__c", length=10)
    private String     mailingPostalCodeCustom ;


    @Transient
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="systemmodstamp")
    private Date       systemmodstamp ;


    @Column(name="geolocation__longitude__s")
    private Double     geolocationLongitudeS ;


    @Transient
    @JsonIgnore
    @Column(name="isdeleted")
    private Boolean    isdeleted    ;


    @Column(name="mailing_address_1__c", length=50)
    private String     mailingAddress1Custom ;


    @Column(name="business_unit__c", length=18)
    private String     businessUnitCustom ;


    @Column(name="landfill_non_hazardous_service__c", length=4099)
    private String     landfillNonHazardousServiceCustom ;


    @Column(name="geolocation__latitude__s")
    private Double     geolocationLatitudeS ;


    @Column(name="recordtypeid", length=18)
    private String     recordtypeid ;


    @Column(name="facility_type__c", length=255)
    private String     facilityTypeCustom ;


    @Column(name="facility_customer_service_contact_info__c", length=18)
    private String     facilityCustomerServiceContactInfoCustom ;


    @Column(name="facility_id__c", length=10)
    private String     facilityIdCustom ;


    @Transient
    @JsonIgnore
    @Column(name="_hc_err", length=2147483647)
    private String     hcErr        ;


    @Column(name="actual_country__c", length=255)
    private String     actualCountryCustom ;


    @Column(name="actual_street__c", length=50)
    private String     actualStreetCustom ;


    @Column(name="actual_state__c", length=2)
    private String     actualStateCustom ;


    @Column(name="mailing_city__c", length=50)
    private String     mailingCityCustom ;


    @Column(name="name", length=80)
    private String     name         ;


    @Transient
    @JsonIgnore
    @Column(name="_hc_lastop", length=32)
    private String     hcLastop     ;


    @Column(name="mailing_state__c", length=2)
    private String     mailingStateCustom ;


    @Column(name="status__c", length=255)
    private String     statusCustom ;


    @Column(name="phone__c", length=40)
    private String     phoneCustom  ;


    @Column(name="fax__c", length=40)
    private String     faxCustom    ;


    @Column(name="open_to_the_public__c", length=255)
    private String     openToThePublicCustom ;


    @Column(name="site_url__c", length=255)
    private String     siteUrlCustom ;


    @Column(name="approval_status__c", length=255)
    private String     approvalStatusCustom ;


    @Column(name="mailing_country__c", length=255)
    private String     mailingCountryCustom ;


    @Column(name="market_area_table__c", length=18)
    private String     marketAreaTableCustom ;


    @Column(name="landfill_id__c", length=10)
    private String     landfillIdCustom ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Facility()
    {
		super();
    }

    public Facility update(Facility a) {
		this.id = a.id;
        this.createddate = a.createddate;
        this.facilityTypeNumericCodeCustom = a.facilityTypeNumericCodeCustom;
        this.landfillHazardousServiceCustom = a.landfillHazardousServiceCustom;
        this.mailingAddress2Custom = a.mailingAddress2Custom;
        this.landfillEmailCustom = a.landfillEmailCustom;
        this.actualPostalCodeCustom = a.actualPostalCodeCustom;
        this.actualCityCustom = a.actualCityCustom;
        this.facilityTypeAlphaCodeCustom = a.facilityTypeAlphaCodeCustom;
        this.mailingAddress3Custom = a.mailingAddress3Custom;
        this.operatingScheduleCustom = a.operatingScheduleCustom;
        this.sfid = a.sfid;
        this.facilitySalesContactInfoCustom = a.facilitySalesContactInfoCustom;
        this.landfillOperatingScheduleCustom = a.landfillOperatingScheduleCustom;
        this.mailingPostalCodeCustom = a.mailingPostalCodeCustom;
        this.systemmodstamp = a.systemmodstamp;
        this.geolocationLongitudeS = a.geolocationLongitudeS;
        this.isdeleted = a.isdeleted;
        this.mailingAddress1Custom = a.mailingAddress1Custom;
        this.businessUnitCustom = a.businessUnitCustom;
        this.landfillNonHazardousServiceCustom = a.landfillNonHazardousServiceCustom;
        this.geolocationLatitudeS = a.geolocationLatitudeS;
        this.recordtypeid = a.recordtypeid;
        this.facilityTypeCustom = a.facilityTypeCustom;
        this.facilityCustomerServiceContactInfoCustom = a.facilityCustomerServiceContactInfoCustom;
        this.facilityIdCustom = a.facilityIdCustom;
        this.hcErr = a.hcErr;
        this.actualCountryCustom = a.actualCountryCustom;
        this.actualStreetCustom = a.actualStreetCustom;
        this.actualStateCustom = a.actualStateCustom;
        this.mailingCityCustom = a.mailingCityCustom;
        this.name = a.name;
        this.hcLastop = a.hcLastop;
        this.mailingStateCustom = a.mailingStateCustom;
        this.statusCustom = a.statusCustom;
        this.phoneCustom = a.phoneCustom;
        this.faxCustom = a.faxCustom;
        this.openToThePublicCustom = a.openToThePublicCustom;
        this.siteUrlCustom = a.siteUrlCustom;
        this.approvalStatusCustom = a.approvalStatusCustom;
        this.mailingCountryCustom = a.mailingCountryCustom;
        this.marketAreaTableCustom = a.marketAreaTableCustom;
        this.landfillIdCustom = a.landfillIdCustom;



		return a;
	}

    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id )
    {
        this.id = id ;
    }
    public Integer getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : createddate ( timestamp ) 
    public void setCreateddate( Date createddate )
    {
        this.createddate = createddate;
    }
    public Date getCreateddate()
    {
        return this.createddate;
    }

    //--- DATABASE MAPPING : facility_type_numeric_code__c ( float8 ) 
    public void setFacilityTypeNumericCodeCustom( Double facilityTypeNumericCodeCustom )
    {
        this.facilityTypeNumericCodeCustom = facilityTypeNumericCodeCustom;
    }
    public Double getFacilityTypeNumericCodeCustom()
    {
        return this.facilityTypeNumericCodeCustom;
    }

    //--- DATABASE MAPPING : landfill_hazardous_service__c ( varchar ) 
    public void setLandfillHazardousServiceCustom( String landfillHazardousServiceCustom )
    {
        this.landfillHazardousServiceCustom = landfillHazardousServiceCustom;
    }
    public String getLandfillHazardousServiceCustom()
    {
        return this.landfillHazardousServiceCustom;
    }

    //--- DATABASE MAPPING : mailing_address_2__c ( varchar ) 
    public void setMailingAddress2Custom( String mailingAddress2Custom )
    {
        this.mailingAddress2Custom = mailingAddress2Custom;
    }
    public String getMailingAddress2Custom()
    {
        return this.mailingAddress2Custom;
    }

    //--- DATABASE MAPPING : landfill_email__c ( varchar ) 
    public void setLandfillEmailCustom( String landfillEmailCustom )
    {
        this.landfillEmailCustom = landfillEmailCustom;
    }
    public String getLandfillEmailCustom()
    {
        return this.landfillEmailCustom;
    }

    //--- DATABASE MAPPING : actual_postal_code__c ( varchar ) 
    public void setActualPostalCodeCustom( String actualPostalCodeCustom )
    {
        this.actualPostalCodeCustom = actualPostalCodeCustom;
    }
    public String getActualPostalCodeCustom()
    {
        return this.actualPostalCodeCustom;
    }

    //--- DATABASE MAPPING : actual_city__c ( varchar ) 
    public void setActualCityCustom( String actualCityCustom )
    {
        this.actualCityCustom = actualCityCustom;
    }
    public String getActualCityCustom()
    {
        return this.actualCityCustom;
    }

    //--- DATABASE MAPPING : facility_type_alpha_code__c ( varchar ) 
    public void setFacilityTypeAlphaCodeCustom( String facilityTypeAlphaCodeCustom )
    {
        this.facilityTypeAlphaCodeCustom = facilityTypeAlphaCodeCustom;
    }
    public String getFacilityTypeAlphaCodeCustom()
    {
        return this.facilityTypeAlphaCodeCustom;
    }

    //--- DATABASE MAPPING : mailing_address_3__c ( varchar ) 
    public void setMailingAddress3Custom( String mailingAddress3Custom )
    {
        this.mailingAddress3Custom = mailingAddress3Custom;
    }
    public String getMailingAddress3Custom()
    {
        return this.mailingAddress3Custom;
    }

    //--- DATABASE MAPPING : operating_schedule__c ( varchar ) 
    public void setOperatingScheduleCustom( String operatingScheduleCustom )
    {
        this.operatingScheduleCustom = operatingScheduleCustom;
    }
    public String getOperatingScheduleCustom()
    {
        return this.operatingScheduleCustom;
    }

    //--- DATABASE MAPPING : sfid ( varchar ) 
    public void setSfid( String sfid )
    {
        this.sfid = sfid;
    }
    public String getSfid()
    {
        return this.sfid;
    }

    //--- DATABASE MAPPING : facility_sales_contact_info__c ( varchar ) 
    public void setFacilitySalesContactInfoCustom( String facilitySalesContactInfoCustom )
    {
        this.facilitySalesContactInfoCustom = facilitySalesContactInfoCustom;
    }
    public String getFacilitySalesContactInfoCustom()
    {
        return this.facilitySalesContactInfoCustom;
    }

    //--- DATABASE MAPPING : landfill_operating_schedule__c ( varchar ) 
    public void setLandfillOperatingScheduleCustom( String landfillOperatingScheduleCustom )
    {
        this.landfillOperatingScheduleCustom = landfillOperatingScheduleCustom;
    }
    public String getLandfillOperatingScheduleCustom()
    {
        return this.landfillOperatingScheduleCustom;
    }

    //--- DATABASE MAPPING : mailing_postal_code__c ( varchar ) 
    public void setMailingPostalCodeCustom( String mailingPostalCodeCustom )
    {
        this.mailingPostalCodeCustom = mailingPostalCodeCustom;
    }
    public String getMailingPostalCodeCustom()
    {
        return this.mailingPostalCodeCustom;
    }

    //--- DATABASE MAPPING : systemmodstamp ( timestamp ) 
    public void setSystemmodstamp( Date systemmodstamp )
    {
        this.systemmodstamp = systemmodstamp;
    }
    public Date getSystemmodstamp()
    {
        return this.systemmodstamp;
    }

    //--- DATABASE MAPPING : geolocation__longitude__s ( float8 ) 
    public void setGeolocationLongitudeS( Double geolocationLongitudeS )
    {
        this.geolocationLongitudeS = geolocationLongitudeS;
    }
    public Double getGeolocationLongitudeS()
    {
        return this.geolocationLongitudeS;
    }

    //--- DATABASE MAPPING : isdeleted ( bool ) 
    public void setIsdeleted( Boolean isdeleted )
    {
        this.isdeleted = isdeleted;
    }
    public Boolean getIsdeleted()
    {
        return this.isdeleted;
    }

    //--- DATABASE MAPPING : mailing_address_1__c ( varchar ) 
    public void setMailingAddress1Custom( String mailingAddress1Custom )
    {
        this.mailingAddress1Custom = mailingAddress1Custom;
    }
    public String getMailingAddress1Custom()
    {
        return this.mailingAddress1Custom;
    }

    //--- DATABASE MAPPING : business_unit__c ( varchar ) 
    public void setBusinessUnitCustom( String businessUnitCustom )
    {
        this.businessUnitCustom = businessUnitCustom;
    }
    public String getBusinessUnitCustom()
    {
        return this.businessUnitCustom;
    }

    //--- DATABASE MAPPING : landfill_non_hazardous_service__c ( varchar ) 
    public void setLandfillNonHazardousServiceCustom( String landfillNonHazardousServiceCustom )
    {
        this.landfillNonHazardousServiceCustom = landfillNonHazardousServiceCustom;
    }
    public String getLandfillNonHazardousServiceCustom()
    {
        return this.landfillNonHazardousServiceCustom;
    }

    //--- DATABASE MAPPING : geolocation__latitude__s ( float8 ) 
    public void setGeolocationLatitudeS( Double geolocationLatitudeS )
    {
        this.geolocationLatitudeS = geolocationLatitudeS;
    }
    public Double getGeolocationLatitudeS()
    {
        return this.geolocationLatitudeS;
    }

    //--- DATABASE MAPPING : recordtypeid ( varchar ) 
    public void setRecordtypeid( String recordtypeid )
    {
        this.recordtypeid = recordtypeid;
    }
    public String getRecordtypeid()
    {
        return this.recordtypeid;
    }

    //--- DATABASE MAPPING : facility_type__c ( varchar ) 
    public void setFacilityTypeCustom( String facilityTypeCustom )
    {
        this.facilityTypeCustom = facilityTypeCustom;
    }
    public String getFacilityTypeCustom()
    {
        return this.facilityTypeCustom;
    }

    //--- DATABASE MAPPING : facility_customer_service_contact_info__c ( varchar ) 
    public void setFacilityCustomerServiceContactInfoCustom( String facilityCustomerServiceContactInfoCustom )
    {
        this.facilityCustomerServiceContactInfoCustom = facilityCustomerServiceContactInfoCustom;
    }
    public String getFacilityCustomerServiceContactInfoCustom()
    {
        return this.facilityCustomerServiceContactInfoCustom;
    }

    //--- DATABASE MAPPING : facility_id__c ( varchar ) 
    public void setFacilityIdCustom( String facilityIdCustom )
    {
        this.facilityIdCustom = facilityIdCustom;
    }
    public String getFacilityIdCustom()
    {
        return this.facilityIdCustom;
    }

    //--- DATABASE MAPPING : _hc_err ( text ) 
    public void setHcErr( String hcErr )
    {
        this.hcErr = hcErr;
    }
    public String getHcErr()
    {
        return this.hcErr;
    }

    //--- DATABASE MAPPING : actual_country__c ( varchar ) 
    public void setActualCountryCustom( String actualCountryCustom )
    {
        this.actualCountryCustom = actualCountryCustom;
    }
    public String getActualCountryCustom()
    {
        return this.actualCountryCustom;
    }

    //--- DATABASE MAPPING : actual_street__c ( varchar ) 
    public void setActualStreetCustom( String actualStreetCustom )
    {
        this.actualStreetCustom = actualStreetCustom;
    }
    public String getActualStreetCustom()
    {
        return this.actualStreetCustom;
    }

    //--- DATABASE MAPPING : actual_state__c ( varchar ) 
    public void setActualStateCustom( String actualStateCustom )
    {
        this.actualStateCustom = actualStateCustom;
    }
    public String getActualStateCustom()
    {
        return this.actualStateCustom;
    }

    //--- DATABASE MAPPING : mailing_city__c ( varchar ) 
    public void setMailingCityCustom( String mailingCityCustom )
    {
        this.mailingCityCustom = mailingCityCustom;
    }
    public String getMailingCityCustom()
    {
        return this.mailingCityCustom;
    }

    //--- DATABASE MAPPING : name ( varchar ) 
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    //--- DATABASE MAPPING : _hc_lastop ( varchar ) 
    public void setHcLastop( String hcLastop )
    {
        this.hcLastop = hcLastop;
    }
    public String getHcLastop()
    {
        return this.hcLastop;
    }

    //--- DATABASE MAPPING : mailing_state__c ( varchar ) 
    public void setMailingStateCustom( String mailingStateCustom )
    {
        this.mailingStateCustom = mailingStateCustom;
    }
    public String getMailingStateCustom()
    {
        return this.mailingStateCustom;
    }

    //--- DATABASE MAPPING : status__c ( varchar ) 
    public void setStatusCustom( String statusCustom )
    {
        this.statusCustom = statusCustom;
    }
    public String getStatusCustom()
    {
        return this.statusCustom;
    }

    //--- DATABASE MAPPING : phone__c ( varchar ) 
    public void setPhoneCustom( String phoneCustom )
    {
        this.phoneCustom = phoneCustom;
    }
    public String getPhoneCustom()
    {
        return this.phoneCustom;
    }

    //--- DATABASE MAPPING : fax__c ( varchar ) 
    public void setFaxCustom( String faxCustom )
    {
        this.faxCustom = faxCustom;
    }
    public String getFaxCustom()
    {
        return this.faxCustom;
    }

    //--- DATABASE MAPPING : open_to_the_public__c ( varchar ) 
    public void setOpenToThePublicCustom( String openToThePublicCustom )
    {
        this.openToThePublicCustom = openToThePublicCustom;
    }
    public String getOpenToThePublicCustom()
    {
        return this.openToThePublicCustom;
    }

    //--- DATABASE MAPPING : site_url__c ( varchar ) 
    public void setSiteUrlCustom( String siteUrlCustom )
    {
        this.siteUrlCustom = siteUrlCustom;
    }
    public String getSiteUrlCustom()
    {
        return this.siteUrlCustom;
    }

    //--- DATABASE MAPPING : approval_status__c ( varchar ) 
    public void setApprovalStatusCustom( String approvalStatusCustom )
    {
        this.approvalStatusCustom = approvalStatusCustom;
    }
    public String getApprovalStatusCustom()
    {
        return this.approvalStatusCustom;
    }

    //--- DATABASE MAPPING : mailing_country__c ( varchar ) 
    public void setMailingCountryCustom( String mailingCountryCustom )
    {
        this.mailingCountryCustom = mailingCountryCustom;
    }
    public String getMailingCountryCustom()
    {
        return this.mailingCountryCustom;
    }

    //--- DATABASE MAPPING : market_area_table__c ( varchar ) 
    public void setMarketAreaTableCustom( String marketAreaTableCustom )
    {
        this.marketAreaTableCustom = marketAreaTableCustom;
    }
    public String getMarketAreaTableCustom()
    {
        return this.marketAreaTableCustom;
    }

    //--- DATABASE MAPPING : landfill_id__c ( varchar ) 
    public void setLandfillIdCustom( String landfillIdCustom )
    {
        this.landfillIdCustom = landfillIdCustom;
    }
    public String getLandfillIdCustom()
    {
        return this.landfillIdCustom;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(createddate);
        sb.append("|");
        sb.append(facilityTypeNumericCodeCustom);
        sb.append("|");
        sb.append(landfillHazardousServiceCustom);
        sb.append("|");
        sb.append(mailingAddress2Custom);
        sb.append("|");
        sb.append(landfillEmailCustom);
        sb.append("|");
        sb.append(actualPostalCodeCustom);
        sb.append("|");
        sb.append(actualCityCustom);
        sb.append("|");
        sb.append(facilityTypeAlphaCodeCustom);
        sb.append("|");
        sb.append(mailingAddress3Custom);
        sb.append("|");
        sb.append(operatingScheduleCustom);
        sb.append("|");
        sb.append(sfid);
        sb.append("|");
        sb.append(facilitySalesContactInfoCustom);
        sb.append("|");
        sb.append(landfillOperatingScheduleCustom);
        sb.append("|");
        sb.append(mailingPostalCodeCustom);
        sb.append("|");
        sb.append(systemmodstamp);
        sb.append("|");
        sb.append(geolocationLongitudeS);
        sb.append("|");
        sb.append(isdeleted);
        sb.append("|");
        sb.append(mailingAddress1Custom);
        sb.append("|");
        sb.append(businessUnitCustom);
        sb.append("|");
        sb.append(landfillNonHazardousServiceCustom);
        sb.append("|");
        sb.append(geolocationLatitudeS);
        sb.append("|");
        sb.append(recordtypeid);
        sb.append("|");
        sb.append(facilityTypeCustom);
        sb.append("|");
        sb.append(facilityCustomerServiceContactInfoCustom);
        sb.append("|");
        sb.append(facilityIdCustom);
        sb.append("|");
        sb.append(hcErr);
        sb.append("|");
        sb.append(actualCountryCustom);
        sb.append("|");
        sb.append(actualStreetCustom);
        sb.append("|");
        sb.append(actualStateCustom);
        sb.append("|");
        sb.append(mailingCityCustom);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(hcLastop);
        sb.append("|");
        sb.append(mailingStateCustom);
        sb.append("|");
        sb.append(statusCustom);
        sb.append("|");
        sb.append(phoneCustom);
        sb.append("|");
        sb.append(faxCustom);
        sb.append("|");
        sb.append(openToThePublicCustom);
        sb.append("|");
        sb.append(siteUrlCustom);
        sb.append("|");
        sb.append(approvalStatusCustom);
        sb.append("|");
        sb.append(mailingCountryCustom);
        sb.append("|");
        sb.append(marketAreaTableCustom);
        sb.append("|");
        sb.append(landfillIdCustom);
        return sb.toString(); 
    } 

}