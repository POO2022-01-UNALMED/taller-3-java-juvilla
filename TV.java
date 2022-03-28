package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	public TV(Marca marca,boolean estado){
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	public Marca getmarca(){
		return marca;
	}
	public void setmarca(Marca marca) {
		this.marca=marca;
	}
	public Control getcontrol(){
		return control;
	}
	public void setcontrol(Control control) {
		this.control=control;
	}
	public int getprecio(){
		return precio;
	}
	public void setprecio(int precio) {
		this.precio=precio;
	}
	public int getvolumen(){
		return volumen;
	}
	public void setvolumen(int volumen) {
		if (volumen<=7 && volumen>=0 && estado==true) {
			this.volumen=volumen;
		}
	}
	public int getcanal(){
		return canal;
	}
	public void setcanal(int canal) {
		if (canal<=120 && canal>=1 && estado==true) {
			this.canal=canal;
		}
	}
	public int getnumTV() {
		return numTV;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (estado==true && canal<120){
			canal++;
		}
	}
	public void canalDown() {
		if (estado==true && canal>1){
			canal--;
		}
	}
	public void volumenUp() {
		if (estado==true && volumen<7){
			volumen++;
		}
	}
	public void volumenDown() {
		if (estado==true && volumen>0){
			volumen--;
		}
	}
}
