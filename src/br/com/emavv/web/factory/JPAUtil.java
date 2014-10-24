package br.com.emavv.web.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory emf;

	 public static EntityManager getConnection() {

	  if (emf == null) {

	   emf = Persistence.createEntityManagerFactory("dbemavv");
	  }
	  return emf.createEntityManager();
	 }

	 public static void close() {

	  emf.close();
	 }
}
