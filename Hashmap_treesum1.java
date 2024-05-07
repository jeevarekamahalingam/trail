import java.util.*;
public class Hashmap_treesum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        HashMap<Integer,List<Integer>> mp=new HashMap<Integer,List<Integer>>();
        for(int i=0;i<n-1;i++){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if (mp.containsKey(p))
            {List<Integer> u=new ArrayList<Integer>();
                u=mp.get(p);
                u.add(q);
                mp.put(p,u);
            }
            else{
                List<Integer> li=new ArrayList<Integer>();
                li.add(q);
                //List<List<Integer>> li=new List<List<Integer>;
                //li.add(l1);
                mp.put(p,li);
            }
        }
        for(Integer k:mp.keySet()){
            List<Integer> L=new ArrayList<>();

            L=mp.get(k);
            for(int i=0;i<L.size();i++){
                for(Integer m:mp.keySet()){
                    if(mp.containsKey(L.get(i)))
                        List<Integer> zi=new ArrayList<Integer>();
                        zi=mp.get(k).addAll(mp.get(L.get(i)));
                        mp.put(k,zi);
                }
            }
        }
        int count=0;
        for(Integer N:mp.keySet()){
            List<Integer> l1=mp.get(k);
            for(int i=0;i<l1.size();i++){
                if (Math.abs(l1.get(i)-N)<=x){
                    count++;
                }
            }  
}
    System.out.println(count);
}}
