package stayBetaInterfaces;

public interface Insurance {

	public void SelectRegion(String Region);
	
	public void selectTheDOB() throws InterruptedException;
	
	public void selectTheDOB(int index, int Age) throws InterruptedException;
	
	public void selectNumberOfPassengers(String Pax);
	
	public void SelectInsuranceType(String InsuranceType);
	
	public void ClickInsuranceSearch();
	
	public void AddInsuranceToCart();
	
	public void CompleteInsuranceBooking();
	
	public void SelectBookRB();
	
	
}
