public class LakeMaking{
    int[][] data;
    
    public void loadData(String s){
        String a = "";
	int i = 0;
	while (i < s.length()){
	    if ((s.substring(i,i+1)) != " "){
		a += s.substring(i,i+1);
	    }else{
		break;
	    }
	    i++;
	}
	int r = Integer.parseInt(a);
	String b = "";
	while (i < s.length()){
	    if ((s.substring(i,i+1)) != " "){
		b += s.substring(i,i+1);
	    }else{
		break;
	    }
	    i++;
	}
	int c = Integer.parseInt(b);
	data = new int[r][c];
	for (int i = 0; i < s.length(); i++){
	    
    }    
    
    public static void main(String[]args){

    }
}
