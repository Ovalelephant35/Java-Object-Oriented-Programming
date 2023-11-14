public class ArrayPrac {
    public static void main(String[] args){
        //1-D array
        int nums[] = {1,2,3,4};
        System.out.println(nums[3]);
        int num[] = new int[5];
        num[3]=nums[1];
        System.out.println(num[3]);
        System.out.println();
        System.out.println();
        //2-D array
        int numb[][] = new int[3][5];
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<5 ; j++){
                numb[i][j] = (int)((Math.random()*6));
            }
        }
        for(int n[] : numb){
            for(int j : n){
                System.out.print(j+" " );   
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        //Jagged 2-d array
        int jag[][] = new int[3][];
        jag[0] = new int[5];
        jag[1] = new int[3];
        jag[2] = new int[2];
        for(int i=0 ; i<jag.length ; i++){
            for(int j=0 ; j<jag[i].length ; j++){
                jag[i][j] = (int)((Math.random()*6));
            }
        }
        for(int n[] : jag){
            for(int j : n){
                System.out.print(j+" " );   
            }
            System.out.println();
        }
        //Further we can have 3-D Array
    }
}
