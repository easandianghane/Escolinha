
package DAO;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import Connection.ConnectionFactory;
import java.io.FileOutputStream;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import Model.Pagamento;

/**
 *
 * @author ea.san
 */
public class PagamentoDAO {
    public Pagamento save(Pagamento pagamento) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (pagamento.getId() == null) {
                em.persist(pagamento);
            } else {
                em.merge(pagamento);
            }
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Gravado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Gravar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return pagamento;
    }

    public Pagamento findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Pagamento pagamento = null;
        try {
            pagamento = em.find(Pagamento.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Procurar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } finally {
            em.close();
        }
        return pagamento;
    }

    public Pagamento delete(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Pagamento pagamento = em.find(Pagamento.class, id);
        try {
            em.getTransaction().begin();
            em.remove(pagamento);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Apagado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Apagar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return pagamento;
    }

    public List<Pagamento> listAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Pagamento> pagamentos = null;

        try {
            pagamentos = em.createQuery("from Pagamento").getResultList();
        } catch (Exception e) {
            //em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao Listar", "Alerta", JOptionPane.WARNING_MESSAGE);

        } finally {
            em.close();
        }
        return pagamentos;
    }
}
