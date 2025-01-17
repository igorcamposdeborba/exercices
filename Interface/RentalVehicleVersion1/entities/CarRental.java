package entities;

import java.util.Date;

public class CarRental {
	private Date start;
	private Date finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental(Date start, Date finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		// não atribuir invoice porque um veículo pode ter 0 ou 1 aluguéis nesta data
	}
	
	public Date getStart() {
		return start;
	}
	public Date getFinish() {
		return finish;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	
	public void setStart(Date start) {
		this.start = start;
	}
	public void setFinish(Date finish) {
		this.finish = finish;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
