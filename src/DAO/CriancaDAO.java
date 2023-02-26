/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Model.Crianca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class CriancaDAO {
    public Crianca save(Crianca usuario) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            if(usuario.getId() == null){
                em.persist(usuario);
            }else{
                em.merge(usuario);
            }           
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Gravado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Gravar","Alerta",JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return usuario;
    }
   
    public Crianca delete(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Crianca usuario = em.find(Crianca.class, id);
        try {            
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Apagado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Apagar","Alerta",JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return usuario;
    }
     public List<Crianca> listAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Crianca> usuario = null;
        
        try {            
            usuario = em.createQuery("from Crianca").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Listar","Alerta",JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return usuario;
    } 
}
