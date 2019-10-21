package stayBetaInterfaces;

import java.io.IOException;
import java.util.List;

public interface Hotel {

	public void SearchCountry(String SearchText, String Country);

	public void SelectItinery(int NumberOfDays) throws InterruptedException;

	public void SelectItinerary(int StartDay, int NumberOfDays);

	public void SelectExcludeDormBeds();

	public void SelectNumberOfRooms(String NoOfRooms);

	public void SelectNumberOfAdults(String NoOfAdults, int RoomNumber) throws InterruptedException;

	public void SelectNumberOfChildren(String NoOfChildren, int RoomNumber) throws InterruptedException;

	public void EnterChildrenAge(int age, int box);

	public void ExpandExtraSearch();

	public void DeselectAll();

	public void ExcludeOnRequestRooms();

	public void SelectHotelDataSource(String HotelProvider);

	public void ClickSearch();

	public void SearchHotel(String SearchText, String HotelName) throws InterruptedException;

	public void CountResultsWithoutAnyParticularHotelSearch();

	public void CountResultsWithParticularHotelTextSearch(String SearchText);

	public void ClickAddToCart() throws InterruptedException;

	public void ClickOnCompleteBooking() throws InterruptedException;

	public void SelectBookRB() throws InterruptedException;

	public void EnterPersonDetails(); // This can be made dynamic in future

	public void AcceptTermsAndConditions();

	public void ClickOnBook() throws IOException;

	public void ClickMyBookings();

	public void SelectBookingSearch();

	public void EnterBookingSearchCriteria(); // This can be made dynamic by passing particular data

	public void ClickBookingSearch() throws InterruptedException;

	public void SelectBookingFromList(); // This can be made dynamic by passing particular data

	public void ClickOnAmendCompleteBooking() throws InterruptedException;

	public void SearchOptionInCart();

	public void SelectAmendThisItem() throws InterruptedException;

	public void AcceptThePopup() throws InterruptedException;

	public void SelectRandomHotel() throws InterruptedException;

	public void EnterGuestDetails(int Guests) throws InterruptedException;

	public void EnterAdultDetails(int Guests) throws InterruptedException;


	public void EnterChildrenDetails(int children, int total, List<Integer> ChildrenAge) throws InterruptedException;



	//public void EnterChildrenDetails(int children, int total, List<Integer> ChildrenAge) throws InterruptedException;
		public void ClickOnCancelItem();

	public void ClickUpdateButton();

	public void VerifyQuoteRBIsSelected();

	public void bookingConfirmation() throws IOException;

	public void searchLoadingtime();

}
