/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import sun.text.resources.FormatData;
import model.Servidor;

/**
 *
 * @author Patrick Rodrigues
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
    	EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("trabalho-finalPRO");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		//chamando a class de Servidores
		tx.begin();
		Servidor s1 = new Servidor();
		s1.setArea_formacao("Programação de Softwares");
		s1.setCargoServ("asdgadg");
		s1.setCertMilitarServ(58445);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//		sdf.format(dataCadastroPasepServ);
//		String data = "15/11/1995";
//		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//		formatter.parse(data);
//		s1.setDataCadastroPasepServ(formatter);
    }
    
}
