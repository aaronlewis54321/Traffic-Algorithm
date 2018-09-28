<<<<<<< HEAD
import java.util.LinkedList;
public class Path {
    int size;
    int pathDistance;
    double density;
    int totalCars;
    LinkedList<bBox> locations;
    public Path(int psize)
    {
       int bBoxSize = 1000;
       size =  psize / bBoxSize;
       pathDistance = 0;
       totalCars = 0;
       locations = new LinkedList();
       for(int i = 0; i < size; i++)
       {
           locations.add(new bBox(bBoxSize));
           pathDistance += locations.get(i).getDistance();
           totalCars += locations.get(i).numCars();
       }
       density = (double)totalCars / pathDistance;
    }
    
    public boolean addCar(int count)
    {
        return locations.get(0).addCar(count);
    }
    public int getPathDistance()
    {
        return pathDistance;
    }
    public double getAverageSpeed()
    {
        int averageSpeed = 0;
        int count = 1;
        for(bBox b : locations)
        {
            if(b.getAverageSpeed() >0)
            {
                count++;
            }
            averageSpeed += b.getAverageSpeed();
        }
        return averageSpeed/count;
    }
    public double getPathDensity()
    {
        return density;
    }
    public LinkedList<bBox> getLocations()
    {
        return locations;
    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alewis91
 */
public class Path {
    public Path(int size)
    {
        
    }
    
    public boolean isTraffic()
    {
        
    }
    
    public void addCar()
    {
        
    }
}
>>>>>>> 801a1eff6a5df39646c16347819d5f6ef563622a
