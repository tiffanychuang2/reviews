package com.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	protected Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {
		Review review1 = new Review(11111, "Captain America: Civil War", "/images/captainamericacivilwar.jpg", "Action",
				"\"I just wanna make sure we consider all our options. The people that shoot at you usually wind up shooting at me.\"",
				"Political interference in the Avengers' activities causes a rift between former allies Captain America and Iron Man.",
				"\"It is one of the best movies to ever come out of the Marvel Cinematic Universe, balancing engaging action set pieces and witty dialogue with intelligent character studies and ethical debates.\" - Reviewer 1",
				"\"The motto of the directors, Anthony and Joe Russo, appears to be: If you can make it happen, do it. Don't hold back.\" - Reviewer 2",
				"\"Civil War reminds us it's OK to enjoy a few laughs, even while diabolical villains plot doom, outraged citizens demand accountability and your best pal mistrusts you.\" - Reviewer 3",
				"2016");
		Review review2 = new Review(22222, "Doctor Strange", "/images/doctorstrange.jpg", "Action",
				"\"Wong. Just Wong? Like Adele? Or Aristotle. Drake. Bono... Eminem.\"",
				"While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts.",
				"\"Cumberbatch, both a natural comedian and a subtle one, knows how to get a big laugh from nothing more than an arched eyebrow.\" - Reviewer 1",
				"\"Lives up to its title, in mostly good ways.\" - Reviewer 2",
				"\"Doctor Strange, intended to be a mind-bending, rule-breaking rebuke to the squares of superhero cinema, turns out to be a rebel in name only -- the textbook definition of a bad trip.\" - Reviewer 3",
				"2016");
		Review review3 = new Review(33333, "Guardians of the Galaxy, Vol. 2", "/images/guardiansofthegalaxyvol2.jpg",
				"Action", "\"You shouldn't have killed my mom and squished my Walkman.\"",
				"The Guardians must fight to keep their newfound family together as they unravel the mystery of Peter Quill's true parentage.",
				"\"Let's hope that Vol. 3 recaptures the fizz of the original, instead of slumping into the most expensive group-therapy session in the universe.\" - Reviewer 1",
				"\"As Baby Groot's companions battle the tentacular horror in the background, we're treated to the delightful spectacle of the mini-veggie juking his way through \"Mr. Blue Sky\" in the opening credits.\" - Reviewer 2",
				"\"The reunion of the Guardians cements Pratt's mega-stardom. He has a shaggy young Kurt Russell vibe (think Big Trouble in Little China,). And Russell himself is a great addition to the ensemble, providing a dose of kick-back, kick-ass action\" - Reviewer 3",
				"2017");
		Review review4 = new Review(44444, "Spiderman: Homecoming", "/images/spidermanhomecoming.jpg", "Action",
				"\"Wait a minute... You guys aren't the real Avengers! I can tell Hulk gives it away.\"",
				"Peter Parker balances his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New York City.",
				"\"What makes this homecoming fun is [Tom] Holland, who seems as excited about Spider-Man as his classmates even though he is Spider-Man.\" - Reviewer 1",
				"\"A strangely oblivious film, one that undercuts its story with exactly the sort of praise-hungriness that its hero learns to overcome.\" - Reviewer 2",
				"\"A film that smuggles in a delightfully dorky high school saga under the banner of a too familiar superhero one.\" - Reviewer 3",
				"2017");
		Review review5 = new Review(55555, "Thor: Ragnorak", "/images/thorragnarok.jpg", "Action",
				"\"She's too powerful, I have no hammer.\"",
				"Imprisoned, the mighty Thor finds himself in a lethal gladiatorial contest against the Hulk, his former ally. Thor must fight for survival and race against time to prevent the all-powerful Hela from destroying his home and the Asgardian civilization.",
				"\"In its own weird little way, Thor: Ragnarok manages to poke fun at the constant churn of myth and entertainment of which the movie itself is a part. It's a candy-colored cage of delights, but it is a cage nevertheless - and it doesn't hide that fact.\" - Reviewer 1",
				"\"Thor: Ragnarok is packed tight with zooming space vehicles and noisy thunder battles, but the movie's extravagant excess is more narcotizing than energizing. Even poor Thor seems lost in all of it, and he's supposed to be its star.\" - Reviewer 2",
				"\"It's good to see Ruffalo liberated from the more masochistic portrait in Avengers: The Age of Ultron, and with a fresh partner in Tessa Thompson.\" - Reviewer 3",
				"2017");

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
