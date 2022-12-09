public class Calculation {

    //sum
    public int SumOfSeries(int start, int end, int incr){
        int sum = 0;
        for(int i = start ; i <= end ; i = i + incr)
        {
            sum += i;
        }
        return sum;
    }

    public int SumOfArray(int data[], int size){
        int sum = 0;
        for(int i = 0 ; i < size ; i++)
        {
            sum += data[i];
        }
        return sum;
    }
    
    //product
    public int ProductOfSeries(int start, int end, int incr){
        int product = 1;
        for(int i = start ; i <= end ; i = i + incr)
        {
            product *= i;
        }
        return product;
    }
    
    public int ProductOfArray(int data[], int size){
        int product = 1;
        for(int i = 0 ; i < size ; i++)
        {
            product *= data[i];
        }
        return product;
    }    
}