package lesson1.ls1_1;

public class Camera {
	ICameraRoll cameraRoll;

	public void setCameraRoll(ICameraRoll cameraRoll) {
		this.cameraRoll = cameraRoll;
	}

	public void doPhotograph() {
		System.out.println("����!");
		cameraRoll.processing();
	}
}
