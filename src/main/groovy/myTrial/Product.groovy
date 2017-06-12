package myTrial

import groovy.transform.Canonical
import org.springframework.data.annotation.Id

@Canonical
class Product {
	@Id int productID
	String productName
	String productDescription
	double price

}
