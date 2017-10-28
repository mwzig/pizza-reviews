package com.pizzareviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {

		Review rev1 = new Review(1L, "Digiorno Rising Crust Pizza", "../images/Digiorno.png", "Frozen Pizza",
				"Self-rising crust has big, juicy toppings that are paired with a delicious signature sauce", "",
				"http://www.digiorno.com", "10/27/2017", 3);

		Review rev2 = new Review(2L, "Freschetta Naturally Rising Crust Pizza", "../images/Freschetta.jpg",
				"Frozen Pizza",
				"The cheesier the better. Mozzarella, cheddar, provolone and parmesan make the 4-Cheese pizza a sure bet on any pizza night.",
				"", "http://www.Freschetta.com", "10/27/2017", 3);

		Review rev3 = new Review(3L, "Benny's Pizza", "../images/Bennys.jpg", "Restaurant",
				"The best. Always great, dine in or carry out.  Nice crust, tasty sauce, plenty of cheese and good toppings.",
				"Marysville", "http://www.bennyspizza.com", "10/27/2017", 5);

		Review rev4 = new Review(4L, "Dewey's Pizza", "../images/Deweys.jpg", "Restaurant",
				"Delicious pizza made from scratch.  Fast, friendly service. Great dine-in experience. (Carry-out has not been good).",
				"Worthington", "http://www.deweyspizza.com", "10/27/2017", 5);

		Review rev5 = new Review(5L, "Panzera's Pizza", "../images/Panzeras.jpg", "Carry-Out Only",
				"Great neighborhood pizza maker - consistently delicious pizza.",
				"near Riverside Drive & Fishinger Road, Arlington", "http://uapanzeras-com.webnode.com", "10/27/2017",
				4);

		Review rev6 = new Review(6L, "Rotolo's Pizza", "../images/Rotolos.jpg", "Carry-Out Only",
				"No-frills branch of a family-owned chain offering pizza, subs & pasta to carry out.",
				"Grandview - 5th Avenue", "http://www.rotolospizza.com/", "10/27/2017", 4);

		reviews.put(rev1.getId(), rev1);
		reviews.put(rev2.getId(), rev2);
		reviews.put(rev3.getId(), rev3);
		reviews.put(rev4.getId(), rev4);
		reviews.put(rev5.getId(), rev5);
		reviews.put(rev6.getId(), rev6);

	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}
}
