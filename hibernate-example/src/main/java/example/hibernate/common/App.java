package example.hibernate.common;

import example.hibernate.common.Stock;
import example.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + HSQLDB");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        //session.save(stock);
       
        
        
        //session.delete(stock);
        
        session.getTransaction().commit();
        
        
    }
}
