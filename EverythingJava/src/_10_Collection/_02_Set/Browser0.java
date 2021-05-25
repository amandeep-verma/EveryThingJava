package _10_Collection._02_Set;

public class Browser0 {

	String name;
	double processingSpeed;

	public Browser0() {
		System.out.println("0-param constructor invoked");
	}

	public Browser0(String name, double processingSpeed) {
		System.out.println("2-param constructor invoked");
		this.name = name;
		this.processingSpeed = processingSpeed;
	}

	void serveRequest() {
		System.out.println("Process the request");
	}

	@Override
	public String toString() {
		return "Browser [name=" + name + ", processingSpeed=" + processingSpeed + "]";
	}

}
