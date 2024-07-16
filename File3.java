
//Datatype[][] ArrayReferenceVariable;
//Datatype [][]ArrayReferenceVariable;
//Datatype ArrayReferenceVariable[][];
//Datatype []ArrayReferenceVariable[];
//int[][] Arr = new int[3][3];
//Arr[0][0] = 1;Arr[0][1] = 2;Arr[0][2] = 3;Arr[1][0] = 4;Arr[1][1] = 5;Arr[1][2] = 6;Arr[2][0] = 7;Arr[2][1] = 8;Arr[2][2] = 9;
class File3 {
    public static void main(String[] args){
        int Arr[][] = {{1,2,3},{2,4,5},{5,5,1}};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}





