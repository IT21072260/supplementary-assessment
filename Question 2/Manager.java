public class Manager extends Employee{
  protected double allowances;
  protected double deduction;
  
  public Manager(){
    
  }
  public Manager(int EmpNo , String name , int telephone , double basicsalary ,double allowances,double deduction){
    super(EmpNo,name,telephone,basicsalary);
    this.allowances=allowances;
    this.deduction=deduction;
  }
  public void setAllowances(double allowances ){
    this.allowances=allowances;
  }
  public void setdeduction(double deduction){
    this.deduction=deduction;
  }
  
  
    public double calcNetSalary(){
      
   return basicsalary+allowances-deduction;
   
  }
  public void displayNetSalary(){
    System.out.println("Manager Netsalary is : " +calcNetSalary());
  }
  }