public class Largest {
	public Largest() {
    }
    
    public int largest(int[] list){
        int index;
        int max =list[0];
        for (index = 0; index < list.length-1; index++){
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }
    
    void display(int max) {
        System.out.println("Largest number is : " + max);
       
        System.out.println('\n');
    }

}

