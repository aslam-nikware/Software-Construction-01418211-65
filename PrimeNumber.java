

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter number : ");
    int number = sc.nextInt();

    boolean isPrime = true;

    if(number <=1 ){isPrime = false;}
    for (int i = 2; i <= Math.sqrt(number);i++) {
        if (number%i==0){
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        System.out.println(number + " is PrimeNumber");
    }else {
        System.out.println(number + " is not PrimeNumber");
    }
}
