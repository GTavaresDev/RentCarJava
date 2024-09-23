package entities;

import java.util.Date;

public class Rent {
	private String name;
	private Date dateInicial;
	private Date dateFianl;
	private Double perHour;
	private Double perDay;
	private Double totalDays;
	private Double totalHour;
	private Double taxPay100 = 0.20;
	
	public Rent(String name, Date dateInicial, Date dateFianl, Double perHour, Double perDay) {
		this.name = name;
		this.dateInicial = dateInicial;
		this.dateFianl = dateFianl;
		this.perHour = perHour;
		this.perDay = perDay;
	}

	public Double getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(Double totalDays) {
		this.totalDays = totalDays;
	}

	public Double getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(Double totalHour) {
		this.totalHour = totalHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateInicial() {
		return dateInicial;
	}

	public void setDateInicial(Date dateInicial) {
		this.dateInicial = dateInicial;
	}

	public Date getDateFianl() {
		return dateFianl;
	}

	public void setDateFianl(Date dateFianl) {
		this.dateFianl = dateFianl;
	}

	public Double getPerHour() {
		return perHour;
	}

	public void setPerHour(Double perHour) {
		this.perHour = perHour;
	}

	public Double getPerDay() {
		return perDay;
	}

	public void setPerDay(Double perDay) {
		this.perDay = perDay;
	}
	
	public void totalDays(Date totalDays) {
		this.totalDays = totalDays;
	}
	
	public Double basicPaymentPerDay() {
		return perDay * totalDays * taxPay100;
				
	}
	
	public Double basicPaymentPerHour() {
		return perHour * taxPay100;
	}
	
	
	
	
}
