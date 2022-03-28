package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv){
		this.tv=tv;
		tv.setcontrol(this);
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canal) {
		tv.setcanal(canal);
	}
	public TV gettv() {
		return tv; 
	}
	public void settv(TV tv) {
		this.tv=tv;
	}
}
