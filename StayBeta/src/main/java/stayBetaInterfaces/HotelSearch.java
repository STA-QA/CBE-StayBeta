package stayBetaInterfaces;

import java.io.IOException;

public interface HotelSearch {

	public void VerifySearchResultsOfDS(String DataSource);

	public void VerifyReviewsForHotel() throws InterruptedException;

	public void VerifyRatingsForHotel();

	public void AddRandomHotelToCartFromTSRes() throws InterruptedException, IOException;

	public void SelectRoomSelectionTabFromLB() throws InterruptedException;

	public void SelectRoomFromSelectionInLB();

	public void SelectSameTypeRoomsFromListsInLB(int NoOfRooms) throws InterruptedException;

	public void SelectDiffTypeRoomsFromListsInLB(int NoOfRooms) throws InterruptedException;

	public void AddToCartFromLBWithoutSwitchingFrame() throws InterruptedException;

	public void ExpandRandomHotelRoomtypeOptionsInTable();

	public void SelectARoomFromListInSearchResults();

	public void ClickAddSelectionToCart();

	public void SelectMultipleRoomsSameTypeFromListInSearchResults() throws InterruptedException;

	public void SelectMultipleRoomsDifferentTypeFromListInSearchResults() throws InterruptedException;

	public void VerifySuccessWithInfo();

	public void CancellationCondition_Within() throws InterruptedException;

	public void CancellationCondition_Outside() throws InterruptedException;

	void addToCart_RefundableHotelRooms() throws InterruptedException;
}
