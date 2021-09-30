package repository;

import model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUserName}")
    String dbUserName;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUserName);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Bryan");
        customer.setLastName("Hansen");
        customers.add(customer);
        return customers;
    }
}
