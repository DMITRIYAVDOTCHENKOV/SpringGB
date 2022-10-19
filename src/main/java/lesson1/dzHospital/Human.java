package lesson1.dzHospital;

public class Human extends Registry implements Action {

	@Override
	public void processing() {
		System.out.println("'пришел в ригистратуру.'");
		System.out.println("ƒобрый день, не подскажите где находитс€ мой лечащий врачь? » когда к нему ближаша€ запись?");
		System.out.println("'√оворит что у него нет карточки и ждет решени€...'");

		Registry registry = new Registry();
		registry.archiveRequest();



	}

}
