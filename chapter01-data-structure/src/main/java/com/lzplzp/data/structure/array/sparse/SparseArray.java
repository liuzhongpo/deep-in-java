package com.lzplzp.data.structure.array.sparse;

/**
 * 稀疏数组，模拟五子棋
 * <p>
 * 0:没棋 1:黑子 2:白子
 */
public class SparseArray {

    public static void main(String[] args) {
        int[][] chessArray = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;

        for (int[] array : chessArray) {
            for (int value : array) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        //转成稀疏数组
        //1.获取原有数组中有效数字个数
        int sum = 0;
        for (int[] array : chessArray) {
            for (int value : array) {
                if (value != 0) {
                    sum++;
                }
            }
        }

        //2.定义
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //3.赋值有效值
        int count = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }

        for (int[] array : sparseArray) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        //稀疏数组转二维数组
        int[][] chessArray2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int[] ints : chessArray2) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

    }
}
