
package com.lm.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nullFieldList" type="{urn:core_2016_1.platform.webservices.netsuite.com}NullField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", namespace = "urn:core_2016_1.platform.webservices.netsuite.com", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    VendorReturnAuthorization.class,
    VendorBill.class,
    PurchaseOrder.class,
    VendorPayment.class,
    VendorCredit.class,
    ItemReceipt.class,
    PurchaseRequisition.class,
    Employee.class,
    PayrollItem.class,
    TimeSheet.class,
    TimeBill.class,
    ExpenseReport.class,
    PaycheckJournal.class,
    TimeEntry.class,
    Issue.class,
    SupportCaseType.class,
    SupportCaseIssue.class,
    SupportCase.class,
    SupportCaseStatus.class,
    SupportCasePriority.class,
    Topic.class,
    Solution.class,
    SupportCaseOrigin.class,
    Charge.class,
    CustomerPayment.class,
    ReturnAuthorization.class,
    DepositApplication.class,
    CustomerRefund.class,
    CreditMemo.class,
    CustomerDeposit.class,
    CashRefund.class,
    Message.class,
    Note.class,
    Estimate.class,
    Invoice.class,
    CashSale.class,
    Opportunity.class,
    SalesOrder.class,
    ItemFulfillment.class,
    CampaignSearchEngine.class,
    CampaignResponse2 .class,
    PromotionCode.class,
    CampaignOffer.class,
    CampaignSubscription.class,
    CampaignCategory.class,
    CampaignAudience.class,
    Campaign.class,
    CampaignFamily.class,
    CampaignVertical.class,
    CouponCode.class,
    CampaignChannel.class,
    ManufacturingOperationTask.class,
    ManufacturingCostTemplate.class,
    ManufacturingRouting.class,
    ItemDemandPlan.class,
    ItemSupplyPlan.class,
    Folder.class,
    File.class,
    MarkupItem.class,
    Account.class,
    Bin.class,
    PricingGroup.class,
    ItemAccountMapping.class,
    InventoryNumber.class,
    Department.class,
    ServicePurchaseItem.class,
    Currency.class,
    Classification.class,
    State.class,
    FairValuePrice.class,
    ItemGroup.class,
    CustomerMessage.class,
    OtherChargePurchaseItem.class,
    CustomerCategory.class,
    AssemblyItem.class,
    WinLossReason.class,
    ContactCategory.class,
    ContactRole.class,
    OtherChargeResaleItem.class,
    PriceLevel.class,
    CostCategory.class,
    DescriptionItem.class,
    GiftCertificateItem.class,
    BillingSchedule.class,
    GiftCertificate.class,
    BudgetCategory.class,
    NoteType.class,
    LotNumberedInventoryItem.class,
    CurrencyRate.class,
    UnitsType.class,
    GlobalAccountMapping.class,
    OtherNameCategory.class,
    ServiceResaleItem.class,
    VendorCategory.class,
    PaymentItem.class,
    NonInventorySaleItem.class,
    Subsidiary.class,
    SubtotalItem.class,
    RevRecTemplate.class,
    AccountingPeriod.class,
    DiscountItem.class,
    Term.class,
    DownloadItem.class,
    TaxType.class,
    LeadSource.class,
    TaxGroup.class,
    LotNumberedAssemblyItem.class,
    PaymentMethod.class,
    InventoryItem.class,
    PartnerCategory.class,
    Nexus.class,
    SerializedInventoryItem.class,
    TaxAcct.class,
    NonInventoryResaleItem.class,
    SalesTaxItem.class,
    ServiceSaleItem.class,
    KitItem.class,
    ItemRevision.class,
    RevRecSchedule.class,
    SerializedAssemblyItem.class,
    ExpenseCategory.class,
    SalesRole.class,
    NonInventoryPurchaseItem.class,
    OtherChargeSaleItem.class,
    Location.class,
    Address.class,
    LandedCost.class,
    InventoryDetail.class,
    Task.class,
    ResourceAllocation.class,
    ProjectTask.class,
    PhoneCall.class,
    CalendarEvent.class,
    WorkOrder.class,
    InventoryCostRevaluation.class,
    BinWorksheet.class,
    AssemblyUnbuild.class,
    WorkOrderCompletion.class,
    WorkOrderClose.class,
    TransferOrder.class,
    WorkOrderIssue.class,
    InterCompanyTransferOrder.class,
    BinTransfer.class,
    InventoryTransfer.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    Budget.class,
    SiteCategory2 .class,
    StatisticalJournalEntry.class,
    InterCompanyJournalEntry.class,
    JournalEntry.class,
    Check.class,
    Deposit.class,
    CustomTransaction.class,
    CustomRecordType.class,
    CustomList.class,
    CustomRecord.class,
    CustomFieldType.class,
    Customer.class,
    EntityGroup.class,
    Vendor.class,
    BillingAccount.class,
    Contact.class,
    JobStatus.class,
    JobType.class,
    CustomerStatus.class,
    Job.class,
    Partner.class
})
public abstract class Record {

    protected NullField nullFieldList;

    /**
     * Gets the value of the nullFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * Sets the value of the nullFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}
