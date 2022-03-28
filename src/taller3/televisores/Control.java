package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv){
		this.tv=tv;
		tv.setcontrol(this);
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public void setCanal(int canal) {
		this.tv.setcanal(canal);
	}
	public TV gettv() {
		return this.tv; 
	}
	public void settv(TV tv) {
		this.tv=tv;
	}
}
