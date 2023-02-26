/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Model.Funcionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ea.san
 */
public class FuncionarioDAO {
     public Funcionario save(Funcionario usuario) {
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
   
    public Funcionario delete(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Funcionario usuario = em.find(Funcionario.class, id);
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
     public List<Funcionario> listAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Funcionario> usuario = null;
        
        try {            
            usuario = em.createQuery("from Funcionario").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Listar","Alerta",JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return usuario;
    } 
}
