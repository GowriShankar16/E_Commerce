package javaDemo.BO;

import java.util.List;

import javaDemo.DAO.ProductDAO;
import javaDemo.DAO.UserDAO;
import javaDemo.E_com.Product;
import javaDemo.E_com.User;

public class ProductBO {
	 ProductDAO productdao = new ProductDAO();
     
	  public void saveproduct(Product product){
		  productdao.save(product);
	       }
	  public Product  checkproduct(String product) {
		  Product checkproduct=null;
  	    List<Product>checkProductList =productdao.productlist();
  	    for(int i=0;i<checkProductList.size();i++) {
  		   if(product.equalsIgnoreCase(checkProductList.get(i).getName())) {
  			  checkproduct = checkProductList.get(i);
  		    }
  		 
  		}
		   return checkproduct;
        }
}
