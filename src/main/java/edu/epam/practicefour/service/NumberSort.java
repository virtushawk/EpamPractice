package edu.epam.practicefour.service;

import edu.epam.practicefour.entity.NumberArray;

public class NumberSort {

    public void bubbleSort(NumberArray array){
        for (int i = 0; i + 1 < array.size(); i++){
            for (int j = 0; j + 1 < array.size() - i; j++){
                if (array.get(j+1) < array.get(j)){
                    swap(array,j,j + 1);
                }
            }
        }
    }

    public void insertionSort(NumberArray array){
        for (int i = 1; i < array.size(); i++){
            for (int j = i; j > 0 && array.get(j) < array.get(j - 1); j--){
                swap(array,j,j-1);
            }
        }
    }

    public void selectionSort(NumberArray array){
        for (int i = 0; i < array.size(); i++){
            int min = array.get(i);
            int index = i;
            for (int j = i; j < array.size(); j++){
                if(min > array.get(j)){
                    min = array.get(j);
                    index = j;
                }
            }
            swap(array,i,index);
        }
    }

    public void swap(NumberArray array ,int index1, int index2){
        int number1 = array.get(index1);
        int number2 = array.get(index2);
        array.set(index1,number2);
        array.set(index2,number1);
    }

}
