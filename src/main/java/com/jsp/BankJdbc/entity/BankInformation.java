package com.jsp.BankJdbc.entity;

public class BankInformation 
{
	private String bankName;
	private String ifsc;
	private long accountNumber;
	private String holderName;
	private long mobileNo;
	private int bal;
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "BankInformation [bankName=" + bankName + ", ifsc=" + ifsc + ", accountNumber=" + accountNumber
				+ ", holderName=" + holderName + ", mobileNo=" + mobileNo + ", bal=" + bal + "]";
	}
	

}
