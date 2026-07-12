package qa.main;

public class practiseProblems {
    int[] arr = {2, 4, 8, 0, 4, -4, 3};


    public int smallElement() {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        practiseProblems obj = new practiseProblems();
        System.out.println(obj.smallElement());
    }



}
