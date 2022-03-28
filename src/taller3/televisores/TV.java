package taller3.televisores;

public class TV {
	Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	public int numTV;
	public TV(Marca marca,boolean estado){
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	public Marca getmarca(){
		return this.marca;
	}
	public void setmarca(Marca marca) {
		this.marca=marca;
	}
	public Control getcontrol(){
		return this.control;
	}
	public void setcontrol(Control control) {
		this.control=control;
	}
	public int getprecio(){
		return this.precio;
	}
	public void setprecio(int precio) {
		this.precio=precio;
	}
	public int getvolumen(){
		return this.volumen;
	}
	public void setvolumen(int volumen) {
		if (volumen<=7 && volumen>=0 && this.estado==true) {
			this.volumen=volumen;
		}
	}
	public int getcanal(){
		return this.canal;
	}
	public void setcanal(int canal) {
		if (canal<=120 && canal>=1 && this.estado==true) {
			this.canal=canal;
		}
	}
	public int getnumTV() {
		return numTV;
	}
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if (this.estado==true && this.canal<120){
			this.canal++;
		}
	}
	public void canalDown() {
		if (this.estado==true && this.canal>1){
			this.canal--;
		}
	}
	public void volumenUp() {
		if (this.estado==true && this.volumen<7){
			this.volumen++;
		}
	}
	public void volumenDown() {
		if (this.estado==true && this.volumen>0){
			this.volumen--;
		}
	}
}
