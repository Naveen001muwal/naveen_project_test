package com.greatlearning.CustomerRelationshipManagement.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.CustomerRelationshipManagement.entity.Customer;

public class CustomerServiceImpl implements CustomerService{
	
private SessionFactory sessionFactory ;
	
	private Session session ;
	
	@Autowired
	CustomerServiceImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
		
		try {
			session = sessionFactory.getCurrentSession();
		}
		catch(HibernateException e){
			session = sessionFactory.openSession();
		}
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub

		Transaction tx = session.beginTransaction();
		
		List<Customer> customers = session.createQuery("customers").list();
		tx.commit();
		return customers ;
	}	

	@Override
	public Customer findById(int theId) {
		// TODO Auto-generated method stub
Customer customer = new Customer();
		
		Transaction tx = session.beginTransaction();
		customer =session.get(Customer.class , theId);
		return null;
	}

	@Override
	public void save(Customer theCustomer) {
		// TODO Auto-generated method stub

		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(theCustomer);
		
	}

	@Override
	public void DeleteById(int theId) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Transaction tx = session.beginTransaction();
		customer =session.get(Customer.class , theId);
		session.delete(customer);
		tx.commit();
		
	}

}
