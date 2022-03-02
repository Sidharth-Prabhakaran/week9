package week9;

public enum Planet {
mercury,venus,earth,mars,jupiter,saturn,uranus,neptune("my name is neptune", 9842748, 134.56);


private String des;
private int mass;
private double rad;


Planet (){
	
}
Planet(String name, int mass,double radius){
	this.des = name;
	this.mass = mass;
	this.rad = radius;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public int getMass() {
	return mass;
}
public void setMass(int mass) {
	this.mass = mass;
}
public double getRad() {
	return rad;
}
public void setRad(double rad) {
	this.rad = rad;
}

public final double G = 9.8;
public double gravityPull(int m) {
	return (m*G)/(rad*rad);
}

}

