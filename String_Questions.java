import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class String_Questions {

    public static void findFrequency_occuranceOfCharacter(String str)
    {
        // int[] count = new int[256];

        // for(int i = 0; i < str.length(); i++)
        // {
        //     count[(int)str.charAt(i)]++;
        // }

        // for(int i = 0; i < count.length; i++)
        // {
        //     if(count[i]!=0)
        //     {
        //     System.out.println((char)i+" "+count[i]);
        //     }
        // }
        /// do hashmap implementation***
        char[] array=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:array)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
            map.put(i,1);
            }
            
        }
        for(Character i:map.keySet())
            System.out.println(i+" "+map.get(i));

    }

    
    private static void removeSpecialCharacters(String string) {
        System.out.println(string.replaceAll("[^a-zA-Z0-9]", ""));

    }
    
        private static void removeWhiteSpaces(String string) {
            // string=string.trim();
            string=string.replaceAll("\\s","");
            // System.out.println("guruprasad".replaceAll("u",""));
            System.out.println(string);
        }
    

    private static void removeDuplicateCharacters(String string) {
        
        StringBuilder sb=new StringBuilder(); // 1 a
        // for(int i=0; i<string.length(); i++) 
        // {
        //     char ch=string.charAt(i);
        //     int index=string.indexOf(ch,i+1); 
        //     if(index==-1)
        //         sb.append(ch);
            
        // }
        // System.out.println(sb);

        // char[] ch = string.toCharArray();  // 2 a
        // for(int i=0; i<ch.length; i++)
        // {
        //     boolean dupl=false;
        //     for(int j=i+1; j<ch.length; j++)
        //     {
        //         if(string.charAt(i)==string.charAt(j))
        //         {
        //             dupl=true;
        //         }
        //     }
        //     if(!dupl)
        //     sb.append(string.charAt(i));
        // }
        // System.out.println(sb);
        
        // use hash set
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i = 0; i < string.length(); i++)
        {
            set.add(string.charAt(i));
        }
        for(Character c:set)
            sb.append(c);
         System.out.println(sb);
    }

    private static void sortString(String string) {
        char[] chars = string.toCharArray();
        // for(int i=0; i<chars.length; i++) 
        // {
        //     for(int j=i+1; j<chars.length; j++) // brute force sorting
        //     {
        //         if(chars[i]>chars[j])
        //         {
        //             char temp=chars[i];
        //             chars[i]=chars[j];
        //             chars[j]=temp;}
        //         }
                
        //     }

        for(int i=0; i<chars.length-1; i++) 
        {
            for(int j=i+1; j>0; j--) // brute force sorting
            {
                if(chars[j-1]>chars[j])
                {
                    char temp=chars[j-1];
                    chars[j-1]=chars[j];
                    chars[j]=temp;}
                else{
                break;
            }
                
            }
        }
        // for(int i=0; i < chars.length-1; i++) 
        // {
        //     for(int j=0; j<chars.length-i-1; j++)
        //     {
        //         if(chars[j]>chars[j+1])
        //         {
        //             char temp=chars[j+1];
        //             chars[j+1]=chars[j];
        //             chars[j]=temp;
        //         }
        //     }
                
        //     }

        for(int i=0; i < chars.length; i++) 
        {
           int last=chars.length-1-i;
           int max=0;
           for(int j=0; j <=last ; j++) // first check for max in whole array
           {
            if(chars[max]<chars[j])
            {
                max=j;
            }
           }
           char temp=chars[max];
           chars[max]=chars[last];
           chars[last]=temp;
            }

        System.out.println(new String(chars));
        // Arrays.sort(chars);

    }
    private static void replaceCharacterWithItsOccurance(String string) {

        // array approach
        // char[] chars = string.toCharArray();
        int cnt=1;
        // char chartoreplace='T';
        // for(int i=0; i<chars.length;i++) {
        //     if(chars[i]==chartoreplace)
        //     {
        //         chars[i]=String.valueOf(cnt).charAt(0);
        //         cnt++;
        //     }
        // }
        // System.out.println(new String(chars));


        char chartoreplace='T';
        for(int i=0; i<string.length();i++) {
            if(string.charAt(i)==chartoreplace)
            {
                string=string.replaceFirst(String.valueOf(chartoreplace),String.valueOf(cnt));
                cnt++;
            }
        }
        System.out.println(new String(string));
        
    }


    
        private static void firstNonrepeatedCharacter(String string) {
            // System.out.println(string.charAt(0)==string.charAt(1));
    
        //  for(int i=0; i<string.length(); i++) {
        //     boolean unique=true;
        //     for(int j=0; j<string.length(); j++) {
        //         if(string.charAt(j)==string.charAt(i) && i!=j)
        //         {
        //             unique=false;
        //             break;
        //         }
        //     }
        //     if(unique){
        //     System.out.println(string.charAt(i));
        //     break;
        //  }
    
            
        //  }
    
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<string.length(); i++){
            if(map.containsKey(string.charAt(i)))
            {
                map.put(string.charAt(i),map.get(string.charAt(i))+1);
            }
            else
            map.put(string.charAt(i),1);
        }
        System.out.println(map);
    
    //    for(HashMap.Entry<Character,Integer> entrySet: map.entrySet())
    //    {
    //     if(entrySet.getValue()==1){
    //         System.out.println(entrySet.getKey());
    //         break;
    //     }
    
    //    }
       
       for(Character key: map.keySet())
       {
        if(map.get(key)==1){
            System.out.println(key);
            break;
        }
    
       }
    }
    
    private static void reverseEachWordInString(String string) {
        String[] strings=string.split(" ");
        String output="";
        // System.out.println("guruprasad".endsWith("ad"));
        // System.out.println("guruprasad".startsWith("gu"));
        // System.out.println("guruprasad".contains("g"));
        for(String word:strings)
        {
            String revWord="";
            for(int i=word.length()-1;i>=0;i--)
            {
                revWord+=word.charAt(i);
            }
            output+=revWord+" ";

        }
        System.out.println(output);
        
    }
    
        private static void longestSubstringWithoutRepeatedCharacter(String string) {
            char[] chars = string.toCharArray();
            String longestSubstring="";
            int lenLongestSubstring = 0;
            LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
           for(int i=0;i<chars.length;i++){
            if(!map.containsKey(chars[i]))
            {
                map.put(chars[i],i);
            }
            else
            {
                i=map.get(chars[i]);
                map.clear();
            }

            if(map.size() > lenLongestSubstring)
            {
                lenLongestSubstring=map.size();
                longestSubstring=map.keySet().toString();
            }
            
           }
           System.out.println(longestSubstring);
           System.out.println(lenLongestSubstring);

        }

    public static void main(String[] args) {
        findFrequency_occuranceOfCharacter("guruprasad");
        //2. removeSpecialCharacters("$ja!va$&st%ar");
        //3.removeWhiteSpaces("  jav va s ta r");
        //4. removeDuplicateCharacters("guruprasad");
        //5. sortString("rock");
        //6. replaceCharacterWithItsOccurance("OPENTEXT");
        // System.out.println("bUru".compareToIgnoreCase("auru"));
        // System.out.println("aUru".compareTo("buru"));
        //7. firstNonrepeatedCharacter("AABCDBE");
        //8.reverseEachWordInString("java code");
        // longestSubstringWithoutRepeatedCharacter("java");
        

    }




}

 
