public class Employee{
  private int Empno;
  private String name;
  private int telephone;
  protected double basicsalary;
  private int othrs;
  private double otrate;

  public Employee(){
    
  }

  public Employee(int Empno,String name,int   
   telephone,double basicsalary){
    this.Empno=Empno;
    this.name=name;
    this.telephone=telephone;
    this.basicsalary=basicsalary;
   }

  public void setNo(int Empno){
    this.Empno=Empno;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setTele(int telephone){
    this.telephone=telephone;
  }
  public void setBasicSa(double basicsalary){
    this.basicsalary=basicsalary;
  }
   public void setOtHours(int othrs){
    this.othrs=othrs;
  }
  public void setOtRate(double otrate){
    this.otrate=otrate;
  }
   public double calcNetSalary(){
     return (double)basicsalary+(othrs*otrate);
  }
  public void displayNetSalary(){
    System.out.println("NetSalary is :"+ calcNetSalary());
  }
}