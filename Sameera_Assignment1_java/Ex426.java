
// IT give's me 10 row and 10 column
//1 column is open right side and 1 column open lift side.


public class Ex426 {
        public static void main(String[] args) {
                int row = 10;
        
          while (row >= 1) {
                   int column = 1;
        
                   while (column <= 10) {
                  System.out.print(row % 2 == 1 ? "<" : ">");
                    ++column;
                  }
    
                  --row;
                  System.out.println();
              }
            }
         
}
