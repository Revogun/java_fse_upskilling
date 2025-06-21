public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        return "Customer{id='" + id + "', name='Revo Customer'}";
    }
}
