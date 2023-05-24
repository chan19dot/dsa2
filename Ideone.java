/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/*
A pizza delivery business has only one vehicle and one driver.
The availability of the both of them are given as array of Availability objects.
Availability object contains startTime of the day in HHMM and duration in minutes that resource is available.
There will be no overlaps in the Availability blocks with in a resource availability array
and availabilities are sorted in the ascending order of startTime.

You need to implement the method CombinedAvailability which returns an availability array
 with slots when both Driver and Vehicle are available
*/
class Ideone
{
    public static void main(String[] args)
    {
        /** Modify data for different test cses **/
        Availability[] DriverAvailability = {new Availability(630, 50), new Availability(815, 120)}; //diver 8:15 - 10:15
        Availability[] VehicleAvailability = {new Availability(645, 30), new Availability(745, 120) // 7:45-9:45
                , new Availability(1200, 45)};
        System.out.println("Driver Availability");
        WriteAvailability(DriverAvailability);
        System.out.println("Vehicle Availability");
        WriteAvailability(VehicleAvailability);

        Availability[] availability = CombinedAvailability(DriverAvailability, VehicleAvailability);

        System.out.println("Combined Availability");
        WriteAvailability(availability);
    }

    /** Provide implementation **/
    private static Availability[] CombinedAvailability(Availability[] Driver,
                                                       Availability[] Vehicle) {
        //for each driver availability time check if vehicle is present and inside the timeline
        List<Availability> result = new ArrayList<>();
        HashSet<Availability> setResult = new HashSet<>();
        for(Availability driver: Driver){
            for(Availability vehicle: Vehicle) {
                int driverTotalTime = adjustTime(driver.StartTime, driver.Duration);
                int vehicleTotalTime = adjustTime(vehicle.StartTime ,vehicle.Duration);
                System.out.println(driverTotalTime);
                System.out.println(vehicleTotalTime);
                if ((((driverTotalTime) > (vehicle.StartTime))&& (vehicleTotalTime < (driverTotalTime)))){
                          int startTime = driver.StartTime>vehicle.StartTime?driver.StartTime :vehicle.StartTime;
                          int duration= driver.Duration<vehicle.Duration?driver.Duration:vehicle.Duration;
                              result.add(new Availability(startTime,duration));
                              break;

                }
            }
        }

        //if yes append into availability list;

        //time-
        Availability[] res = new Availability[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]= result.get(i);
//            System.out.print(i);
        }



        return res;
    }

    static int adjustTime(int time, int duration){
        if(time%100 + duration >=60 ){ //645,40
            time+=100; //735+45->820 | 835 | -15
            int extraTime = (time+duration)%100 -60-(time%100);
            time +=extraTime;
            return  time;
        }
        return  time+ duration;

    }

    private static void WriteAvailability(Availability[] availbilities) {
        for (Availability availability: availbilities) {
            System.out.print(availability+ " ");
        }
        System.out.println();
    }

    static     class Availability
    {
        public int StartTime;
        public int Duration;

        public Availability(int startTime, int duration) {
            StartTime = startTime;
            Duration = duration;
        }

        public String toString() {
            return "(StartTime: " + StartTime + ", Duration: " + Duration + ")";
        }
    }


}

