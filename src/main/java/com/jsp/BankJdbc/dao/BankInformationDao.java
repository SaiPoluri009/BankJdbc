package com.jsp.BankJdbc.dao;

import java.util.List;

import com.jsp.BankJdbc.entity.BankInformation;

public interface BankInformationDao 
{
	BankInformation getDetailsByAccountNumber();
    List<BankInformation> fetchByBankName();
    void debit();
   
}
