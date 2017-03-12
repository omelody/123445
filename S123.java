package java2;

public class S123 {

  public static String triangle(int a,int b, int c){
	  
	  	if(a+b<=c || a+c<=b || b+c<=a){
	  		return "无法构成三角形";
	  	}       
	  	else if(a == b && a == c && b == c){
            return "等边三角形";
        }
        else if(a == b || a == c || b == c){
            return "等腰三角形";
        }
        else{
            return "一般三角形";
        }
           
        }

}
