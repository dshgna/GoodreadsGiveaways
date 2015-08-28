package goodreads;

import geb.Page

public class ListingPage extends Page {
	static url = "https://www.goodreads.com/giveaway"
	static at = { waitFor(15) { $("h1", text:"Giveaways") }}
	static content = {
		GiveawayListItem(wait: true) { $(".giveawayListItem") }
		GiveawayButton(wait: true) { $(".gr-button") }
	}
}
