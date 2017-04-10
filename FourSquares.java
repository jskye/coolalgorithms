package com.company;


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
