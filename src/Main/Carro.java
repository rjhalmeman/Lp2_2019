package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author radames
 */
public class Carro {
   private String placaCarro;
   private String nomeCarro;
   private double pesoCarro;
   private Date dataLancamento;

    public Carro() {
    }

    public Carro(String placaCarro, String nomeCarro, double pesoCarro, Date dataLancamento) {
        this.placaCarro = placaCarro;
        this.nomeCarro = nomeCarro;
        this.pesoCarro = pesoCarro;
        this.dataLancamento = dataLancamento;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public double getPesoCarro() {
        return pesoCarro;
    }

    public void setPesoCarro(double pesoCarro) {
        this.pesoCarro = pesoCarro;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return placaCarro + ";" + nomeCarro + ";" + pesoCarro + ";" + sdf.format(dataLancamento);
    }

   
   
}