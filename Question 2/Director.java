public class Director extends Manager{
  private double bonus;
  private double entertainmentAllowance;
  
  
  public Director(){
  }
  public Director(int EmpNo , String name , int telephone , double basicsalary , double allowances , double deductions,double bonus,double entertainmentAllowance  ){
    
     super(EmpNo, name, telephone, basicsalary, allowances, deductions);
    
    this.bonus=bonus;
    this.entertainmentAllowance=entertainmentAllowance;
  }
    public void setbonus(double bonus){
      this.bonus=bonus;
    }
  public void setentertainmentAllowance(double entertainmentAllowance){
    this.entertainmentAllowance=entertainmentAllowance;
  }
   public double calcNetSalary(){
  return basicsalary+allowances-deduction+bonus+entertainmentAllowance;
   
  }
   public void displayNetSalary(){
    System.out.println("Director Netsalary  : " +calcNetSalary());
}}
  