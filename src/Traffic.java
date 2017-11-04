/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alewis91
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Traffic {
    static ArrayList<Path> paths;
    static ArrayList aSubPaths;
    static ArrayList bSubPaths;
    static ArrayList cSubPaths;
    static ArrayList dSubPaths;
    public static void main(String[] args)
    {
        paths = new ArrayList();
        aSubPaths = new ArrayList();
        bSubPaths = new ArrayList();
        cSubPaths = new ArrayList();
        dSubPaths = new ArrayList();
        
        initializePaths();
        
        int algorithm = 1;
        
        int average1 = run(algorithm);
        
        algorithm = 2;
        
        int average2 = run (algorithm);
        
        
       
        
    }
    public static int run(int alg)
    {
       int minTraffic = findIndexOfMinTraffic(); 
       if (paths.get(minTraffic).isTraffic())
       {
           if(alg == 1)
           {
              algorithm1(paths); 
           }
           else if(alg == 2)
           {
               algorithm2(paths);
           }
       }
       else
       {
           paths.get(minTraffic).addCar();
       }
    }
    
    public static int findIndexOfMinTraffic()
    {
        
    }
    
    public static void algorithm1(ArrayList<Path> currentPaths)
    {
        
    }
    
    public static void algorithm2(ArrayList<Path> currentPaths)
    {
        
    }
    
    public static void initializePaths()
    {
        paths.add(new Path(10));
        paths.add(new Path(10));
        paths.add(new Path(10));
        paths.add(new Path(10));
        
        aSubPaths.add(new Path(10));
        aSubPaths.add(new Path(10));
        aSubPaths.add(new Path(10));
        aSubPaths.add(new Path(10));
        
        bSubPaths.add(new Path(10));
        bSubPaths.add(new Path(10));
        bSubPaths.add(new Path(10));
        bSubPaths.add(new Path(10));
        
        cSubPaths.add(new Path(10));
        cSubPaths.add(new Path(10));
        cSubPaths.add(new Path(10));
        cSubPaths.add(new Path(10));
        
        dSubPaths.add(new Path(10));
        dSubPaths.add(new Path(10));
        dSubPaths.add(new Path(10));
        dSubPaths.add(new Path(10));
    }
}
