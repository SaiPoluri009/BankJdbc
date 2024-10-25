package com.jsp.BankJdbc.dao;

import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.BankJdbc.entity.BankInformation;
@Component
public class BankInformationDaoImpl implements BankInformationDao
{
	@Autowired
	private JdbcTemplate template;
	@Autowired
	private RowMapper<BankInformation> rowMapper;
	Scanner sc=new Scanner(System.in);
	public BankInformation getDetailsByAccountNumber() 
	{
		String query="select * from bank_information where account_no=?";
		System.out.println("Enter Account number");
		long acc=sc.nextLong();
		BankInformation b1=template.queryForObject(query, rowMapper,acc);
		return b1;
	}
	public List<BankInformation> fetchByBankName() 
	{
		String query="select * from bank_information where bank_name=?";
		System.out.println("Enter bank Name");
		String name=sc.next();
		List<BankInformation> l=template.query(query, rowMapper,name);
		return l;
	}
	public void debit() 
	{
		System.out.println("Enter Account number");
		long acc=sc.nextLong();
		String query="select * from bank_information where account_no=?";
		try
		{
		BankInformation b=template.queryForObject(query,rowMapper,acc);
		System.out.println("Enter Balance");
		int amount=sc.nextInt();
		int balance=b.getBal();
		if(amount>0)
		{
		if(amount<balance)
		{
		query="update bank_information set bal=bal-? where account_no=?";
		  int res=template.update(query,amount,acc);
		  if(res>0)
		  {
		   System.out.println("Transaction completed");
		  }
		  else
		  {
			  System.out.println("Server busy");
		  }
		}
		else
		{
			System.err.println("Low balance");
		}
		}
		else
		{
			System.err.println("Invalid amount");
		}

		}
				catch(Exception e)
		{
			System.err.println("Enter valid Account number.........");
		}
		
		
	}
	
}
