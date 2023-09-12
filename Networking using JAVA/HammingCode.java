// Java code to implement Hamming Code 


class HammingCode { 
   static void print(int array[])                  // print elements of array 
    { 
        for (int i = 1; i < array.length; i++)
            { 
            System.out.print(array[i]); 
            } 
        System.out.println(); 
    } 
  
    static int[] calculation(int[] array, int r)      // calculating value of redundant bits
    { 
        for(int i = 0; i < r; i++) 
            { 
            int x = (int)Math.pow(2, i); 
            for(int j = 1; j < array.length; j++) 
                { 
                if(((j >> i) & 1) == 1) 
                    { 
                    if (x != j) 
                    array[x] = array[x] ^ array[j]; 
                    } 
            } 
            System.out.println("r" + x + " = " + array[x]); 
        } 
  
        return array; 
    } 
  
    static int[] generateCode(String str, int M, int r) 
    { 
        int[] array = new int[r + M + 1]; 
        int j = 0; 
        for (int i = 1; i < array.length; i++)
	 { 
            if ((Math.ceil(Math.log(i) / Math.log(2)) 
                 - Math.floor(Math.log(i) / Math.log(2))) 
                == 0) 
		{ 
  
                // if i == 2^n for n in (0, 1, 2, .....) 
                // then ar[i]=0 
                // codeword[i] = 0 ---- 
                // redundant bits are intialized 
                // with value 0 
                array[i] = 0; 
            } 
            else { 
  
                array[i] = (int)(str.charAt(j) - '0'); 
                j++; 
            } 
        } 
        return array; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // input message 
        String str = "0101"; 
        int M = str.length(); 
        int r = 1; 
  
        while (Math.pow(2, r) < (M + r + 1)) { 
            // r is number of redundant bits 
            r++; 
        } 
        int[] ar = generateCode(str, M, r); 
  
        System.out.println("Generated hamming code "); 
        ar = calculation(ar, r); 
        print(ar); 
    } 
} 