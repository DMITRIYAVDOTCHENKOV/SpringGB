package lesson1.dzHospital;

public class Human extends Registry implements Action {

	@Override
	public void processing() {
		System.out.println("'������ � ������������.'");
		System.out.println("������ ����, �� ���������� ��� ��������� ��� ������� �����? � ����� � ���� �������� ������?");
		System.out.println("'������� ��� � ���� ��� �������� � ���� �������...'");

		Registry registry = new Registry();
		registry.archiveRequest();



	}

}
