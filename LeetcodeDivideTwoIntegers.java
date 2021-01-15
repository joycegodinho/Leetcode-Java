public class LeetcodeDivideTwoIntegers {

    public static void main(String[] args){
        int dividend = 10;
        int divisor = 3;
        LeetcodeDivideTwoIntegers s = new LeetcodeDivideTwoIntegers();
        int result = s.divide(dividend, divisor);
        System.out.println("TESTE");
        System.out.println(result);

    }
    

    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        else{
            long divid = Math.abs((long)dividend);
            long div = Math.abs((long)divisor);
            int cont = 0;
            int sign = 1;

            if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
                sign = -1;
            }

            while(divid >= div){
                long temp = div;
                int cont2 = 1;
                while (divid >= temp){
                    divid = divid - temp;
                    cont = cont + cont2;
                    temp = temp + temp;
                    cont2 = cont2 + cont2 ;                   
                }
            }
            return sign * cont; 
        }
   
    }
    
}