package br.com.sgexport.utilitarios;

import org.hibernate.Session;

public class SessionFactoryTest {

		public static void main(String[] args){
			Session sessao = null;
			
			try
			{
				sessao = HibernateFactoryConnection.getSessionFactory().openSession();
				System.out.println("Conectado do SGDB ");
			}
			finally {
				sessao.close();
			}
			
		}
}
