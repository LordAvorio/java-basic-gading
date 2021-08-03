package gadingpackage.application;

import gadingpackage.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        

        Company company = new Company();
        company.setName("Gading Condro Prakoso");

        Company.Employee employee = company.new Employee();
        employee.setName("Mardux");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}
