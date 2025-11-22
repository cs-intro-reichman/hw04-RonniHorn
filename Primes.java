public class Primes {
    public static void main(String[] args) {
        int primes = Integer.parseInt(args[0]);
        boolean[] nums = new boolean[primes];
        nums[0] = false;
        nums[1] = false;
        for(int i = 2; i<primes; i++)
        {
            nums[i] = true;
        }
        int j = 2;
        while(j<Math.sqrt(primes))
        {
            for(int i = 2; primes>(i*j); i++)
            {
                if(nums[i*j] == true){
                    nums[i*j] = false;
                }
                    
            }
            j++;
        }
        System.out.println("Prime numbers up to " + primes +":");
        int count = 0;
        for(int i = 0; i<primes; i++)
        {
            if(nums[i] == true){
                System.out.println(i);
                count++;
            }
        }

        //There are 10 primes between 2 and 30 (33% are primes) 
        int percent = (int)(double)(((double)count/(double)primes)*100);

        System.out.println("There are " + count + " primes between 2 and " + primes + "(" + percent + "% are primes)");
    }
}