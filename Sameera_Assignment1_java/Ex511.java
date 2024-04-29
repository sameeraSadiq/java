


class Ex511{
    public static void main(String[] args) {
        int a= 3;
        int c=9554;
        int d= 1;
        int e= 10;
        int f= 176;
        if(a<c && a<d && a<e && a<f) {
            System.out.println("the smallest number is "+ a);

        }

        else if (c<a && c<d && c<e && c<f) {
            System.out.println("the smallest number is "+c);
            
        }
        else if (d<a && d<c && d<e && d<f) {
            System.out.println("the samllest number is"+d);

        }
  

         else if (e<a && e<c && e<d && e<f) {
            System.out.println("the smallest number is"+e);
         }

       else {   
        System.out.println("the smallest number is "+f);
       }
        
    }
}