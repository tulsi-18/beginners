 import java.util.*;

 class helloworld{
    public static void main(String args[]){
    System.out.println("hello world");
}
}
//input and output
class student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         String age=sc.nextLine();
        System.out.println(age);
    }
}

//loops for loop
class forloops{
    public static void main(String[] args){
        for(int counter=1;counter<=3;counter++){
            System.out.println(counter); //if we write counter in sout it will print numbers
        }
    }
}

//while
class whileloop{
    public static void main(String args[]){    // syntax 
        int i=0;                               // fisrt initialise
        while(i<10){                           // write while(condition){}
          System.out.println(i);               //print 
          i++;                                  // increment
        }
    }
}

//doWhile
class dowhile{
    public static void main(String args[]){
        int i=0;
        do{
             System.out.println(i);
             i++;
        }while(i<10);
    }
}

//difference between while and dowhile dowhile will execute atleast once if the condition is false
class differenceBetweenloops{
    public static void main(String args[]){
        int i=11;
        // while(i<10){
        //     System.out.println(i);
        //     i++;
        // }

    do{
        System.out.println(i);
        i++;
    }while(i<10);
    }
}

//sum of fisrt n natural numbers
class Sumnatural{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
         while(i<=n){
             sum=sum+i;
             i++;
         }
    System.out.println(sum);
}
}

//print the table of a number input by a user
class table{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number*i);
        }
        
    }
}
//print all even numbers till n
class printeven{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=2;i<=number;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

//print odd numbers till n
class printodd{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
        if(i%2==1)
        System.out.println(i);
    }

    }
}
//choose which is even and odd between two numbers
class chooseEvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%2==0 && b%2==0){
         System.out.println("a and b are even");
        }else if(a%2==1 && b%2==1){
            System.out.println("a and b are odd");
        }else if(a%2==1 && b%2==0){
            System.out.println("a is odd and b is even");
        }else if(a%2==0 && b%2==1 ){
            System.out.println("a is even and b is odd");
        }

    }
}
//Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//If they enter 0 then stop.
//If he/ she scores :
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
	//Because marks don’t matter but our effort does.

class homework{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int input;
            do{
                int marks=sc.nextInt();
                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid");
                }
                System.out.println("Want to continue ? (yes(1) or no(0))");
                input = sc.nextInt();
     
            }while(input == 1);

                }
            }
        


class vehicle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String carName=sc.nextLine();
        System.out.println(carName);
    }
}

class Numbers{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i<=10;i++){
            System.out.println(i);
        }
        if(n>10){
            System.out.println("invalid number");
        }
    }
}

class evenNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for( i=a;i<=b;i++){
        
        if(i%2==0){
            System.out.println(i+" ");
        }

        
    }
}
}

class oddNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<=a;i++){
            if(i%2 !=0){
                System.out.print(i+" ");
            }
        }
    }
}


class naturalNUm{
    public static void main(String args[]){
        int a=100;
        for(int i=1;i<=a;i++){
            System.out.print(i+" ");
        }
    }
}

class primeNum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        boolean result=false;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                result=true;
                break;
            }

        }
        
        if(!result)
            System.out.println(number+" "+ "prime ");
        else
            System.out.println(number + " is not a prime number.");
        
    }
}

class primenumber{
    public static void main(String args[]){
        int num=8;  // condition for prime is it should not be divisible by other numbers
        int temp=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                temp=temp+1;
            }
            if(temp==0){
                System.out.println(num+" "+"prime");
                break;
            }
            else{
                System.out.println("not prime");
                break;
            }
        }
    }
}



class homeworkprime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
            if(temp==0){
            System.out.println("prime");
            break;
            }else
            System.out.println("not prime");
            break;
        }
    }
}


class countPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }if(temp==0){
                System.out.println(i);
            }
        }
    }
}