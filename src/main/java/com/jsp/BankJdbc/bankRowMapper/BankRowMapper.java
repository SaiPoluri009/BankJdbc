package com.jsp.BankJdbc.bankRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.BankJdbc.entity.BankInformation;
@Component
public class BankRowMapper implements RowMapper<BankInformation>
{

	public BankInformation mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		BankInformation b1=new BankInformation();
		b1.setBankName(rs.getString(1));
		b1.setIfsc(rs.getString(2));
		b1.setAccountNumber(rs.getLong(3));
		b1.setHolderName(rs.getString(4));
		b1.setMobileNo(rs.getLong(5));
		b1.setBal(rs.getInt(6));
		return b1;
	}

}
