package br.com.sgexport.utilitarios;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * Classe: HibernateFactoryConnection
 * Objetivo: Disponibilizar uma sessão para conexão ao BD 
 * Autor: Claudio Silva.
 * Data: 
 */
public class HibernateFactoryConnection {
	
	private static final SessionFactory sessionfactory = BuildSessionFactory();	
	private static SessionFactory BuildSessionFactory()
	{
		try
		{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		}
		catch (Throwable e){
			System.out.println("Ocorreu um erro na SessionFactory " + e.getMessage());
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionfactory;
	}
}
