import java.util.Scanner; 
public class Menu_03{
	Conversion cnv_01 = new Conversion();
	Calculation calc_01 = new Calculation();
	Scanner sc = new Scanner(System.in);
	
	void displayMainMenu(){
		
		System.out.println("1. Conversion SubMenu");
		System.out.println("2. Calculation SubMenu");
		System.out.println("0. Exit");
		
		int num_opt = sc.nextInt();

		switch(num_opt){
			case 0:
			    return;
			case 1:
			    displayConversionSubMenu();
				break;
			case 2:
			    displayCalculationSubMenu();
				break;
			default:
			    displayMainMenu();
				
			
		}
		
	}
	
	void displayConversionSubMenu(){

		System.out.println("1. Conversion Length Submenu");
		System.out.println("2. Conversion Weight Submenu");
		System.out.println("3. Conversion Temperature Submenu");
		System.out.println("0. Exit");
		

		int num_opt = sc.nextInt();

		
		switch(num_opt){
			case 0:
			    displayMainMenu();
				break;
			case 1:
                displayConversionLengthSubmenu();
                break;
            case 2:
                displayConversionWeightSubmenu();
				break;
            case 3:
                displayConversionTemperatureSubmenu();
                break;
            default:
                displayConversionSubMenu();		
				
		}
	
	}
	
	
	void displayCalculationSubMenu(){
		System.out.println("1. Sum of Series");
	    System.out.println("2. Sum of Array");
		System.out.println("3. Product of Series");
		System.out.println("4. Product of Array");
		System.out.println("0. Exit");

		int num_opt = sc.nextInt();

		switch(num_opt){
			            case 0:
						    displayMainMenu();
							break;
						
						case 1:
							System.out.println("starting number: ");
							int s_num= sc.nextInt();
							System.out.println("ending number: ");
							int e_num= sc.nextInt();
							System.out.println("incrementing number: ");
							int i_num= sc.nextInt();
							
							System.out.println("\nSum of series: " + calc_01.SumOfSeries(s_num,e_num,i_num) );
							displayCalculationSubMenu();
							break;
							
						case 2:
							
							
							System.out.println("\n Enter the size of the array: ");
							int size = sc.nextInt();
							int arr[] = new int[size];
							int hold;
							
							for(int i=0; i<size; i++){
								
								hold=0;
								System.out.println("Enter element "+ (i+1) + ": ");
								hold = sc.nextInt();
								arr[i]=hold;
							
							}
						
							System.out.println("\nSum of Array: "+calc_01.SumOfArray(arr,size));
							displayCalculationSubMenu();
							break;
						
						case 3:
							System.out.println("starting number: ");
							int start= sc.nextInt();
							System.out.println("ending number: ");
							int end= sc.nextInt();
							System.out.println("incrementing number: ");
							int incr= sc.nextInt();
							System.out.println("\nProduct of series: " + calc_01.ProductOfSeries(start,end,incr) );
							displayCalculationSubMenu();
							break;
							
						case 4:
							System.out.println("\n Enter array size: ");
							int psize = sc.nextInt();
							int parr[] = new int[psize];
							int phold;
							
							for(int i=0; i<psize; i++){
								
								phold=0;
								System.out.println("Enter number"+ (i+1) +": ");
								phold = sc.nextInt();
								parr[i]=phold;
							
							}
						
							System.out.println("\nProduct of Array: "+ calc_01.ProductOfArray(parr,psize));
							displayCalculationSubMenu();
							break;
							
						default:
							displayCalculationSubMenu();
						
						}
		
		
		
		
	}
	
	void displayConversionLengthSubmenu(){

		System.out.println("1. KM To Miles");
	    System.out.println("2. Miles To KM");
		System.out.println("3. Feet To Metres");
		System.out.println("4. Metres To Feet");
		System.out.println("0. Exit");

		int num_opt = sc.nextInt();

		
		switch(num_opt){
			            case 0:
						    displayConversionSubMenu();
							break;
						
						case 1:
							
                            System.out.println("\n Enter distance in KM: ");
                            double km_num = sc.nextDouble();
                            System.out.println("\n" + km_num +" km = "+ cnv_01.KMToMiles(km_num)+" miles");
							displayConversionLengthSubmenu();
							break;
							
						case 2:

							System.out.println("\n Enter value in miles: ");
							double mile_num = sc.nextDouble();
							System.out.println("\n" +mile_num+" miles = "+ cnv_01.MilesToKM(mile_num)+"km");
							displayConversionLengthSubmenu();
							break;
						
						case 3:
							
							System.out.println("\n Enter the value in Feet: ");
                            double feet_num = sc.nextDouble();
                            System.out.println("\n" +feet_num + " feet = " + cnv_01.FeetToMetres(feet_num)+" meters");
							displayConversionLengthSubmenu();
                            break;
							
						case 4:
							System.out.print("\n Enter the value in Meters: ");
                            double meter_num = sc.nextDouble();
                            System.out.println("\n" +meter_num + " meters =  " + cnv_01.FeetToMetres(meter_num)+" Feet");
							displayConversionLengthSubmenu();
							break;
							
						default:

						    displayConversionLengthSubmenu();
					}
		
		
		
	}
	
	void displayConversionWeightSubmenu(){

		System.out.println("1. Kg To Pounds");
	    System.out.println("2. Pounds To Kg");
		System.out.println("0. Exit");
		

		int num_opt = sc.nextInt();

		
		switch(num_opt){
			
			            case 0:
						    displayConversionSubMenu();
							break;
			
			
						case 1:
                            System.out.println("\nEnter the value in KG: ");
                            double kg_num = sc.nextDouble();
                            System.out.println("\n" +kg_num + " kg =  " + cnv_01.KgToPounds(kg_num)+" Pounds");
							displayConversionWeightSubmenu();
                            break;
								
                        case 2:
                            System.out.println("\nEnter the value in Pounds: ");
                            double pounds_num = sc.nextDouble();
                            System.out.println("\n" +pounds_num + " pounds =  " +cnv_01.PoundsToKg(pounds_num)+" Kg");
							displayConversionWeightSubmenu();
                            break;
							
						default:
						    displayConversionWeightSubmenu();
							
						
		}				
		
	}
	
	void displayConversionTemperatureSubmenu(){

		System.out.println("1. Celcius To Fahrenheit");
		System.out.println("2. Fahrenheight To Celcius");
		System.out.println("0. Exit");
		

		int num_opt = sc.nextInt();

		
		switch(num_opt){
			
			            case 0:
						    displayConversionSubMenu();
							break;
			
			
						case 1:
                            System.out.println("\n Enter the value in Celcius: ");
                            double Celcius_num = sc.nextDouble();
                            System.out.println("\n" +Celcius_num + " Celcius =  " + cnv_01.CelciusToFahrenheit(Celcius_num)+"Fahrenheit");
							displayConversionTemperatureSubmenu();
                            break;
							
                        case 2:
                            System.out.print("\n Enter the value in Fahrenheight: ");
                            double Fahrenheight_num = sc.nextDouble();
                            System.out.println("\n" +Fahrenheight_num + " Fahrenheight =  " + cnv_01.FahrenheightToCelcius(Fahrenheight_num)+" Celcius");
							displayConversionTemperatureSubmenu();
                            break;
							
						default:

						    displayConversionTemperatureSubmenu();
							
						
		}
		
		
	}
	
}