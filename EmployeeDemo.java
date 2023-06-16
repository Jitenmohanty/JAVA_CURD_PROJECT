import java.util.*;

 class Employee{
    private int empno;
    private String empname;
    private int empSalary;

    public Employee(int empno, String empname, int empSalary) {
        this.empno = empno;
        this.empname = empname;
        this.empSalary = empSalary;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee : [empno=" + empno + ", empname=" + empname + ", empSalary=" + empSalary + "]";
    }
    
}

    class CURD{
        public static void main(String[] args) {
            List<Employee> c = new ArrayList<Employee>();
            //Two scanner Method bcz one scanner did not handle the both string and integer..... 
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            int ch;

            do{
                System.out.println("1.INSERT");
                System.out.println("2.DISPLAY");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("5.UPDATE");
                ch=s.nextInt();

                switch(ch){
                    case 1:
                    System.out.print("Enter employee no: ");
                    int eno=s.nextInt();
                    System.out.print("Enter employee name: ");
                    String eName=s1.nextLine();
                    System.out.print("Enter employee Salary: ");
                    int eSalary = s.nextInt();

                    c.add(new Employee(eno, eName, eSalary));
                    break;

                    case 2:
                    System.out.println(".............................");
                    Iterator <Employee> i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e); 
                    }
                    System.out.println("..............................");
                    break;

                    case 3:
                    boolean found = false;
                    System.out.print("Enter emp no to Search :");
                    eno = s.nextInt();
                    System.out.println("...................");
                     i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmpno() == eno){
                            System.out.println(e); 
                            found = true;
                        }
                      
                    }
                    if(!found){
                        System.out.println("No record Found");
                    }
                    System.out.println("................................");
                    break;

                    case 4:
                    found = false;
                    System.out.print("Enter emp no to Delete :");
                    eno = s.nextInt();
                    System.out.println("................................");
                     i = c.iterator();
                    while(i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmpno() == eno){
                            i.remove();
                            found = true;
                        }
                      
                    }
                    if(!found){
                        System.out.println("No record Found");
                    }else{
                        System.out.println("Record deleted Successfully");
                    }
                    System.out.println("................................");
                    break;
                    
                    case 5:
                    found = false;
                    System.out.print("Enter emp no to Update :");
                    eno = s.nextInt();
                    System.out.println("................................");
                     ListIterator<Employee> li = c.listIterator();
                    while(li.hasNext()){
                        Employee e = li.next();
                        if(e.getEmpno() == eno){
                            System.out.print("Enter new Name : ");
                            eName=s1.nextLine();
                            System.out.print("Enter new Salary : ");
                            eSalary=s.nextInt();
                            li.set(new Employee(eno, eName, eSalary));
                            found = true;
                        }
                      
                    }
                    if(!found){
                        System.out.println("No record Found");
                    }else{
                        System.out.println("Record is Updated Successfully");
                    }
                    System.out.println("................................");
                    break;
                    
                }
            }
            while(ch!=0);
        }
    }
