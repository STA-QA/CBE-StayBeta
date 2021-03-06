package stayBetaInterfaces;

import java.text.ParseException;

public interface HotelCancel {

	public void TakeSSofCancellationChargesFromLB();
	public void DeleteProductFromShoppingCart() throws InterruptedException;
	public void ProductDeleteVerification();
	public void ClickRetrieveLatestBooking() throws InterruptedException;
	public void VerifyBookingCancellation();
	public void ChangeFromDateForHotelAmend(int NewDate) throws ParseException;
	public void ReduceFromDateForHotelAmend(int NoOfNightsToReduce) throws ParseException;
	public void AddToCartInAmend();
	public void ClickOnCancellationConditionsLink();
	public void GetTheCancellationChargesDetails() throws InterruptedException;
	 public void ClickHotelDetailiconDuringAmendments() throws InterruptedException;
}
