public class Main{
  public static void main (String[]args){
    Employee em=new Employee();
    em.setNo(20);
    em.setName("peter");
    em.setTele(5864322);
    em.setBasicSa(20000);
    em.setOtHours(4);
    em.setOtRate(2);
    em. displayNetSalary();
   Employee e=new Employee();
    e.setNo(40);
    e.setName("John");
    e.setTele(0123654);
    e.setBasicSa(30000);
    e.setOtHours(5);
    e.setOtRate(6);
    e. displayNetSalary();

    Manager m=new Manager();
     m.setNo(50);
    m.setName("prdeep");
    m.setTele(456328);
    m.setBasicSa(50000);
    m.setOtHours(6);
    m.setOtRate(7);
    m. displayNetSalary();

     Manager ma=new Manager();
    ma.setNo(48);
    ma.setName("Nimal");
    ma.setTele(785691);
    ma.setBasicSa(40000);
    ma.setOtHours(4);
    ma.setOtRate(5);
    ma. displayNetSalary();

    Director D=new Director();
     D.setNo(47);
    D.setName("Naveen");
    D.setTele(785661);
    D.setBasicSa(40000);
   D .setOtHours(8);
   D .setOtRate(7);
    D.setbonus(1000);
    D.setentertainmentAllowance(2000);
    D. displayNetSalary();

    Director Di=new Director();
   Di .setNo(52);
    Di.setName("kt");
   Di .setTele(78962541);
   Di.setBasicSa(10000);
   Di .setOtHours(8);
   Di .setOtRate(7);
    Di.setbonus(1200);
    Di.setentertainmentAllowance(2000);
   Di . displayNetSalary();
   

    }
}