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

		Review rev3 = new Review(3L, "Freschetta Naturally Rising Crust Pizza", "../images/Freschetta.jpg",
				"Frozen Pizza",
				"The cheesier the better. Mozzarella, cheddar, provolone and parmesan make the 4-Cheese pizza a sure bet on any pizza night.",
				"", "http://www.freschetta.com", "10/27/2017", 3);

		reviews.put(rev1.getId(), rev1);
		reviews.put(rev2.getId(), rev2);
		reviews.put(rev3.getId(), rev3);

	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}
}
