package stayBetaInterfaces;

import java.text.ParseException;

public interface HotelCancel {

	public void TakeSSofCancellationChargesFromLB();
	public void DeleteProductFromShoppingCart() throws InterruptedException;
	public void ProductDeleteVerification();
	public void ClickRetrieveLatestBooking() throws InterruptedException;
	public void VerifyBookingCancellation();
	public void ChangeFromDateForHotelAmend() throws ParseException;
	public void AddToCartInAmend();
}
