package by.mts.brest.java.others;

public class jobAragoz {
    public static void main(String[] args) {
        int jk;
        jk = 0;
        while(jk<10) {
            System.out.print(" while:"+jk);
            jk++;
        }

        System.out.println("  ");
        System.out.println("massivy:");


        int[] nums = new int[4];
// устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        for (int i=0; i<=nums.length-1; i++)
            System.out.print(" " +nums[i]);
        System.out.println(" ");
        System.out.println("Трёхмерный массив");

        int[][][] nums3;
        // int[] numsss = new int[15];
        // int dlina = nums.length;

        nums3 = new int[3][4][9];

        int i1 = nums3.length;
        int i2 = nums3[0].length;
        int i3 = nums3[0][0].length;
        for (int i = 0; i < nums3.length; i++){     // 3
            System.out.println("");
            for(int j=0; j < nums3[i].length; j++){     // 4
                System.out.println("");
                for (int k=0; k < nums3[i][j].length; k++) {   // 9
                    nums3[i][j][k]=k+i+j;
                    System.out.print("NUM3[i][j][k]:"+nums3[i][j][k]);
                    System.out.println(" - i:"+i+" j:"+j+" k:"+k);
                }
            }
        }
    }
}
