package edu.epam.seventhtask.service;

import edu.epam.seventhtask.entity.CoordPoint;

public class CoordPointService {

    public int compareByLengthDown(CoordPoint point1, CoordPoint point2){
        double firstLength = point1.getLength();
        double secondLength = point2.getLength();
        int flag;
        if(firstLength - secondLength == 0){
            flag = 0;
        }
        else if (firstLength - secondLength < 0){
            flag = 1;
        }
        else{
            flag = 2;
        }
        return flag;
    }
}
