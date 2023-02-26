package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author ea.san
 */
@Entity
public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String formaPagamento;
    @ManyToOne
    private Crianca crianca;
    private double totalPago;
    private double tarifa;
    private Date data;
    private int mesesPagar;

    public Pagamento() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer codDePagamento) {
        this.id = codDePagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Crianca getCrianca() {
        return crianca;
    }

    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getMesesPagar() {
        return mesesPagar;
    }

    public void setMesesPagar(int mesesPagar) {
        this.mesesPagar = mesesPagar;
    }
    
}
