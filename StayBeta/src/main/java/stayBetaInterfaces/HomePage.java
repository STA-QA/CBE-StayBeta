package stayBetaInterfaces;

public interface HomePage {

	public void ClickOnMenuItem(String Option);

	public void UserSelectsAgency();
	
	public void ClickOnHome();
	
	public void SearchCountry(String SearchText, String Country);

	public void SelectItinery(int NumberOfDays) throws InterruptedException;

	public void SelectItinerary(int StartDay, int NumberOfDays);

	public void SelectExcludeDormBeds();

	public void SelectNumberOfRooms(String NoOfRooms);

	public void SelectNumberOfAdults(String NoOfAdults, int RoomNumber) throws InterruptedException;

	public void SelectNumberOfChildren(String NoOfChildren, int RoomNumber) throws InterruptedException;
	
	public void EnterChildrenAge(int age, int box);
	
	public void ClickSearch();
	
}
