package goodreads;

import geb.Page

public class GiveawayPage extends Page {
	static at = { waitFor(15) { $("h1", text:"Enter Giveaway") }}
	static content = {
		SelectAddressButton { $(".gr-button", text:"Select This Address") }
		termsCheckBox { $("input[name=terms]") }
		EnterGiveawayButton { $(".gr-button") }
		GiveawayTitle { $("h1") }
	}
}
