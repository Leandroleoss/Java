package entities;

public class CompraDolar {

	public double Dolar;
	public double Reais;
	public double Iof = 6;

	public String CurrencyConverter() {
		double valorEmDolares = Dolar * Reais;
		double iofEmReais = (Iof / 100) * valorEmDolares;
		return String.format("%.2f", valorEmDolares + iofEmReais);
	}

}
