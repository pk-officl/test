
/**
 * 
 */
package com.arthmate.rules.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author mainak
 *
 */
@Data
public class RuleRequest {

   @JsonProperty("request_id")
   private String request_id;
   @JsonProperty("product_id")
   private String product_id;

   @JsonProperty("product_name")
   private String product_name;

   // String fields
   private String partner_loan_app_id;
   private String partner_borrower_id;
   private String first_name;
   private String middle_name;
   private String last_name;
   private String sector;
   private String type_of_addr;
   private String resi_addr_ln1;
   private String resi_addr_ln2;
   private String city;
   private String state;
   private String pincode;
   private String per_addr_ln1;
   private String per_addr_ln2;
   private String per_city;
   private String per_state;
   private String per_pincode;
   private String appl_phone;
   private String appl_pan;
   private String email_id;
   private String aadhar_card_num;
   private String ebill_num;
   private String gender;
   private String purpose_of_loan;
   private String passport;

   private String loan_app_id;
   private String borrower_id;
   private String partner_loan_id;
   private String service_provider;
   private String itr_ack_no;
   private String religion;
   private String qualification;
   private String marital_status;
   private String repayment_type;
   private String final_remarks;
   private String employer_name;
   private String employer_id;
   private String exclude_interest_till_grace_period;
   private String grace_period;
   private String father_or_spouse_name;
   private String umrn;
   private String borro_bank_name;
   private String borro_bank_acc_num;
   private String borro_bank_ifsc;
   private String int_type;
   private String tenure_type;
   private String vpa_address;
   private String partner_system_score;
   private String gst_number;
   private String gst_verification_response;
   private String borro_bank_account_holder_name;
   private String borro_bank_account_type;
   private String customer_type;
   private String employment_status;
   private String professional_category;
   private String professional_subcategory;
   private String customer_risk_segment;
   private String customer_type_ntc;
   private String partner_customer_category;
   private String photo_id_type;
   private String photo_id_num;
   private String addr_id_type;
   private String addr_id_num;
   private String bureau_type;
   private String regular_salary_credit;
   private String active_secured_loan_or_credit_card;
   private String insurance_company;
   private String insurance_type;
   private String writtenoff_or_default;
   private String credit_card_settlement;
   private String bene_bank_name;
   private String bene_bank_acc_num;
   private String bene_bank_ifsc;
   private String bene_bank_account_holder_name;
   private String bene_bank_account_type;

   private String institute_or_school_name;
   private String institute_or_school_branch;
   private String course_or_class_name;
   private String mother_name;
   private String spouse_name;
   private String dealer_name;
   private String sub_dealer_name;
   private String net_monthly_obligations;
   private String scheme_code;
   private String scheme_name;
   private String customer_category;
   private String sherlock_match;
   private String co_app_name;
   private String residence_status;
   private String business_type;
   private String co_app_or_guar_name;
   private String relation_with_applicant;
   private String business_address_ownership;
   private String others_ld1;
   private String other_od1;
   private String other_od2;
   private String other_burd2;
   private String nature_of_business;

   // Date fields
   private LocalDate dob;
   private String loan_app_date;
   private LocalDate first_inst_date;
   private LocalDate final_approve_date;

Aditi, [21-02-2023 21:53]
// Double fields;
   private Double no_year_current_addr;
   private Double total_experience;
   private Double cibil_score_borro;
   private Double uan;
   private Double age;
   private Double sanction_amount;
   private Double gst_on_pf_perc;
   private Double gst_on_pf_amt;
   private Double app_charges;
   private Double stamp_charges;
   private Double advance_emi;
   private Double fldg_perc;
   private Double fldg_amt;
   private Double total_charges;
   private Double net_disbur_amt;
   private Double foir;
   private Double fees;
   private Double subvention_fees;
   private Double usage_fee;
   private Double upfront_interest;
   private Double interest_free_days;
   private Double overdue_charges_per_day;
   private Double overdue_days;
   private Double annual_income_borro;
   private Double tenure;
   private Double processing_fees_perc;
   private Double processing_fees_amt;
   private Double conv_fees;
   private Double loan_int_rate;
   private Double loan_int_amt;
   private Double abb;
   private Double business_vintage_overall;
   private Double invoice_amount;
   private Double vintage_current_employer;
   private Double disc_factor_merchant_risk_cat;
   private Double disc_factor_bureau_score;
   private Double current_overdue_value;
   private Double monthly_income;
   private Double loan_amount_requested;
   private Double credit_card_settlement_amount;
   private Double downpayment_amount;
   private Double emi_amount;

