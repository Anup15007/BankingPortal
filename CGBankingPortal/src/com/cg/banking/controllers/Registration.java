package com.cg.banking.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BankingServices services;
	public void init() throws ServletException{
		services=new BankingServicesImpl();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		private long accountNo;
//		private int pinNumber;
//		private String accountType, accountStatus;
//		private float accountBalance;
		long accountNo;
		String accountType=request.getParameter("accountType");;
		float accountBalance=Float.parseFloat(request.getParameter("accountBalance"));
		
		try {
			accountNo=services.openAccount(accountType, accountBalance);
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		} catch (InvalidAccountTypeException e) {
			e.printStackTrace();
		} catch (BankingServicesDownException e) {
			e.printStackTrace();
		}
	}

}
