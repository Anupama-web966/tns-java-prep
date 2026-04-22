package tns.abstraction;

abstract class Demo{
	public void calling() {
		System.out.println("calling");
	}
	public abstract void AllIntegration();
	public abstract void Satelitedemo();
	public abstract void healthmonitoring();
}
class Test1 extends Demo{

	@Override
	public void AllIntegration() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
	}

	@Override
	public void Satelitedemo() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

	@Override
	public void healthmonitoring() {
		// TODO Auto-generated method stub
		System.out.println("standing");
	}
	
}

public class AbstractClassDemo {
     public static void main(String[] args) {
	 Test1 t=new Test1();
	 t.AllIntegration();
	 t.Satelitedemo();
	 t.healthmonitoring();
	 }
     
}
