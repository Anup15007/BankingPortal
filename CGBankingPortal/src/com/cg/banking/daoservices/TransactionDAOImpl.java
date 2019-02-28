package com.cg.banking.daoservices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;


public class TransactionDAOImpl implements TransactionDAO{
	
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Transaction save(Transaction transaction) {	
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(transaction);
		entityManager.getTransaction().commit();
		entityManager.close();
		return transaction;
	}


	@Override
	public Transaction findOne(int transactionId) {
		return entityManagerFactory.createEntityManager().find(Transaction.class, transactionId);
	}

	@Override
	public List<Transaction> findAll(long accountNo) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("from Transaction a where account_accountNo="+accountNo,Transaction.class);
		return query.getResultList();
	}
	
	

}
