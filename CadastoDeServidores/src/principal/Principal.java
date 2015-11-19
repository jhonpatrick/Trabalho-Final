/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dao.ServidorDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

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
				createEntityManagerFactory("Servidor");
		
		EntityManager em = emf.createEntityManager();
		//chamando a class de Servidores
		
		Servidor s1 = new Servidor();
		s1.setArea_formacao("Programação de Softwares");
		s1.setCargoServ("asdgadg");
		s1.setCertMilitarServ(58445);
		s1.setDataCadastroPisPasepServ("15/11/1995");
                s1.setSexoServ('M');
                s1.setDeficinteFisico("Não");
                
                ServidorDao servDAO = new ServidorDao();
                servDAO.begin();
                servDAO.salvar(s1);
                
                JOptionPane.showMessageDialog(null,servDAO.listar(), "Apresentação do Servidor", JOptionPane.PLAIN_MESSAGE);
                
                servDAO.commit();
                servDAO.close();
                
    }
    
}
