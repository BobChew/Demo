import java.util.*;  
import java.util.Map.Entry;
import java.io.*;

public class Ex5 {
	//Insert each word with frequency to Map
	public Map<String, Integer> count(String filename){
		Map<String,Integer> map = new HashMap<String, Integer>();
		try {
			System.out.println(filename);
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String s;
            StringBuffer sb = new StringBuffer();
            
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            
            StringTokenizer st = new StringTokenizer(sb.toString(),",.! \n");
            while (st.hasMoreTokens()) {
                String letter = st.nextToken();
                int count;
                if (map.get(letter) == null) {
                    count = 1;
                } else {
                    count = map.get(letter).intValue() + 1;
                }
                map.put(letter,count);
            }
		 } catch (FileNotFoundException e) {
	            System.out.println("Can't find the file!");
	        } catch (IOException e) {
	            System.out.println("Reading error!");
	        }
		return map;
	}
	
	//Sort the Map and find all common words
	public void compare(Map<String,Integer> map1, Map<String,Integer> map2, String result){	
		Map<String,Integer> results = new HashMap<String, Integer>();
		Set<Entry<String, Integer>> set1 = map1.entrySet();
		Set<Entry<String, Integer>> set2 = map2.entrySet();
		for(Entry<String, Integer> entry : set1)
		{
			String val1= entry.getKey();
			int frequency=entry.getValue();
			for(Entry<String, Integer> entry2 : set2){
				String val2= entry2.getKey();
				int frequentcy2=entry2.getValue();
				if(val1.compareTo(val2)==0)
					{frequency+=frequentcy2;
				results.put(val1, frequency);}
		}
		}
		List<Map.Entry<String,Integer>> list3 = new ArrayList<Map.Entry<String,Integer>>(results.entrySet());
		Collections.sort(list3,new Comparator<Map.Entry<String,Integer>>() {
  
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }

        });
		 try {
			   File f = new File(result);
			   if(f.exists()){
			    System.out.print("File exists!\n");
			   }else{
			    System.out.print("File doesn't exist!");
			    f.createNewFile();
			   }
			   BufferedWriter output = new BufferedWriter(new FileWriter(f));
			   for(int i=0; i<list3.size();i++)
				{
					Map.Entry<String,Integer> en1=list3.get(i);
					String key1 = en1.getKey();
					int value1=en1.getValue();
					System.out.println("Word '"+key1+"' appears in both paragraphs "+value1+" times.");
					output.write(key1+" "+value1+"\n");
				}
			   
			   output.close();
			  } catch (Exception e) {
			   e.printStackTrace();
		}	  
	}
		
	public static void main(String[] args)
	{
		String filename1="src/paragraph1.txt";
		String filename2="src/paragraph2.txt";
		String result="src/result.txt";
		Map<String,Integer> map1 = new HashMap<String, Integer>();
		Map<String,Integer> map2 = new HashMap<String, Integer>();
		Ex5 test = new Ex5();
		map1=test.count(filename1);
		map2=test.count(filename2);
		
		test.compare(map1, map2, result);	
	}
}
