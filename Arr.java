public class Arr {
    public static void main(String[] args) {
        int[] marks = {90, 12, 3, 4, 5, 6, 76, 5};
        int total=0;
        
        for(int i =0; i<marks.length; i++) {
            System.out.println(marks[i]);
            total+=marks[i];
        }
        System.out.println("Total marks: " + total);
    }
}

    

