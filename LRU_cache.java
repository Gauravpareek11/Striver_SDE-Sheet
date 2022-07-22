// import java.util.*;
// public class LRUCache
// {
//     ArrayList<Integer>l1;
//     HashMap<Integer,Integer>m1;
//     int x;
//     LRUCache(int capacity)
//     {
//         l1=new ArrayList<>();
//         m1=new HashMap<>();
//         x=capacity;
//         // Write your code here
//     }

//     public int get(int key)
//     {
//         if(m1.containsKey(key)){ 
//             l1.remove((Integer)key);
//             l1.add(key);
//             return m1.get(key);
//         }
//         else return -1;
//         // Write your code here
//     }

//     public void put(int key, int value)
//     {
//         if(l1.contains(key)){
//             l1.remove((Integer)key);
//             l1.add(key);
//             m1.put(key,value);
//         }
//         else if(m1.size()<x){
//             m1.put(key,value);
//             l1.add(key);
//         }
//         else{
//             int a=l1.get(0);
//             m1.remove(a);
//             l1.remove(0);
//             l1.add(key);
//             m1.put(key,value);
//         }
//     }
//         // Write your code here
// }
import java.util.*;
class LRUCache {    
    int capacity;    
    int count;    
    List<Integer> keys;    
    Map<Integer,Integer> map;    
    LRUCache(int capacity)    
    {        
        this.capacity=capacity;        
        this.count=0;        
        keys=new ArrayList<>();        
        map=new HashMap<>();    
    }    
    public  int get(int key)    
    {        
        if(map.get(key)!=null){            
            int x=indexOf(key);            
            keys.remove(x);            
            keys.add(key);            
            return map.get(key);        
        }        
        return -1;    
    }

   public void put(int key, int value)    {        
       if(map.containsKey(key)){            
           map.put(key,value);            
           int x=indexOf(key);            
           keys.remove(x);            
           keys.add(key);        
       }        
       else if(count<capacity){                
           map.put(key,value);                
           keys.add(key);                
           count++;                    
       }        
       else if(count>=capacity){            
           map.remove(keys.get(0));            
           count--;            
           keys.remove(0);            
           map.put(key,value);            
           keys.add(key);            
           count++;        
       }    
   }    
    public int indexOf(int element){        
        for(int i=0;i<keys.size();i++){            
            if(keys.get(i)==element){                
                return i;            
            }        
        }        
        return -1;    
    } 
}  
