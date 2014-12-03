package com.nastajus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class App {
	
	static Map<String, String> map = new HashMap<String, String>();
	
	static void read() throws IOException{
		FileReader fr = new FileReader("blooms-verbs.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		String[] parts;
		while ( (line = br.readLine()) != null ){
			//System.out.println(line);
			parts = (line.split(","));
			
			int count = 0;
			for ( String part : parts ){
				count++;
				part = part.trim();
				System.out.println(part);

				if (!map.containsKey(part)) {
                    map.put(part, "yo");
                    if (map.get(part) != null){
                        System.out.println("CHECKING IF PART IS INSIDE: " + map.get(part));
                    }
                    else
                        System.out.println("WAS NULL");
                }

				else if (count % 2 == 0){
					//should exist already, based on assumption file order isn't changing.
					map.putIfAbsent(parts[0], parts[1]);
				}
			}
		}

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
			it.remove(); // avoid problems
		}

        Set set = map.entrySet();
        String target = "apply";
        //if ( set.contains(target) ){      // failed. didn't work
        if ( map.containsKey(target) ){
                System.out.println("target " + target + " found.");
        }
	}

}
