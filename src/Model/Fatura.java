package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Fatura
 */
@Entity
public class Fatura {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mes;
    private double totalEntrada;
    private double totalSaida;
    private double saldo;
    private Date dataEmissao;

    public Fatura() {
    }

    public Fatura(String mes, double totalEntrada, double totalSaida, double saldo, Date dataEmissao) {
        this.mes = mes;
        this.totalEntrada = totalEntrada;
        this.totalSaida = totalSaida;
        this.saldo = saldo;
        this.dataEmissao = dataEmissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTotalEntrada() {
        return totalEntrada;
    }

    public void setTotalEntrada(double totalEntrada) {
        this.totalEntrada = totalEntrada;
    }

    public double getTotalSaida() {
        return totalSaida;
    }

    public void setTotalSaida(double totalSaida) {
        this.totalSaida = totalSaida;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

}
