
package DAO;

import Connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import Model.Fatura;

/**
 * @author ea.san
 */
public class FaturamentoDAO {
    public Fatura save(Fatura faturamento) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (faturamento.getId() == null) {
                em.persist(faturamento);
            } else {
                em.merge(faturamento);
            }
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Gravado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Gravar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return faturamento;
    }

    public Fatura findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Fatura faturamento = null;
        try {
            faturamento = em.find(Fatura.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Procurar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } finally {
            em.close();
        }
        return faturamento;
    }

    public Fatura delete(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Fatura faturamento = em.find(Fatura.class, id);
        try {
            em.getTransaction().begin();
            em.remove(faturamento);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Apagado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Apagar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return faturamento;
    }

    public List<Fatura> listAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Fatura> faturamentos = null;

        try {
            faturamentos = em.createQuery("from Fatura").getResultList();
        } catch (Exception e) {
            //em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Listar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return faturamentos;
    }
}
