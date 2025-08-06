package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
		//instanciando um DepartmentDao.O programa não conhece a implementação
		//conhece somente a interface, é uma forma de injeção de dependencia
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		       
        System.out.println("\n=== TEST 2: seller findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
        	System.out.println(dep);
        }
        
        /*
        System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null,"Greg Brown", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller);
		
		  
        System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();*/
	}

}
