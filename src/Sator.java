
public class Sator {
    
    public static void main(String[] args) throws Exception {
       
        int jumpLine = 0;
        String satorSquare[]={"S","A","T","O","R",
                              "A","R","E","P","O",
                              "T","E","N","E","T",
                              "O","P","E","R","A",
                              "R","O","T","A","S"
                            };

        for(int i = 0; i < 25; i++){

            System.out.print(satorSquare[i]);
            jumpLine++;

            if(jumpLine == 5 || jumpLine == 10 || jumpLine == 15 || jumpLine == 20)
            {
                System.out.print("\n");
            }
            Thread.sleep(1000);
        }
            
    }
    
}

