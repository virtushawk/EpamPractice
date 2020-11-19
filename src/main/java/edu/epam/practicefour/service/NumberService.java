package edu.epam.practicefour.service;

import edu.epam.practicefour.entity.NumberArray;

public class NumberService {

    public int binarySearch(NumberArray array,int key, int low ,int high){
        int index = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(array.get(mid) < key){
                low = mid + 1;
            } else if (array.get(mid) > key) {
                high = mid - 1;
            } else if(array.get(mid) == key){
                index = mid;
                break;
            }
        }
        return index;
    }

    public int binarySearch(NumberArray array, int key){
        return binarySearch(array,key,0,array.size()-1);
    }

    public int max(NumberArray array){
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++){
            if (max < array.get(i)){
                max = array.get(i);
            }
        }
        return max;
    }

    public int min(NumberArray array){
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++){
            if (min > array.get(i)){
                min = array.get(i);
            }
        }
        return min;
    }

    public NumberArray allPrimeNumbers(NumberArray array){
        NumberArray primeNumbers = new NumberArray();
        for (int i = 0; i < array.size(); i++){
            if(isPrime(array.get(i))){
                primeNumbers.add(array.get(i));
            }
        }
        return primeNumbers;
    }

    public boolean isPrime(int number){
        boolean flag = true;
        for (int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isFibonacci(int number){
        boolean flag = false;
        if (Math.sqrt(5 * (number * number) - 4) % 1 == 0 || Math.sqrt(5 * (number * number) + 4) % 1 == 0){
            flag = true;
        }
        return flag;
    }

    public NumberArray allFibonacciNumbers(NumberArray array){
        NumberArray fibonacciNumber = new NumberArray();
        for (int i = 0; i < array.size(); i++){
            if(isFibonacci(array.get(i))){
                fibonacciNumber.add(array.get(i));
            }
        }
        return fibonacciNumber;
    }

    public boolean isHasNoSameDigits(int number){
        boolean flag = true;
        int [] array = new int[10];
        while(number > 0) {
            int digit = number % 10;
            if(array[digit] > 0){
                flag = false;
                break;
            }
            array[digit]++;
            number = number / 10;
        }
        return flag;
    }
    public NumberArray allNumbersWithUniqueDigits(NumberArray array){
        NumberArray uniqueNumbers = new NumberArray();
        for (int i = 0; i < array.size(); i++){
            if(isHasNoSameDigits(array.get(i))){
                uniqueNumbers.add(array.get(i));
            }
        }
        return uniqueNumbers;
    }

}
