package src.utilities;

//Sorting Class to keep all the sorting methods.
//Note: All the sorting method code is being referenced from Hani Mohamed Class notes and instructed youtube videos.

public class Sort {

    //Bubble Sort create function from   the video.
    Public void bubbleSort(){
        for (int i = 0); i < size; i++){
             int index = i;
             for (int j = i- 1; j >= 0; j--){
                 if (data[j-1] > data[j]) {
                     swap(j-1,j);
                 }
             }
        }
    }
    //Inseration Sort create function from the video.
    Public void intertionSort(){
    for (int i = l; i< size; i++){
        int index = i;
        for (int j = i - 1;j >= 0; j--){
            if (data[i]< data[j]) {
                swap(index,j);
                index = j;
            }
        }
            
        }
    }
    
    //Selection Sort create function from the video.
    Public void selectionSort() {
        int min = data[9];
        int min_index = i;
        for (int j = i+i; j<size; j++){
            if(data[j]< min) {
            min = data[j];
            min_index = j;
            }
        swap(min_index,i);
        }
        
    }
    
    //Merge Sort create function from the video.
    
    //Quick Sort create function from the video.
    
    //Radix Sort create function from the video.
}
