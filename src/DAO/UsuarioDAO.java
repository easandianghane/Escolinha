package DAO;

import Connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import Model.Usuario;

/**
 * @author Isabel
 */

public class UsuarioDAO {

    public Usuario save(Usuario usuario) {
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
   
    public Usuario delete(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Usuario usuario = em.find(Usuario.class, id);
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
     public List<Usuario> listAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Usuario> usuario = null;
        
        try {            
            usuario = em.createQuery("from Usuario").getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Listar","Alerta",JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return usuario;
    }
}