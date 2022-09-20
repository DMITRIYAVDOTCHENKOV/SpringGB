package lesson1.ls1_1;


public class MainLesson8 {
	public static void main(String[] args) {


        var camera = new Camera();
        var roll = new BlackAndWhiteCameraRoll();
        camera.setCameraRoll(roll);
        camera.doPhotograph();


//        ICameraRoll roll = new BlackAndWhiteCameraRoll();
//        ICameraRoll roll1 = new ColorCameraRoll();
//        Camera camera = new Camera();
//        camera.setCameraRoll(roll);
//        camera.doPhotograph();

	}
}



