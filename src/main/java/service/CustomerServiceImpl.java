package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import org.springframework.beans.factory.config.*;

import java.util.List;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

//    @Autowired
    CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection.");
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl() {
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection.");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
