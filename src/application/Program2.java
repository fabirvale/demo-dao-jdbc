package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		//instanciando um DepartmentDao.O programa não conhece a implementação
		//conhece somente a interface, é uma forma de injeção de dependencia
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		       
        System.out.println("\n=== TEST 2: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
        	System.out.println(dep);
        }
        
        
      /*  System.out.println("\n=== TEST 3: Department insert ===");
		Department newDep = new Department(null,"Kids");
        departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep);
		
		 
       System.out.println("\n=== TEST 4: Department update ===");
        newDep = departmentDao.findById(1);
		newDep.setName("Home Decor");
		departmentDao.update(newDep);
		System.out.println("Update completed!");*/
		
		
		System.out.println("\n=== TEST 5: Department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
