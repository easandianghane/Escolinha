/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Isabel
 */
public class ConnectionFactory {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");
    
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
    
}
