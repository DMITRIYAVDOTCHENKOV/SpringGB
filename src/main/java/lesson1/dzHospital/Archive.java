package lesson1.dzHospital;

public class Archive implements Action {


	@Override
	public void processing() {
		answer();

	}

	public void answer()  {
		System.out.println("'јрхив ищет карточку...'");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("'ј , вот она , нашли вашу карточку.'");
		System.out.println("'передаем в ригестратуру......'");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}
