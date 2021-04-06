/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ancient_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class Ancient_problem {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a[]=new int[100000];
         StringTokenizer tk=new StringTokenizer(br.readLine());
           int N=Integer.parseInt(tk.nextToken());
           int Q=Integer.parseInt(tk.nextToken());
           HashMap <Integer,Integer> map=new HashMap<>();
           int c=0,d=0;
            StringTokenizer tr=new StringTokenizer(br.readLine());
for(int i=0;i<N;i++)
{
    map.clear();
            
             
           a[i]=Integer.parseInt(tr.nextToken());
}
            

for(int i=0;i<Q;i++)
{
    map.clear();
    c=0;

    
                        StringTokenizer tu=new StringTokenizer(br.readLine());

              int D=Integer.parseInt(tu.nextToken());
              int K=Integer.parseInt(tu.nextToken());
              int L=Integer.parseInt(tu.nextToken());
              int R=Integer.parseInt(tu.nextToken());

           for(int j=0;j<N;j++)
            {
              if(j>=L-1&& j<=R-1)
                    map.put(a[j],j+1);
              else 
                     d++;
                       }
             for(Integer key :map.keySet())
    
             {
             if( map.containsKey(D))
             {
                 c++;
                 
             } else {
                 d++;
             }
             
             }
           if(c>1){
               System.out.println(map.get(K));
           }
           else
           {                
               System.out.println("-1");
           }
          

}
           




        // TODO code application logic here
    }
    
}
