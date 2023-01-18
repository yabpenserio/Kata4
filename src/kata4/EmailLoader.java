/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author yabpe
 */

public class EmailLoader implements Loader {
    private final Loader loader;
    private static final Pattern emailPattern = Pattern.compile("^[\\w-\\.].+@([\\w-]+\\.)+[\\w-]{2,4}$");
    public EmailLoader(Loader loader) {
        this.loader = loader;
    }
    
       
    @Override
    public List<String> load() {
           /* List<String> result = new ArrayList();
            List<String> source = loader.load();
            for (String line : source) {
                if(isEmail(line)){
                    result.add(line);
                }
            
            }
           return result;*/           
           return loader.load().stream().filter(line->isEmail(line)).collect(toList());
    }
    private boolean isEmail(String line){
        return emailPattern.matcher(line).matches();
        
    }
    
}
