package differntial;

public class Differential_lib implements Differntial_if {
	private double a,h;
	public Differential_lib(double a,double h){
		this.a=a;
		this.h=h;
	}
	@Override
    public double getRx(){
    	return 2*this.a;
    }
    @Override
    public double getDx(){
    	return(Math.pow(this.a+this.h,2)-Math.pow(this.a,2))/h;
    }
    @Override
    public double getRe(){
    	return Math.abs(2*this.a-(Math.pow(this.a+this.h,2)-Math.pow(this.a,2))/h)/(2*this.a)*100;
    }
}
