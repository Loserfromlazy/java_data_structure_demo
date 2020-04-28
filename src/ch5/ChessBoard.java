package ch5;

import java.util.Scanner;

/**
 * 棋盘覆盖问题
 * @author  Loserfromlazy
 */
public class ChessBoard {
    private static int[][] board ;
    int tile=0;//表示L型骨牌的编号

    /**
     * 棋盘覆盖函数
     * @param tr 棋盘左上角行号
     * @param tc 棋盘左上角列号
     * @param dr 特殊棋子的行
     * @param dc 特殊棋子列
     * @param size 棋盘大小
     */
    public void chessBoard(int tr,int tc,int dr,int dc,int size){
        if (size==1) return;
        int t=++tile;
        int s = size/2;//每一次将大棋盘化为一半的子棋盘
        //处理左上角棋盘
        if(dr < tr + s && dc< tc + s)//左上角子棋盘有特殊棋子
            chessBoard(tr,tc,dr,dc,s);//递归处理
        else//处理无特殊棋子的左上角子棋盘
        {
            board[tr+s-1][tc+s-1] = t;//设左上角子棋盘的右下角为特殊棋子，用t型的骨牌覆盖。
            chessBoard(tr,tc,tr+s-1,tc+s-1, s);//递归处理
        }
        //处理右上角棋盘
        if(dr < tr+s && dc >=tc+s)//右上角棋盘有特殊棋子
        {
            chessBoard(tr,tc+s,dr,dc,s);//递归处理
        }
        else
        {
            board[tr+s-1][tc+s] =t;//设右上角子棋盘的左下角为特殊棋子，用t型的骨牌覆盖。
            chessBoard(tr,tc+s,tr+s-1,tc+s,s);//递归处理
        }
        //处理左下角棋盘
        if(dr >=tr+s && dc<tc+s)//左下角子棋盘有特殊棋子
        {
            chessBoard(tr+s,tc,dr,dc,s);//递归处理
        }
        else
        {
            board[tr+s][tc+s-1] = t;//设左下角子棋盘的右上角为特殊棋子，用t型的骨牌覆盖。
            chessBoard(tr+s,tc,tr+s,tc+s-1,s);//递归处理
        }
        //处理右下角棋盘
        if(dr>=tr+s&& dc>= tc+s)//右下角棋盘有特殊棋子
        {
            chessBoard(tr+s,tc+s,dr,dc,s);//递归处理
        }
        else
        {
            board[tr+s][tc+s] = t;//设子棋盘右下角的左上角为特殊棋子，用t型的骨牌覆盖。
            chessBoard(tr+s,tc+s,tr+s,tc+s,s);//递归处理
        }
    }

    public static void main(String[] args) {
        ChessBoard c=new ChessBoard();
        Scanner input =new Scanner(System.in);
        System.out.println("请输入棋盘大小,棋盘大小必须是2^k");
        int boardSize=input.nextInt();
        if((boardSize&(boardSize-1))!=0){
            System.out.println("您输入的不是2^k");
            return;
        }
        board=new int[boardSize][boardSize];
        System.out.println("请输入特殊棋子的行的位置");
        System.out.println("从0开始算第一行,第一列");
        int dr=input.nextInt();
        System.out.println("请输入特殊棋子的列的位置");
        int dc=input.nextInt();
        c.chessBoard(0,0,dr,dc,boardSize);
        for (int i = 0; i <boardSize ; i++) {
            for (int j = 0; j <boardSize ; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
