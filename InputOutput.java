import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class InputOutput{

	private static class By implements Comparable<By>{
		
		String navn;	int kunder; int rang;
		
		By(String navn, int kunder){
			this.navn 	= navn;	
			this.kunder	= kunder;
		}
		
		public int compareTo(By by){  
			if(by.rang> rang)				return -1;
			else if(by.rang < rang)		return 1;	
			else								return 0;
		}  
		
	}

	
	
	public static void main(String[] args) throws Exception{
		
			InputStreamReader 	r				=	new InputStreamReader(System.in);    
    		BufferedReader 		br				=	new BufferedReader(r);       		
			BufferedOutputStream os				=	new BufferedOutputStream(System.out);
      	PrintWriter 			w 				=	new PrintWriter(os);  
		
      	StringTokenizer		st;
			
			int antalByer	= Integer.parseInt(br.readLine());
				
			By[]		byObjekter					= new By[antalByer];				
		
			//Læser antallet af kunder pr by ind i et array
			for(int i=0; i < antalByer; i++){				
				st					=	new StringTokenizer(br.readLine());
				byObjekter[i]	=	new By( st.nextToken(), Integer.parseInt(st.nextToken()));
				
			}
		
			//Læser afstande ind i imellem hver by OG beregner rang
			for(int i=0; i < antalByer; i++){
				st	=	new StringTokenizer(br.readLine());

				for(int j=0; j< antalByer; j++){
					int	afstand			=	Integer.parseInt(st.nextToken());
					byObjekter[i].rang	=	byObjekter[i].rang + afstand*byObjekter[j].kunder;
				}				
			}
		
			//Sorterer og Udskriver
			Arrays.sort(byObjekter);
			for(By by : byObjekter)
				w.println(by.navn);
		
			
			w.flush();  
	
			br.close();    
    		r.close();  
			w.close();
			os.close();		
		
	}
	
	
}