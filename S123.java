package java2;

public class S123 {

  public static String triangle(int a,int b, int c){
	  
	  	if(a+b<=c || a+c<=b || b+c<=a){
	  		return "�޷�����������";
	  	}       
	  	else if(a == b && a == c && b == c){
            return "�ȱ�������";
        }
        else if(a == b || a == c || b == c){
            return "����������";
        }
        else{
            return "һ��������";
        }
           
        }

}
