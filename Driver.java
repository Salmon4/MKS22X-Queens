public class Driver{
  public static void main(String[] args){
    QueenBoard board0 = new QueenBoard(1);
    QueenBoard board1 = new QueenBoard(3);
    QueenBoard board2 = new QueenBoard(4);
    QueenBoard board3 = new QueenBoard(8);
    QueenBoard board4 = new QueenBoard(10);
    QueenBoard board5 = new QueenBoard(0);
    try{
    System.out.println("1 by 1 board");
    System.out.println(board0.toString());
    /**
    System.out.println("Solving 1 by 1 board");
    System.out.println(board0.solve());
    System.out.println(board0.toString());
    **/
    System.out.println("Counting the solutions");
    System.out.println(board0.countSolutions());

    System.out.println("");

    System.out.println("3 by 3 board");
    System.out.println(board1.toString());
    /**
    System.out.println("Solving 3 by 3 board");
    System.out.println(board1.solve());
    System.out.println(board1.toString());
    **/
    System.out.println("Counting the solutions");
    System.out.println(board1.countSolutions());

    System.out.println("");

    System.out.println("4 by 4 board");
    System.out.println(board2.toString());
    /**
    System.out.println("Solving 4 by 4 board");
    System.out.println(board2.solve());
    System.out.println(board2.toString());
    **/
    System.out.println("Counting the solutions");
    System.out.println(board2.countSolutions());

    System.out.println("");

    System.out.println("8 by 8 board");
    System.out.println(board3.toString());
    /*
    System.out.println("Solving 8 by 8 board");
    System.out.println(board3.solve());
    System.out.println(board3.toString());
    **/
    System.out.println("Counting the solutions");
    System.out.println(board3.countSolutions());
    System.out.println(board3.toString());
    System.out.println("");

    System.out.println("10 by 10 board");
    System.out.println(board4.toString());
    /**
    System.out.println("Solving 10 by 10 board");
    System.out.println(board4.solve());
    System.out.println(board4.toString());
    **/
    System.out.println("Counting the solutions");
    System.out.println(board4.countSolutions());

    System.out.println("");

    System.out.println("0 by 0 board");
    System.out.println(board5.toString());
    //System.out.println("Solving 0 by 0 board");
    //System.out.println(board5.solve());
    //System.out.println(board5.toString());
    System.out.println("Counting the solutions");
    System.out.println(board5.countSolutions());
  }
  catch (IllegalStateException e){
    System.out.println(e.getMessage());
  }
  }
}
