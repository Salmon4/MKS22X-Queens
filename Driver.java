public class Driver{
  public static void main(String[] args){
    QueenBoard newBoard = new QueenBoard(5);

    System.out.println(newBoard.toString());
    //newBoard.addQueen(4,4);
    //System.out.println(newBoard.toString());
    //newBoard.removeQueen(4,4);
    System.out.println(newBoard.toString());
    System.out.println(newBoard.solve());
    System.out.println(newBoard.toString());
  }
}
