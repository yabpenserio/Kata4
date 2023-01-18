/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yabpe
 */
public class FileLoader implements Loader{
    private final File file;
    @Override
    public List<String> load() {
           List<String> result = new ArrayList<>();
           try{
              BufferedReader reader = new BufferedReader(new FileReader(file));
              while(true){
                  String line = reader.readLine();
                  if (line == null) break;
                  result.add(line);
              }
           }catch(IOException exception){
           }
        return result;
    }

    public FileLoader(File file) {
        this.file = file;
    }
    
}