   private Double broken_interest;
   private Double requested_loan_amt;
   private Double total_monthly_sales;
   private Double profit_margin_percent;
   private Double broken_period_int_amt;
   private Double prepayment_charges_percent;
   private Double prepayment_charges_amt;
   private Double annual_turnover;
   private Double avg_banking_turnover_6_months;
   private Double banking_outflow_6_months;
   private Double banking_inflow_6_months;
   private Double subscription_fee;
   private Double total_banking_turnover_6_months;
   private Double business_expenses_6_months;
   private Double total_overdues_in_cc;
   private Double monthly_income_co_app;
   private Double insurance_amount;
   private Double school_fees_amount_1;
   private Double school_fees_amount_2;
   private Double school_fees_amount_3;
   private Double dealer_subvention;
   private Double nach_charges;
   private Double pdd_charges;
   private Double admin_fees;
   private Double bureau_charges;
   private Double dealer_charges;
   private Double pre_emi;
   private Double avg_3_mnts_txn_amt;
   private Double on_road_price;
   private Double bureau_outstanding_loan_amt;
   private Double monthly_disposable_income;
   private Double other_fd1;
   private Double other_fd2;
   private Double abb_1;
   private Double abb_2;
   private Double total_banking_deposits_amt;
   private Double total_banking_withdrawal_amt;
   private Double a_score;
   private Double b_score;
   private Double offered_amount;
   private Double offered_int_rate;
   private Double monthly_average_balance;
   private Double monthly_imputed_income;
   private Double emi_obligation;
   private Double other_bankd1;
   private Double abb_6_months;
   private Double abb_3_months;
   private Double abb_3;
   private Double gross_profit;
    private Double pbt;
   private Double total_revenue;
   private Double non_operating_income;
   private Double depreciation;
   private Double interest_expense;
   private Double pat;
   private Double equity;
   private Double reserve_and_surplus;
   private Double secured_loans;
   private Double unsecured_loans;
   private Double cc_od_limit;
   private Double short_term_liabilities;
   private Double long_term_liabilities;
   private Double intangible_assets;
   private Double debtors;
   private Double creditors;

Aditi, [21-02-2023 21:53]
private Double stock;
   private Double current_assets;
   private Double inventory;
   private Double prepaid_expenses;
   private Double current_liabilities;
   private Double total_expenses;
   private Double opening_stock;
   private Double purchases;
   private Double working_capital;
   private Double total_assets;
   private Double retained_earnings;
   private Double total_liabilities;
   private Double total_debit_l6m;
   private Double total_debit_l3m;
   private Double total_credit_l6m;
   private Double total_credit_l3m;
   private Double mnthly_avg_bal_l6m;
   private Double mnthly_avg_bal_l3m;
   private Double latest_bal;
   private Double outward_chq_bounce_l6m;
   private Double outward_chq_bounce_l3m;
   private Double inward_chq_bounce_due_to_insuff_fnds_l6m;
   private Double inward_chq_bounce_due_to_insuff_fnds_l3m;
   private Double total_ecs_bounce_l6m;
   private Double total_ecs_bounce_l3m;
   private Double cnt_of_txn_decl_due_to_insuff_funds_l6m;
   private Double cnt_of_txn_decl_due_to_insuff_funds_l3m;
   private Double time_snce_lst_bounce;
   private Double ttl_amt_of_cash_withdrawls_l6m;
   private Double ttl_amt_of_atm_txn_l6m;
   private Double ttl_cnt_of_atm_txn_l6m;
   private Double ttl_amt_of_pos_txn_l6m;
   private Double ttl_amt_of_cash_dep_l6m;
   private Double ttl_annual_oblig;
   private Double thirty_dpd_l3m;
   private Double sixty_dpd_l6m;
   private Double ninety_dpd_l12m;
   private Double crrnt_cmr_score;
   private Double ttl_gst_turnover_l6m;
   private Double ttl_gst_turnover_l3m;
   private Double lst_mnth_gst_turnover;
   private Double ttl_gst_paid_l6m;
   private Double ttl_gst_paid_l3m;
   private Double lst_mnth_gst_paid;
   private Double ttl_itr_income_last_year;
   private Double ttl_itr_income_last_year_minus_one;
   private Double total_itr_tax_last_year;
   private Double total_itr_tax_last_year_minus_one;
   private Double itr_filing_missed_l2y;
   private Double advance_tax_paid_last_year;
   private Double ttl_itr_expense_last_year;
   private Double ttl_itr_expense_last_year_minus_one;
   private Double total_banking_turnover;
   private Double avg_monthly_txn_amount;

   // Integer fields
   private Integer bureau_score;
   private Integer bounces_in_one_month;
   private Integer bounces_in_three_month;
   private Integer bounces_in_six_month;
   private Integer bounces_in_nine_month;
   private Integer number_of_deposit_txn;
   private Integer number_of_withdrawal_txn;
   private Integer ninety_plus_dpd_in_last_24_months;
   private Integer dpd_in_last_9_months;
   private Integer dpd_in_last_3_months;
   private Integer dpd_in_last_6_months;

   private Integer dpd_in_last_12_months;
   private Integer dpd_in_last_3_months_credit_card;
   private Integer dpd_in_last_3_months_secured;
   private Integer dpd_in_last_3_months_unsecured;
   private Integer dpd_in_last_24_months;
   private Integer enquiries_bureau_30_days;
   private Integer cnt_active_unsecured_loans;
   private Integer vintage_months_partner_platform;
   private Integer co_app_bureau_score;
   private Integer other_burd1;
   private Integer co_app_or_guar_bureau_score;
   private Integer enquiries_in_last_3_months;
   private Integer commercial_bureau_ranking;
   private Integer writeoff_settlement_l24m;
   private Integer null_gst_filing_l6m;
   private Integer one_shot_gst_filing_l6m;
   private Integer cnt_of_gst_filing_missed_l6m;
   private Integer cnt_of_gst_filing_missed_l3m;

   // boolean value
   private Boolean is_active;
}