//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String sentences[] = new String[n];
            int times[] = new int[n];
            for(int i = 0; i < n; i++){
                sentences[i] = sc.nextLine();
                times[i] = sc.nextInt();
            }
            AutoCompleteSystem obj = new AutoCompleteSystem(sentences, times);
            int q = sc.nextInt();
            for(int i = 0; i < q; i++){
                String query = sc.nextLine();
                StringBuilder qq = new StringBuilder();
                for(int j = 0; j < query.length(); j++){
                    char x = query.charAt(j);
                    qq.append(String.valueOf(x));
                    ArrayList<String> suggestions = obj.input(x);
                    if(x == '#')
                        continue;
                    out.print("Typed : \"" + qq.toString() + "\" , Suggestions: \n");
                    for(String y : suggestions)
                        out.print(y + "\n");
                }
            }
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java




//User function Template for Java

class Check{
    String sentence;
    Integer times;
    
    Check(String sentence,int times){
        this.sentence=sentence;
        this.times=times;
    }
}

class AutoCompleteSystem{
    
        HashMap<String,Integer> map = new HashMap<>();
        String currentValue = "";
    public AutoCompleteSystem(String sentences[], int times[]){

        for(int i=0;i < sentences.length;i++){
            map.put(sentences[i],times[i]);
        }

    }

    ArrayList<String> input(char c){
        List<String> result = new ArrayList<>();
        
        if(c == '#'){
            map.put(currentValue,map.getOrDefault(currentValue,0)+1);
            currentValue="";
        }else{
            currentValue += c;
            List<Check> check = new ArrayList<>();
            
            for(String key:map.keySet()){
                if(key.startsWith(currentValue)){
                    check.add(new Check(key,map.get(key)));
                }
            }
            
            Collections.sort(check, (a,b) -> {
                if(a.times.equals(b.times)){
                    return a.sentence.compareTo(b.sentence);
                }else{
                    return b.times.compareTo(a.times);
                }
            });
            
            for(int i=0; i<Math.min(3,check.size());i++){
                result.add(check.get(i).sentence);
            }
        }
        return new ArrayList<>(result);
    }
}