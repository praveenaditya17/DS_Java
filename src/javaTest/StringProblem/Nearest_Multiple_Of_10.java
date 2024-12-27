package javaTest.StringProblem;



class Nearest_Multiple_Of_10 {
	
	public static void main(String args[]) {
		
		Nearest_Multiple_Of_10 obj = new Nearest_Multiple_Of_10();
		
		String res=obj.roundToNearest("39999");
		System.out.println(res);
	}

    String roundToNearest(String str) {
        
        int l=str.length();
        if(l==1){
            return 10+"";
        }
        
        char ch=str.charAt(l-1);
        int i= ch-'0';
        
        if(i==0){
            return str;
        }
        
        
        char[] chA = str.toCharArray();
        
        if(i<=5){
            chA[l-1]='0';
            return String.valueOf(chA);
        }else{
            chA[l-1]='0';
            int carry=1;
            
            for(int j=l-2;j>=0;j--){
                int key=chA[j]-'0';
                int key2 = key+carry;
                int temp=(key2%10);
                chA[j]=(char)(temp+'0');
                carry=key2/10;
                if(carry==0)
                    break;
            }
            return String.valueOf(chA);
        }
        
    }
}
