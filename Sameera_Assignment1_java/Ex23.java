
class Ex23{
    public static void main(String[] args) {
        int a= 3;
        int c=4;
        int d= 32;
        int e= 100;
        int f= 11;
        if(a>c && a>d && a>e && a>f) {
            System.out.println("the greatest number is "+ a);

        }

        else if (c>a && c>d && c>e && c>f) {
            System.out.println("the greatstest number is "+c);
            
        }
        else if (d>a && d>c && d>e && d>f) {
            System.out.println("the greatstest number is"+d);

        }
  

         else if (e>a && e>c && e>d && e>f) {
            System.out.println("the greatstest number is"+e);
         }

       else {   
        System.out.println("the greatstest number is "+f);
       }
        
    }
}