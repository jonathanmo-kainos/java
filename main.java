public class main
{
    public static void main(String[] args)
    {
        String name = "Bob";
        double salary = 100052.45;
        double taxP = 20;
        System.out.println("Salary with tax: " + Tax(name, salary, taxP));

    }

    public static double Tax(String name, double salary, double taxP)
    {
        System.out.println("Starting to calculate tax for " + name);
        System.out.println("Salary without tax: " + salary);
        System.out.println("Taking " + taxP + "% off due to tax");
        salary = salary / 100;
        salary = salary * (100 - taxP);
        salary = Math.round(salary * 100) / 100.0;
        System.out.println("finished calculating tax for " + name);
        return salary;
    }
}