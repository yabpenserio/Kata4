/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author yabpe
 */
public class EmailDomainLoader implements Loader{
    private final Loader loader;

    public EmailDomainLoader(Loader loader) {
        this.loader = loader;
    }
    @Override
    public List<String> load() {
        /*List<String> result = new ArrayList<>();
        List<String> source = loader.load();
        for (String line :source) {
            result.add(line.substring(line.indexOf('@')+1));
            
        }
        return result;*/
        return loader.load().stream().map(line->line.substring(line.indexOf('.')+1)).collect(toList());
    }
    
}
