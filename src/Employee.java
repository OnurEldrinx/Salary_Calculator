public class Employee {

    String fullName;
    double salary;
    double workHoursPerWeek;
    int hiringYear;

    //Constructor
    public Employee(String fullName, double salary, double workHoursPerWeek, int hiringYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHoursPerWeek = workHoursPerWeek;
        this.hiringYear = hiringYear;
    }

    //Methods
    public double tax(){

        if (this.salary < 1000){

            return 0;

        }else{

            return this.salary * 0.03;

        }

    }

    public double bonus(){

        if (this.workHoursPerWeek>40){

            return (this.workHoursPerWeek - 40)*30;

        }else{

            return 0;

        }

    }

    public double raiseSalary(){

        int currentYear = 2021;

        if (currentYear - this.hiringYear < 10){

            return (this.salary*0.05);

        }else if(currentYear - this.hiringYear > 9 && currentYear - this.hiringYear < 20){

            return (this.salary*0.10);

        }else if (currentYear - this.hiringYear > 19){

            return (this.salary*0.15);

        }else{

            return 0;

        }

    }

    public String toString(){


        return  "\n-----------------------------------------------------"+
                "\nFull Name                       : " + this.fullName +
                "\nSalary                          : " + this.salary   +
                "\nWork Hours                      : " + this.workHoursPerWeek +
                "\nStarting Year                   : " + this.hiringYear +
                "\nTaxes                           : " + this.tax() +
                "\nBonuses                         : " + this.bonus() +
                "\nSalary Increase                 : " + this.raiseSalary() +
                "\nSalary After Bonuses & Taxes    : " + (this.salary + this.bonus() - this.tax()) +
                "\nTotal Salary After The Increase : " + (this.salary + this.raiseSalary()) +
                "\n-----------------------------------------------------";
    }

}
