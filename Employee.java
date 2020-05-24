package primeraPracticaHerencia;

import javax.swing.JOptionPane;

public class Employee extends Person {
	double salary;

	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary=salary;
		
	}
	public void information() {
		System.out.println("Nombre: " + name);
		System.out.println("Edad: "+ age);
		System.out.println("Salario: " + salary);
		
		
	//	(null, "Nombre: " + name + "\nEdad: " + age + "\nSalario: " + salary);
	}

}
