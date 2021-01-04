public class DynamicBindingDemo {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
		
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}

}
class Person{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "person";
	}
}
class Student extends Person{
	@Override
	public String toString() {
		return "student";
	}
}
class GraduateStudent extends Student{
	
}
