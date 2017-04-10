package com.company;


// Brute force algorithm for finding 4 or less squares of a positive integer.
// certain integers will have three squares as per Legendres Three Square Theorem.
// Any integer will have four or less as per Legranges Four Square Theorem.
// Some integers have two squares.
// see Rabin and Shallit algorithm for possibly faster computation.
// http://math.stackexchange.com/questions/483101/rabin-and-shallit-algorithm

public class FourSquares{

    public static void main(String[] args){

        int N = 30;
        compute(N);
    }


    public static void compute(int N){
        double max = Math.sqrt(N);

        loop:
        for(int i=0;i<=max;i++){
            for(int j=0;j<=max;j++){
                for(int k=0;k<=max;k++){
                    for(int l=0;l<=max;l++){
                        if(i*i+j*j+k*k+l*l==N){
                            System.out.println("roots are:" +"\n"
                                + "i: "+ i+"\n"
                                + "j: "+ j+"\n"
                                + "k: "+ k+"\n"
                                + "l: "+ l
                            );
                            break loop;
                        }

                    }
                }
            }
        }

    }

}
