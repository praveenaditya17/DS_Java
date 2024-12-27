package javaTest.StringProblem;

public class RemoveAdjecentOfString {

	public static void main(String args[]) {
		RemoveAdjecentOfString obj = new RemoveAdjecentOfString();
		String res=obj.rremove("abccbd");
		System.out.print(res);
	}
	
    public String rremove(String s) {
        // code here
    	int n=s.length();
        StringBuffer temp=new StringBuffer();
        if(s.length()<=1){
            return s;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                    i++;
                }
            }
            else{
                temp.append(s.charAt(i));
            }
        }
       
       
            if(s.charAt(n-1)!=s.charAt(n-2)){
               temp.append(s.charAt(n-1));
            }
        
        if(temp.toString().equals(s)){
            return temp.toString();
        }
        return rremove(temp.toString());
    
    }
}
