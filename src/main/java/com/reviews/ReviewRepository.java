package com.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {
		Review review1 = new Review(11111, "Captain America: Civil War", "/images/captainamericacivilwar.jpg",
				"review category",
				"I just wanna make sure we consider all our options. The people that shoot at you usually wind up shooting at me.",
				"2016");
		Review review2 = new Review(22222, "Doctor Strange", "/images/doctorstrange.jpg", "review category",
				"Wong. Just Wong? Like Adele? Or Aristotle. Drake. Bono... Eminem.", "2016");
		Review review3 = new Review(33333, "Guardians of the Galaxy, Vol. 2", "/images/guardiansofthegalaxyvol2.jpg",
				"review category", "You shouldn't have killed my mom and squished my Walkman.", "2017");
		Review review4 = new Review(44444, "Spiderman: Homecoming", "/images/spidermanhomecoming.jpg",
				"review category", "Wait a minute... You guys aren't the real Avengers! I can tell Hulk gives it away.",
				"2017");
		Review review5 = new Review(55555, "Thor: Ragnorak", "/image/thorragnarok.jpg", "review category",
				"She's too powerful, I have no hammer.", "2017");

		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
		reviews.put(review4.getId(), review4);
		reviews.put(review5.getId(), review5);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
