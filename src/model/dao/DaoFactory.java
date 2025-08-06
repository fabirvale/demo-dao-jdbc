package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

// DAO Factory é um padrão que fornece uma fábrica de DAOs, centralizando a criação deles e deixando a aplicação independente de detalhes de implementação de persistência.
//Ela instancia os Daos

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
