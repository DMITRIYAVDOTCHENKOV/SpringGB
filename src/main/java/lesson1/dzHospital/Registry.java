package lesson1.dzHospital;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class Registry extends Archive implements Action {


	@Override
	public void processing() {
		archiveRequest();
		randomData();

	}



	public void archiveRequest() {
		System.out.println("'Регистратура делает запрос в архив.....'");
		answer();
		randomData();

	}


	public void randomData() {
		Random random = new Random(System.currentTimeMillis());
		int kabinet = random.nextInt(100, + 300);

		long leftLimit = 0L; // 01/01/1970, 00:00
		long rightLimit = Instant.now().toEpochMilli();
		long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
		var randomDate = Instant.ofEpochMilli(generatedLong);

		DateTimeFormatter formatter =
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
						.withZone(ZoneId.systemDefault());

		System.out.println("Ваш прием будет проходить: " + formatter.format(randomDate) + "  в кабинете № " + kabinet);
	}

	public void setHuman(Registry human) {
	}

}
